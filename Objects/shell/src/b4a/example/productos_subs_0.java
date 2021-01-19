package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public bdd As String";
productos._bdd = RemoteObject.createImmutable("");__ref.setField("_bdd",productos._bdd);
 //BA.debugLineNum = 4;BA.debugLine="Private sql As SQL";
productos._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql",productos._sql);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _descripcion,RemoteObject _precio,RemoteObject _stock) throws Exception{
try {
		Debug.PushSubsStack("create (productos) ","productos",3,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productos","create", __ref, _id, _descripcion, _precio, _stock);}
RemoteObject _item = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
Debug.locals.put("descripcion", _descripcion);
Debug.locals.put("precio", _precio);
Debug.locals.put("stock", _stock);
 BA.debugLineNum = 19;BA.debugLine="Public Sub create(id As Int, descripcion As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Dim item As Producto";
Debug.ShouldStop(524288);
_item = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("item", _item);
 BA.debugLineNum = 21;BA.debugLine="item.Id_producto = id";
Debug.ShouldStop(1048576);
_item.setField ("_id_producto" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 22;BA.debugLine="item.Descripcion = descripcion";
Debug.ShouldStop(2097152);
_item.setField ("_descripcion" /*RemoteObject*/ ,_descripcion);
 BA.debugLineNum = 23;BA.debugLine="item.Precio_Unit = precio";
Debug.ShouldStop(4194304);
_item.setField ("_precio_unit" /*RemoteObject*/ ,_precio);
 BA.debugLineNum = 24;BA.debugLine="item.Stotk = stock";
Debug.ShouldStop(8388608);
_item.setField ("_stotk" /*RemoteObject*/ ,_stock);
 BA.debugLineNum = 26;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO producto(id, descr";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO producto(id, descripcion, precio, stock) VALUES (?,?,?,?)")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_id),(_descripcion),(_precio),(_stock)})))));
 BA.debugLineNum = 29;BA.debugLine="Return item";
Debug.ShouldStop(268435456);
if (true) return _item;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("delete (productos) ","productos",3,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productos","delete", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 86;BA.debugLine="Public Sub delete( id As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM producto WHERE id";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM producto WHERE id = ?")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _bddnombre) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productos) ","productos",3,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productos","initialize", __ref, _ba, _bddnombre);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("BDDNombre", _bddnombre);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize (BDDNombre As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="bdd = BDDNombre";
Debug.ShouldStop(1024);
__ref.setField ("_bdd" /*RemoteObject*/ ,_bddnombre);
 BA.debugLineNum = 13;BA.debugLine="sql.Initialize(File.DirInternal, bdd, True)";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(productos.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_bdd" /*RemoteObject*/ )),(Object)(productos.__c.getField(true,"True")));
 BA.debugLineNum = 15;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS producto(id int primary key, descripcion text(50), precio numeric(10,2), stock numeric(10,2))")));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_one(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("read_one (productos) ","productos",3,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("read_one")) { return __ref.runUserSub(false, "productos","read_one", __ref, _id);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
 BA.debugLineNum = 32;BA.debugLine="Public Sub read_one(id As Int) As Producto";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Dim i As Cursor";
Debug.ShouldStop(1);
_i = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 34;BA.debugLine="i = sql.ExecQuery2(\"SELECT * FROM producto WHERE";
Debug.ShouldStop(2);
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM producto WHERE id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)}))));
 BA.debugLineNum = 35;BA.debugLine="If i.RowCount < 1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_i.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 36;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) return (productos.__c.getField(false,"Null"));
 }else {
 BA.debugLineNum = 38;BA.debugLine="i.Position = 0";
Debug.ShouldStop(32);
_i.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 39;BA.debugLine="Dim item As Producto";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("item", _item);
 BA.debugLineNum = 40;BA.debugLine="item.Id_producto = id";
Debug.ShouldStop(128);
_item.setField ("_id_producto" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 41;BA.debugLine="item.Descripcion = i.GetString(\"descripcion\")";
Debug.ShouldStop(256);
_item.setField ("_descripcion" /*RemoteObject*/ ,_i.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("descripcion"))));
 BA.debugLineNum = 42;BA.debugLine="item.Precio_Unit = i.GetDouble(\"precio\")";
