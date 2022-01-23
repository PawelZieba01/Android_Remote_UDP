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
public anywheresoftware.b4a.objects.ButtonWrapper _btn1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label_1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label_2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label_xy = null;
public joystickwrapper.joystickWrapper _joystick = null;
public boolean _btn1_state = false;
public boolean _btn2_state = false;
public boolean _btn3_state = false;
public anywheresoftware.b4a.objects.collections.Map _mydata = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
public byte[] _data = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 38;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 39;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 42;BA.debugLine="JoyStick.ButtonColor = Colors.Cyan";
_joystick.setButtonColor(__c.Colors.Cyan);
 //BA.debugLineNum = 43;BA.debugLine="JoyStick.PadColor = Colors.Gray";
_joystick.setPadColor(__c.Colors.Gray);
 //BA.debugLineNum = 44;BA.debugLine="btn1.Color = Colors.Cyan";
_btn1.setColor(__c.Colors.Cyan);
 //BA.debugLineNum = 45;BA.debugLine="btn2.Color = Colors.Cyan";
_btn2.setColor(__c.Colors.Cyan);
 //BA.debugLineNum = 46;BA.debugLine="btn3.Color = Colors.Cyan";
_btn3.setColor(__c.Colors.Cyan);
 //BA.debugLineNum = 48;BA.debugLine="UDPSocket1.Initialize(\"UDP\", 1901, 255)";
_udpsocket1.Initialize(ba,"UDP",(int) (1901),(int) (255));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _btn1_click() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Private Sub btn1_Click";
 //BA.debugLineNum = 62;BA.debugLine="btn1_state = Not(btn1_state)";
_btn1_state = __c.Not(_btn1_state);
 //BA.debugLineNum = 63;BA.debugLine="Log(btn1_state)";
__c.LogImpl("0851970",BA.ObjectToString(_btn1_state),0);
 //BA.debugLineNum = 65;BA.debugLine="If btn1_state Then";
if (_btn1_state) { 
 //BA.debugLineNum = 66;BA.debugLine="btn1.Color = Colors.Magenta";
_btn1.setColor(__c.Colors.Magenta);
 //BA.debugLineNum = 67;BA.debugLine="btn1.Text = \"ON\"";
_btn1.setText(BA.ObjectToCharSequence("ON"));
 }else {
 //BA.debugLineNum = 69;BA.debugLine="btn1.Color = Colors.Cyan";
_btn1.setColor(__c.Colors.Cyan);
 //BA.debugLineNum = 70;BA.debugLine="btn1.Text = \"OFF\"";
_btn1.setText(BA.ObjectToCharSequence("OFF"));
 };
 //BA.debugLineNum = 73;BA.debugLine="MyData.Put(\"Btn1_state\", btn1_state)";
_mydata.Put((Object)("Btn1_state"),(Object)(_btn1_state));
 //BA.debugLineNum = 74;BA.debugLine="Send_UDP_Data";
_send_udp_data();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _btn2_click() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Private Sub btn2_Click";
 //BA.debugLineNum = 79;BA.debugLine="btn2_state = Not(btn2_state)";
_btn2_state = __c.Not(_btn2_state);
 //BA.debugLineNum = 80;BA.debugLine="Log(btn2_state)";
__c.LogImpl("0917506",BA.ObjectToString(_btn2_state),0);
 //BA.debugLineNum = 82;BA.debugLine="If btn2_state Then";
if (_btn2_state) { 
 //BA.debugLineNum = 83;BA.debugLine="btn2.Color = Colors.Magenta";
_btn2.setColor(__c.Colors.Magenta);
 //BA.debugLineNum = 84;BA.debugLine="btn2.Text = \"ON\"";
_btn2.setText(BA.ObjectToCharSequence("ON"));
 }else {
 //BA.debugLineNum = 86;BA.debugLine="btn2.Color = Colors.Cyan";
_btn2.setColor(__c.Colors.Cyan);
 //BA.debugLineNum = 87;BA.debugLine="btn2.Text = \"0FF\"";
_btn2.setText(BA.ObjectToCharSequence("0FF"));
 };
 //BA.debugLineNum = 90;BA.debugLine="MyData.Put(\"Btn2_state\", btn2_state)";
_mydata.Put((Object)("Btn2_state"),(Object)(_btn2_state));
 //BA.debugLineNum = 91;BA.debugLine="Send_UDP_Data";
_send_udp_data();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _btn3_click() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub btn3_Click";
 //BA.debugLineNum = 95;BA.debugLine="btn3_state = Not(btn3_state)";
_btn3_state = __c.Not(_btn3_state);
 //BA.debugLineNum = 96;BA.debugLine="Log(btn3_state)";
__c.LogImpl("0983042",BA.ObjectToString(_btn3_state),0);
 //BA.debugLineNum = 98;BA.debugLine="If btn3_state Then";
