package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.b4xpilotpage _p2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn1_connect = null;
public anywheresoftware.b4a.objects.EditTextWrapper _text1_remote_ip = null;
public anywheresoftware.b4a.objects.EditTextWrapper _text2_remote_port = null;
public anywheresoftware.b4a.objects.EditTextWrapper _text3_listen_port = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6_msg = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 26;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 30;BA.debugLine="p2.Initialize";
_p2._initialize /*String*/ (ba);
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.AddPage(\"page2\", p2)";
_b4xpages._addpage /*String*/ (ba,"page2",(Object)(_p2));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _btn1_connect_click() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub btn1_connect_Click";
 //BA.debugLineNum = 40;BA.debugLine="If Not(IsValidIPv4Address(text1_remote_ip.Text))";
if (__c.Not(_isvalidipv4address(_text1_remote_ip.getText()))) { 
 //BA.debugLineNum = 41;BA.debugLine="Label6_msg.Text = \"Wrong remote IP address\"";
_label6_msg.setText(BA.ObjectToCharSequence("Wrong remote IP address"));
 }else if(__c.Not((double)(Double.parseDouble(_text2_remote_port.getText()))>0 && (double)(Double.parseDouble(_text2_remote_port.getText()))<=65535)) { 
 //BA.debugLineNum = 43;BA.debugLine="Label6_msg.Text = \"Wrong remote port (1 - 65535)";
_label6_msg.setText(BA.ObjectToCharSequence("Wrong remote port (1 - 65535)"));
 }else if(__c.Not((double)(Double.parseDouble(_text3_listen_port.getText()))>=0 && (double)(Double.parseDouble(_text3_listen_port.getText()))<=65535)) { 
 //BA.debugLineNum = 45;BA.debugLine="Label6_msg.Text = \"Wrong listen port (0 - 65535)";
_label6_msg.setText(BA.ObjectToCharSequence("Wrong listen port (0 - 65535)"));
 }else {
 //BA.debugLineNum = 47;BA.debugLine="Label6_msg.Text = \"\"";
_label6_msg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 48;BA.debugLine="Main.Remote_ip = text1_remote_ip.Text";
_main._remote_ip /*String*/  = _text1_remote_ip.getText();
 //BA.debugLineNum = 49;BA.debugLine="Main.Remote_port = text2_remote_port.Text";
_main._remote_port /*int*/  = (int)(Double.parseDouble(_text2_remote_port.getText()));
 //BA.debugLineNum = 50;BA.debugLine="Main.Listen_port = text3_listen_port.Text";
_main._listen_port /*int*/  = (int)(Double.parseDouble(_text3_listen_port.getText()));
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.ShowPage(\"page2\")";
_b4xpages._showpage /*String*/ (ba,"page2");
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private p2 As B4XPilotPage";
_p2 = new b4a.example.b4xpilotpage();
 //BA.debugLineNum = 12;BA.debugLine="Private btn1_connect As Button";
_btn1_connect = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private text1_remote_ip As EditText";
_text1_remote_ip = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private text2_remote_port As EditText";
_text2_remote_port = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private text3_listen_port As EditText";
_text3_listen_port = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Label6_msg As Label";
_label6_msg = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalidipv4address(String _ipaddress) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub IsValidIPv4Address(IPAddress As String)";
 //BA.debugLineNum = 36;BA.debugLine="Return Regex.IsMatch(\"^(([01]?\\d\\d?|2[0-4]\\d|25[0";
if (true) return __c.Regex.IsMatch("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$",_ipaddress);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