Debug.ShouldStop(512);
_item.setField ("_precio_unit" /*RemoteObject*/ ,_i.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precio"))));
 BA.debugLineNum = 43;BA.debugLine="item.Stotk = i.GetDouble(\"stock\")";
Debug.ShouldStop(1024);
_item.setField ("_stotk" /*RemoteObject*/ ,_i.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 BA.debugLineNum = 44;BA.debugLine="Return item";
Debug.ShouldStop(2048);
if (true) return _item;
 };
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbydescripcion(RemoteObject __ref,RemoteObject _word) throws Exception{
try {
		Debug.PushSubsStack("readByDescripcion (productos) ","productos",3,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("readbydescripcion")) { return __ref.runUserSub(false, "productos","readbydescripcion", __ref, _word);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _product_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _aux_prod = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("word", _word);
 BA.debugLineNum = 48;BA.debugLine="Public Sub readByDescripcion( word As String) As L";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim curs As Cursor";
Debug.ShouldStop(65536);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("curs", _curs);
 BA.debugLineNum = 50;BA.debugLine="Dim product_item As List";
Debug.ShouldStop(131072);
_product_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("product_item", _product_item);
 BA.debugLineNum = 51;BA.debugLine="product_item.Initialize()";
Debug.ShouldStop(262144);
_product_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="curs = sql.ExecQuery2(\"SELECT * FROM producto WHE";
Debug.ShouldStop(1048576);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM producto WHERE descripcion like ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.concat(RemoteObject.createImmutable("%"),_word,RemoteObject.createImmutable("%"))}))));
 BA.debugLineNum = 55;BA.debugLine="For i = 0 To curs.RowCount -1 Step 1";
Debug.ShouldStop(4194304);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="curs.Position = i";
Debug.ShouldStop(8388608);
_curs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 58;BA.debugLine="Dim aux_prod As Producto";
Debug.ShouldStop(33554432);
_aux_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("aux_prod", _aux_prod);
 BA.debugLineNum = 60;BA.debugLine="aux_prod.Id_producto = curs.GetInt(\"id\")";
Debug.ShouldStop(134217728);
_aux_prod.setField ("_id_producto" /*RemoteObject*/ ,_curs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 61;BA.debugLine="aux_prod.Descripcion = curs.GetString(\"descripci";
Debug.ShouldStop(268435456);
_aux_prod.setField ("_descripcion" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("descripcion"))));
 BA.debugLineNum = 62;BA.debugLine="aux_prod.Precio_Unit = curs.GetDouble(\"precio\")";
Debug.ShouldStop(536870912);
_aux_prod.setField ("_precio_unit" /*RemoteObject*/ ,_curs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precio"))));
 BA.debugLineNum = 63;BA.debugLine="aux_prod.Stotk = curs.GetDouble(\"stock\")";
Debug.ShouldStop(1073741824);
_aux_prod.setField ("_stotk" /*RemoteObject*/ ,_curs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 BA.debugLineNum = 65;BA.debugLine="product_item.Add(aux_prod)";
Debug.ShouldStop(1);
_product_item.runVoidMethod ("Add",(Object)((_aux_prod)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="Return product_item";
Debug.ShouldStop(8);
if (true) return _product_item;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _descripcion,RemoteObject _precio,RemoteObject _stock) throws Exception{
try {
		Debug.PushSubsStack("update (productos) ","productos",3,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productos","update", __ref, _id, _descripcion, _precio, _stock);}
RemoteObject _item = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
Debug.locals.put("descripcion", _descripcion);
Debug.locals.put("precio", _precio);
Debug.locals.put("stock", _stock);
 BA.debugLineNum = 71;BA.debugLine="Public Sub update (id As Int, descripcion As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim item As Producto";
Debug.ShouldStop(128);
_item = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("item", _item);
 BA.debugLineNum = 73;BA.debugLine="item.Id_producto = id";
Debug.ShouldStop(256);
_item.setField ("_id_producto" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 74;BA.debugLine="item.Descripcion = descripcion";
Debug.ShouldStop(512);
_item.setField ("_descripcion" /*RemoteObject*/ ,_descripcion);
 BA.debugLineNum = 75;BA.debugLine="item.Precio_Unit = precio";
Debug.ShouldStop(1024);
_item.setField ("_precio_unit" /*RemoteObject*/ ,_precio);
 BA.debugLineNum = 76;BA.debugLine="item.Stotk = stock";
Debug.ShouldStop(2048);
_item.setField ("_stotk" /*RemoteObject*/ ,_stock);
 BA.debugLineNum = 78;BA.debugLine="sql.ExecNonQuery2( _ 	\"UPDATE producto SET descri";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE producto SET descripcion = ?, precio = ?, stock = ? WHERE id = ?")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_descripcion),(_precio),(_stock),(_id)})))));
 BA.debugLineNum = 82;BA.debugLine="Return item";
Debug.ShouldStop(131072);
if (true) return _item;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}