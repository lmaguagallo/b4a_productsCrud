package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.productos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.productos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _bdd = "";
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba,String _bddnombre) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_bddnombre}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Initialize (BDDNombre As String)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="bdd = BDDNombre";
__ref._bdd /*String*/  = _bddnombre;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="sql.Initialize(File.DirInternal, bdd, True)";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),__ref._bdd /*String*/ ,__c.True);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS producto(id int primary key, descripcion text(50), precio numeric(10,2), stock numeric(10,2))");
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
return "";
}
public b4a.example.producto  _create(b4a.example.productos __ref,int _id,String _descripcion,double _precio,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "create", new Object[] {_id,_descripcion,_precio,_stock}));}
b4a.example.producto _item = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub create(id As Int, descripcion As String";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim item As Producto";
_item = new b4a.example.producto();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="item.Id_producto = id";
_item._id_producto /*int*/  = _id;
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="item.Descripcion = descripcion";
_item._descripcion /*String*/  = _descripcion;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="item.Precio_Unit = precio";
_item._precio_unit /*double*/  = _precio;
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="item.Stotk = stock";
_item._stotk /*double*/  = _stock;
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO producto(id, descr";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO producto(id, descripcion, precio, stock) VALUES (?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_descripcion),(Object)(_precio),(Object)(_stock)}));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="End Sub";
return null;
}
public String  _delete(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub delete( id As Int)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM producto WHERE id";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE FROM producto WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return "";
}
public b4a.example.producto  _read_one(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_one", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "read_one", new Object[] {_id}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _i = null;
b4a.example.producto _item = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub read_one(id As Int) As Producto";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim i As Cursor";
_i = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="i = sql.ExecQuery2(\"SELECT * FROM producto WHERE";
_i = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM producto WHERE id = ?",new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If i.RowCount < 1 Then";
if (_i.getRowCount()<1) { 
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 }else {
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="i.Position = 0";
_i.setPosition((int) (0));
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Dim item As Producto";
_item = new b4a.example.producto();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="item.Id_producto = id";
_item._id_producto /*int*/  = _id;
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="item.Descripcion = i.GetString(\"descripcion\")";
_item._descripcion /*String*/  = _i.GetString("descripcion");
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="item.Precio_Unit = i.GetDouble(\"precio\")";
_item._precio_unit /*double*/  = _i.GetDouble("precio");
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="item.Stotk = i.GetDouble(\"stock\")";
_item._stotk /*double*/  = _i.GetDouble("stock");
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Return item";
if (true) return _item;
 };
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _update(b4a.example.productos __ref,int _id,String _descripcion,double _precio,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "update", new Object[] {_id,_descripcion,_precio,_stock}));}
b4a.example.producto _item = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub update (id As Int, descripcion As Strin";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim item As Producto";
_item = new b4a.example.producto();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="item.Id_producto = id";
_item._id_producto /*int*/  = _id;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="item.Descripcion = descripcion";
_item._descripcion /*String*/  = _descripcion;
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="item.Precio_Unit = precio";
_item._precio_unit /*double*/  = _precio;
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="item.Stotk = stock";
_item._stotk /*double*/  = _stock;
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="sql.ExecNonQuery2( _ 	\"UPDATE producto SET descri";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE producto SET descripcion = ?, precio = ?, stock = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_descripcion),(Object)(_precio),(Object)(_stock),(Object)(_id)}));
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readbydescripcion(b4a.example.productos __ref,String _word) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "readbydescripcion", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readbydescripcion", new Object[] {_word}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
anywheresoftware.b4a.objects.collections.List _product_item = null;
int _i = 0;
b4a.example.producto _aux_prod = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub readByDescripcion( word As String) As L";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim product_item As List";
_product_item = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="product_item.Initialize()";
_product_item.Initialize();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="curs = sql.ExecQuery2(\"SELECT * FROM producto WHE";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM producto WHERE descripcion like ?",new String[]{"%"+_word+"%"})));
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="For i = 0 To curs.RowCount -1 Step 1";
{
final int step5 = 1;
final int limit5 = (int) (_curs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="curs.Position = i";
_curs.setPosition(_i);
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Dim aux_prod As Producto";
_aux_prod = new b4a.example.producto();
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="aux_prod.Id_producto = curs.GetInt(\"id\")";
_aux_prod._id_producto /*int*/  = _curs.GetInt("id");
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="aux_prod.Descripcion = curs.GetString(\"descripci";
_aux_prod._descripcion /*String*/  = _curs.GetString("descripcion");
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="aux_prod.Precio_Unit = curs.GetDouble(\"precio\")";
_aux_prod._precio_unit /*double*/  = _curs.GetDouble("precio");
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="aux_prod.Stotk = curs.GetDouble(\"stock\")";
_aux_prod._stotk /*double*/  = _curs.GetDouble("stock");
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="product_item.Add(aux_prod)";
_product_item.Add((Object)(_aux_prod));
 }
};
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="Return product_item";
if (true) return _product_item;
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Public bdd As String";
_bdd = "";
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
}