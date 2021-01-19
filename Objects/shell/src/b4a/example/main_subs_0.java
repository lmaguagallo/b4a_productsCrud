package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(2);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="p.Initialize(\"inventario.sqlite\")";
Debug.ShouldStop(32);
main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("inventario.sqlite")));
 BA.debugLineNum = 43;BA.debugLine="view_ProductList";
Debug.ShouldStop(1024);
_view_productlist();
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_create_click() throws Exception{
try {
		Debug.PushSubsStack("btn_create_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,107);
if (RapidSub.canDelegate("btn_create_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_create_click");}
 BA.debugLineNum = 107;BA.debugLine="Private Sub btn_create_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="p.create(txt_id.Text, txt_descrip.Text, txt_preci";
Debug.ShouldStop(2048);
main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txt_id.runMethod(true,"getText"))),(Object)(main.mostCurrent._txt_descrip.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txt_precio.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txt_stock.runMethod(true,"getText"))));
 BA.debugLineNum = 109;BA.debugLine="MsgboxAsync(\"Registro insertado!\", \"OK\")";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro insertado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.processBA);
 BA.debugLineNum = 110;BA.debugLine="lst_producto.Clear";
Debug.ShouldStop(8192);
main.mostCurrent._lst_producto.runVoidMethod ("Clear");
 BA.debugLineNum = 111;BA.debugLine="view_ProductList";
Debug.ShouldStop(16384);
_view_productlist();
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_delete_click() throws Exception{
try {
		Debug.PushSubsStack("btn_delete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("btn_delete_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_delete_click");}
 BA.debugLineNum = 72;BA.debugLine="Private Sub btn_delete_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="p.delete(txt_id.Text)";
Debug.ShouldStop(256);
main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txt_id.runMethod(true,"getText"))));
 BA.debugLineNum = 74;BA.debugLine="MsgboxAsync(\"Registro eliminado!\", \"OK\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro eliminado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.processBA);
 BA.debugLineNum = 75;BA.debugLine="txt_id.Text = \"\"";
Debug.ShouldStop(1024);
main.mostCurrent._txt_id.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 76;BA.debugLine="txt_descrip.Text =\"\"";
Debug.ShouldStop(2048);
main.mostCurrent._txt_descrip.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 77;BA.debugLine="txt_precio.Text =\"\"";
Debug.ShouldStop(4096);
main.mostCurrent._txt_precio.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 78;BA.debugLine="txt_stock.Text = \"\"";
Debug.ShouldStop(8192);
main.mostCurrent._txt_stock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 80;BA.debugLine="lst_producto.Clear";
Debug.ShouldStop(32768);
main.mostCurrent._lst_producto.runVoidMethod ("Clear");
 BA.debugLineNum = 81;BA.debugLine="view_ProductList";
Debug.ShouldStop(65536);
_view_productlist();
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_readone_click() throws Exception{
try {
		Debug.PushSubsStack("btn_readOne_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("btn_readone_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_readone_click");}
RemoteObject _items = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 93;BA.debugLine="Private Sub btn_readOne_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim items As Producto = p.read_one(txt_id.Text)";
Debug.ShouldStop(536870912);
_items = main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_read_one" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txt_id.runMethod(true,"getText"))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 96;BA.debugLine="If items = Null Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("n",_items)) { 
 BA.debugLineNum = 97;BA.debugLine="MsgboxAsync(\"Registro no encontrado!\", \"Ups\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro no encontrado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ups"))),main.processBA);
 }else {
 BA.debugLineNum = 99;BA.debugLine="txt_descrip.Text = items.Descripcion";
Debug.ShouldStop(4);
main.mostCurrent._txt_descrip.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_items.getField(true,"_descripcion" /*RemoteObject*/ )));
 BA.debugLineNum = 100;BA.debugLine="txt_precio.Text = items.Precio_Unit";
Debug.ShouldStop(8);
main.mostCurrent._txt_precio.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_items.getField(true,"_precio_unit" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="txt_stock.Text = items.Stotk";
Debug.ShouldStop(16);
main.mostCurrent._txt_stock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_items.getField(true,"_stotk" /*RemoteObject*/ )));
 BA.debugLineNum = 102;BA.debugLine="MsgboxAsync(\"Registro encontrado!\", \"OK\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro encontrado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.processBA);
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_update_click() throws Exception{
try {
		Debug.PushSubsStack("btn_update_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("btn_update_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_update_click");}
 BA.debugLineNum = 85;BA.debugLine="Private Sub btn_update_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="p.update(txt_id.Text, txt_descrip.Text, txt_preci";
Debug.ShouldStop(2097152);
main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txt_id.runMethod(true,"getText"))),(Object)(main.mostCurrent._txt_descrip.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txt_precio.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txt_stock.runMethod(true,"getText"))));
 BA.debugLineNum = 87;BA.debugLine="MsgboxAsync(\"Registro actualizado!\", \"OK\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro actualizado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.processBA);
 BA.debugLineNum = 88;BA.debugLine="lst_producto.Clear";
Debug.ShouldStop(8388608);
main.mostCurrent._lst_producto.runVoidMethod ("Clear");
 BA.debugLineNum = 89;BA.debugLine="view_ProductList";
Debug.ShouldStop(16777216);
_view_productlist();
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 54;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(4194304);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private txt_id As EditText";
main.mostCurrent._txt_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txt_descrip As EditText";
main.mostCurrent._txt_descrip = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txt_precio As EditText";
main.mostCurrent._txt_precio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txt_stock As EditText";
main.mostCurrent._txt_stock = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lst_producto As ListView";
main.mostCurrent._lst_producto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim p As Productos 'Manager de productos";
main.mostCurrent._p = RemoteObject.createNew ("b4a.example.productos");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
producto.myClass = BA.getDeviceClass ("b4a.example.producto");
productos.myClass = BA.getDeviceClass ("b4a.example.productos");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _view_productlist() throws Exception{
try {
		Debug.PushSubsStack("view_ProductList (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("view_productlist")) { return b4a.example.main.remoteMe.runUserSub(false, "main","view_productlist");}
RemoteObject _product_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 58;BA.debugLine="Private Sub view_ProductList";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Dim product_item As List";
Debug.ShouldStop(67108864);
_product_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("product_item", _product_item);
 BA.debugLineNum = 61;BA.debugLine="product_item = p.readByDescripcion(\"\")";
Debug.ShouldStop(268435456);
_product_item = main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_readbydescripcion" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("product_item", _product_item);
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To product_item.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_product_item.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="Dim prod  As Producto";
Debug.ShouldStop(-2147483648);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 65;BA.debugLine="prod = product_item.Get(i)";
Debug.ShouldStop(1);
_prod = (_product_item.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("prod", _prod);
 BA.debugLineNum = 67;BA.debugLine="lst_producto.AddTwoLines2( prod.Descripcion, pro";
Debug.ShouldStop(4);
main.mostCurrent._lst_producto.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_prod.getField(true,"_descripcion" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence(_prod.getField(true,"_precio_unit" /*RemoteObject*/ ))),(Object)((_prod.getField(true,"_stotk" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}