if (_btn3_state) { 
 //BA.debugLineNum = 99;BA.debugLine="btn3.Color = Colors.Magenta";
_btn3.setColor(__c.Colors.Magenta);
 //BA.debugLineNum = 100;BA.debugLine="btn3.Text = \"ON\"";
_btn3.setText(BA.ObjectToCharSequence("ON"));
 }else {
 //BA.debugLineNum = 102;BA.debugLine="btn3.Color = Colors.Cyan";
_btn3.setColor(__c.Colors.Cyan);
 //BA.debugLineNum = 103;BA.debugLine="btn3.Text = \"OFF\"";
_btn3.setText(BA.ObjectToCharSequence("OFF"));
 };
 //BA.debugLineNum = 106;BA.debugLine="MyData.Put(\"Btn3_state\", btn3_state)";
_mydata.Put((Object)("Btn3_state"),(Object)(_btn3_state));
 //BA.debugLineNum = 107;BA.debugLine="Send_UDP_Data";
_send_udp_data();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private btn1 As Button";
_btn1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btn2 As Button";
_btn2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private btn3 As Button";
_btn3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Label_1 As Label";
_label_1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private Label_2 As Label";
_label_2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Label_xy As Label";
_label_xy = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private JoyStick As JoyStick";
_joystick = new joystickwrapper.joystickWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private btn1_state As Boolean = False";
_btn1_state = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Private btn2_state As Boolean = False";
_btn2_state = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Private btn3_state As Boolean = False";
_btn3_state = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Dim MyData As Map = CreateMap(\"Pos_X\":0, \"Pos_Y\":";
_mydata = new anywheresoftware.b4a.objects.collections.Map();
_mydata = __c.createMap(new Object[] {(Object)("Pos_X"),(Object)(0),(Object)("Pos_Y"),(Object)(0),(Object)("Btn1_state"),(Object)(__c.False),(Object)("Btn2_state"),(Object)(__c.False),(Object)("Btn3_state"),(Object)(__c.False)});
 //BA.debugLineNum = 24;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 25;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 26;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 27;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _joystick_value_changed(double _angle,double _angledegrees,double _powr) throws Exception{
int _pos_x = 0;
int _pos_y = 0;
 //BA.debugLineNum = 112;BA.debugLine="Private Sub JoyStick_value_changed(angle As Double";
 //BA.debugLineNum = 113;BA.debugLine="Dim Pos_X As Int = Round(CosD(angleDegrees)*-powr";
_pos_x = (int) (__c.Round(__c.CosD(_angledegrees)*-_powr));
 //BA.debugLineNum = 114;BA.debugLine="Dim Pos_Y As Int = Round(SinD(angleDegrees)*powr)";
_pos_y = (int) (__c.Round(__c.SinD(_angledegrees)*_powr));
 //BA.debugLineNum = 116;BA.debugLine="Label_1.Text = \"Angle: \" & Round(angleDegrees)";
_label_1.setText(BA.ObjectToCharSequence("Angle: "+BA.NumberToString(__c.Round(_angledegrees))));
 //BA.debugLineNum = 117;BA.debugLine="Label_2.Text = \"Power: \" & Round(powr)";
_label_2.setText(BA.ObjectToCharSequence("Power: "+BA.NumberToString(__c.Round(_powr))));
 //BA.debugLineNum = 118;BA.debugLine="Label_xy.Text = \"X: \" & Pos_X & \"   Y: \" & Pos_Y";
_label_xy.setText(BA.ObjectToCharSequence("X: "+BA.NumberToString(_pos_x)+"   Y: "+BA.NumberToString(_pos_y)));
 //BA.debugLineNum = 120;BA.debugLine="If angleDegrees == 0 And powr == 0 Then";
if (_angledegrees==0 && _powr==0) { 
 //BA.debugLineNum = 121;BA.debugLine="JoyStick.ButtonColor = Colors.Cyan";
_joystick.setButtonColor(__c.Colors.Cyan);
 }else {
 //BA.debugLineNum = 123;BA.debugLine="JoyStick.ButtonColor = Colors.Magenta";
_joystick.setButtonColor(__c.Colors.Magenta);
 };
 //BA.debugLineNum = 126;BA.debugLine="MyData.Put(\"Pos_X\", Pos_X)";
_mydata.Put((Object)("Pos_X"),(Object)(_pos_x));
 //BA.debugLineNum = 127;BA.debugLine="MyData.Put(\"Pos_Y\", Pos_Y)";
_mydata.Put((Object)("Pos_Y"),(Object)(_pos_y));
 //BA.debugLineNum = 129;BA.debugLine="Send_UDP_Data";
_send_udp_data();
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _send_udp_data() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Private Sub Send_UDP_Data";
 //BA.debugLineNum = 54;BA.debugLine="JSONGenerator.Initialize(MyData)";
_jsongenerator.Initialize(_mydata);
 //BA.debugLineNum = 55;BA.debugLine="data = JSONGenerator.ToString.GetBytes(\"UTF8\")";
_data = _jsongenerator.ToString().getBytes("UTF8");
 //BA.debugLineNum = 57;BA.debugLine="Packet.Initialize(data, \"192.168.4.1\", 1900)";
_packet.Initialize(_data,"192.168.4.1",(int) (1900));
 //BA.debugLineNum = 58;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
