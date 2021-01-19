
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class producto {
    public static RemoteObject myClass;
	public producto() {
	}
    public static PCBA staticBA = new PCBA(null, producto.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id_producto = RemoteObject.createImmutable(0);
public static RemoteObject _descripcion = RemoteObject.createImmutable("");
public static RemoteObject _precio_unit = RemoteObject.createImmutable(0);
public static RemoteObject _stotk = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Descripcion",_ref.getField(false, "_descripcion"),"Id_producto",_ref.getField(false, "_id_producto"),"Precio_Unit",_ref.getField(false, "_precio_unit"),"Stotk",_ref.getField(false, "_stotk")};
}
}