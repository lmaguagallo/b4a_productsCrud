package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class producto extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.producto");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.producto.class).invoke(this, new Object[] {null});
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
public int _id_producto = 0;
public String _descripcion = "";
public double _precio_unit = 0;
public double _stotk = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _class_globals(b4a.example.producto __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="producto";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Public Id_producto As Int";
_id_producto = 0;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Public Descripcion As String";
_descripcion = "";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Public Precio_Unit As Double";
_precio_unit = 0;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Public Stotk As Double";
_stotk = 0;
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.producto __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="producto";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}