B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@
Sub Class_Globals
	' Clase de persistencia
	Public bdd As String
	Private sql As SQL
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (BDDNombre As String)
	bdd = BDDNombre
	' Se crea si no existe en un directorio de privado de la aplicacion
	sql.Initialize(File.DirInternal, bdd, True)
	
	sql.ExecNonQuery("CREATE TABLE IF NOT EXISTS producto(id int primary key, descripcion text(50), precio numeric(10,2), stock numeric(10,2))")
	
End Sub

Public Sub create(id As Int, descripcion As String, precio As Double, stock As Double) As Producto
	Dim item As Producto
	item.Id_producto = id
	item.Descripcion = descripcion
	item.Precio_Unit = precio
	item.Stotk = stock
	
	sql.ExecNonQuery2("INSERT INTO producto(id, descripcion, precio, stock) VALUES (?,?,?,?)", _
	Array As Object(id, descripcion, precio, stock))
	
	Return item	
End Sub

Public Sub read_one(id As Int) As Producto
	Dim i As Cursor
	i = sql.ExecQuery2("SELECT * FROM producto WHERE id = ?", Array As String(id))
	If i.RowCount < 1 Then
		Return Null
	Else
		i.Position = 0
		Dim item As Producto
		item.Id_producto = id
		item.Descripcion = i.GetString("descripcion")
		item.Precio_Unit = i.GetDouble("precio")
		item.Stotk = i.GetDouble("stock")
		Return item
	End If
End Sub

Public Sub readByDescripcion( word As String) As List 
	Dim curs As Cursor
	Dim product_item As List
	product_item.Initialize()
	
	curs = sql.ExecQuery2("SELECT * FROM producto WHERE descripcion like ?", Array As String("%" & word & "%"))
	
	For i = 0 To curs.RowCount -1 Step 1
		curs.Position = i
		
		Dim aux_prod As Producto
		
		aux_prod.Id_producto = curs.GetInt("id")
		aux_prod.Descripcion = curs.GetString("descripcion")
		aux_prod.Precio_Unit = curs.GetDouble("precio")
		aux_prod.Stotk = curs.GetDouble("stock")
		
		product_item.Add(aux_prod)
	Next
	
	Return product_item
End Sub

Public Sub update (id As Int, descripcion As String, precio As Double, stock As Double) As Producto
	Dim item As Producto
	item.Id_producto = id
	item.Descripcion = descripcion
	item.Precio_Unit = precio
	item.Stotk = stock
	
	sql.ExecNonQuery2( _
	"UPDATE producto SET descripcion = ?, precio = ?, stock = ? WHERE id = ?", _
	Array As Object(descripcion, precio, stock, id))
	
	Return item
	
End Sub

Public Sub delete( id As Int)
	sql.ExecNonQuery2("DELETE FROM producto WHERE id = ?", Array As Object(id))
	
End Sub