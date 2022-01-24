package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class assectionedslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.assectionedslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.assectionedslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public int _mselectedsection = 0;
public int _msections = 0;
public boolean _mvertical = false;
public float _mdividerheight = 0f;
public int _mbackgroundcolor = 0;
public int _mselectedsectioncolor = 0;
public int _mdividercolor = 0;
public boolean _mround = false;
public float _mcornerradius = 0f;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 69;BA.debugLine="cvs.Resize(Width, Height)";
_cvs.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 70;BA.debugLine="TouchPanel.SetLayoutAnimated(0,0,0, Width, Height";
_touchpanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 71;BA.debugLine="mVertical = mBase.Height > mBase.Width";
_mvertical = _mbase.getHeight()>_mbase.getWidth();
 //BA.debugLineNum = 72;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 73;BA.debugLine="SetCircleClip(mBase,IIf(mRound = True,IIf(mVertic";
_setcircleclip(_mbase,(float)(BA.ObjectToNumber(((_mround==__c.True) ? (((_mvertical==__c.True) ? ((Object)(_width/(double)2)) : ((Object)(_height/(double)2)))) : ((Object)(_mcornerradius))))));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 23;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 25;BA.debugLine="Private mSelectedSection As Int = 0";
_mselectedsection = (int) (0);
 //BA.debugLineNum = 26;BA.debugLine="Private mSections As Int";
_msections = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private mVertical As Boolean";
_mvertical = false;
 //BA.debugLineNum = 28;BA.debugLine="Private mDividerHeight As Float";
_mdividerheight = 0f;
 //BA.debugLineNum = 29;BA.debugLine="Private mBackgroundColor As Int";
_mbackgroundcolor = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private mSelectedSectionColor As Int";
_mselectedsectioncolor = 0;
 //BA.debugLineNum = 31;BA.debugLine="Private mDividerColor As Int";
_mdividercolor = 0;
 //BA.debugLineNum = 33;BA.debugLine="Private mRound As Boolean";
_mround = false;
 //BA.debugLineNum = 34;BA.debugLine="Private mCornerRadius As Float";
_mcornerradius = 0f;
 //BA.debugLineNum = 36;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 37;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 47;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 48;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 49;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 50;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
_mbackgroundcolor = _xui.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 51;BA.debugLine="mSelectedSectionColor = xui.PaintOrColorToColor(P";
_mselectedsectioncolor = _xui.PaintOrColorToColor(_props.Get((Object)("SelectedSectionColor")));
 //BA.debugLineNum = 52;BA.debugLine="mDividerColor = xui.PaintOrColorToColor(Props.Get";
_mdividercolor = _xui.PaintOrColorToColor(_props.Get((Object)("DividerColor")));
 //BA.debugLineNum = 53;BA.debugLine="mDividerHeight = Props.Get(\"DividerHeight\")";
_mdividerheight = (float)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))));
 //BA.debugLineNum = 54;BA.debugLine="mSections = Props.Get(\"Sections\")";
_msections = (int)(BA.ObjectToNumber(_props.Get((Object)("Sections"))));
 //BA.debugLineNum = 55;BA.debugLine="mRound = Props.Get(\"Round\")";
_mround = BA.ObjectToBoolean(_props.Get((Object)("Round")));
 //BA.debugLineNum = 56;BA.debugLine="mCornerRadius = Props.Get(\"CornerRadius\")";
_mcornerradius = (float)(BA.ObjectToNumber(_props.Get((Object)("CornerRadius"))));
 //BA.debugLineNum = 58;BA.debugLine="mBase.Color = xui.Color_Transparent'mBackgroundCo";
_mbase.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 60;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_touchpanel = _xui.CreatePanel(ba,"TouchPanel");
 //BA.debugLineNum = 61;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
_mbase.AddView((android.view.View)(_touchpanel.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 62;BA.debugLine="cvs.Initialize(TouchPanel)";
_cvs.Initialize(_touchpanel);
 //BA.debugLineNum = 64;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public int  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Public Sub getBackgroundColor As Int";
 //BA.debugLineNum = 174;BA.debugLine="Return mBackgroundColor";
if (true) return _mbackgroundcolor;
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return 0;
}
public float  _getcornerradius() throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Public Sub getCornerRadius As Float";
 //BA.debugLineNum = 201;BA.debugLine="Return mCornerRadius";
if (true) return _mcornerradius;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return 0f;
}
public int  _getdividercolor() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Public Sub getDividerColor As Int";
 //BA.debugLineNum = 192;BA.debugLine="Return mDividerColor";
if (true) return _mdividercolor;
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return 0;
}
public float  _getdividerheight() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Public Sub getDividerHeight As Float";
 //BA.debugLineNum = 165;BA.debugLine="Return mDividerHeight";
if (true) return _mdividerheight;
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return 0f;
}
public int  _getsections() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub getSections As Int";
 //BA.debugLineNum = 156;BA.debugLine="Return mSections";
if (true) return _msections;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedsection() throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Public Sub getSelectedSection As Int";
 //BA.debugLineNum = 147;BA.debugLine="Return mSelectedSection";
if (true) return _mselectedsection;
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedsectioncolor() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub getSelectedSectionColor As Int";
 //BA.debugLineNum = 183;BA.debugLine="Return mSelectedSectionColor";
if (true) return _mselectedsectioncolor;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 41;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 42;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Public Sub setBackgroundColor(Color As Int)";
 //BA.debugLineNum = 169;BA.debugLine="mBackgroundColor = Color";
_mbackgroundcolor = _color;
 //BA.debugLineNum = 170;BA.debugLine="mBase.Color = Color";
_mbase.setColor(_color);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(anywheresoftware.b4a.objects.B4XViewWrapper _pnl,float _radius) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 204;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
 //BA.debugLineNum = 218;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
 //BA.debugLineNum = 219;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 220;BA.debugLine="pnl.SetColorAndBorder(pnl.Color,0,0,radius)";
_pnl.SetColorAndBorder(_pnl.getColor(),(int) (0),(int) (0),(int) (_radius));
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _setcornerradius(float _radius) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Public Sub setCornerRadius(Radius As Float)";
 //BA.debugLineNum = 196;BA.debugLine="mCornerRadius = Radius";
_mcornerradius = _radius;
 //BA.debugLineNum = 197;BA.debugLine="SetCircleClip(mBase,Radius)";
_setcircleclip(_mbase,_radius);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _setdividercolor(int _color) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Public Sub setDividerColor(Color As Int)";
 //BA.debugLineNum = 187;BA.debugLine="mDividerColor = Color";
_mdividercolor = _color;
 //BA.debugLineNum = 188;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _setdividerheight(float _height) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Public Sub setDividerHeight(Height As Float)";
 //BA.debugLineNum = 160;BA.debugLine="mDividerHeight = Height";
_mdividerheight = _height;
 //BA.debugLineNum = 161;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _setsections(int _sectioncount) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub setSections(SectionCount As Int)";
 //BA.debugLineNum = 151;BA.debugLine="mSections = SectionCount";
_msections = _sectioncount;
 //BA.debugLineNum = 152;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _setselectedsection(int _section) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub setSelectedSection(Section As Int)";
 //BA.debugLineNum = 142;BA.debugLine="mSelectedSection = Section";
_mselectedsection = _section;
 //BA.debugLineNum = 143;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _setselectedsectioncolor(int _color) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub setSelectedSectionColor(Color As Int)";
 //BA.debugLineNum = 178;BA.debugLine="mSelectedSectionColor = Color";
_mselectedsectioncolor = _color;
 //BA.debugLineNum = 179;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _setvaluebasedontouch(int _x,int _y) throws Exception{
int _legacyvalue = 0;
 //BA.debugLineNum = 125;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
 //BA.debugLineNum = 126;BA.debugLine="Dim LegacyValue As Int = mSelectedSection";
_legacyvalue = _mselectedsection;
 //BA.debugLineNum = 127;BA.debugLine="If mVertical = True Then";
if (_mvertical==__c.True) { 
 //BA.debugLineNum = 128;BA.debugLine="mSelectedSection = (mBase.Height-y)/(mBase.Heigh";
_mselectedsection = (int) ((_mbase.getHeight()-_y)/(double)(_mbase.getHeight()/(double)_msections)+1);
 }else {
 //BA.debugLineNum = 130;BA.debugLine="mSelectedSection = x/(mBase.Width/mSections) +1";
_mselectedsection = (int) (_x/(double)(_mbase.getWidth()/(double)_msections)+1);
 };
 //BA.debugLineNum = 132;BA.debugLine="If LegacyValue <> mSelectedSection Then ValueChan";
if (_legacyvalue!=_mselectedsection) { 
_valuechanged(_mselectedsection);};
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 116;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==_touchpanel.TOUCH_ACTION_DOWN) { 
 //BA.debugLineNum = 117;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_setvaluebasedontouch((int) (_x),(int) (_y));
 }else if(_action==_touchpanel.TOUCH_ACTION_MOVE) { 
 //BA.debugLineNum = 119;BA.debugLine="SetValueBasedOnTouch(x, Y)";
_setvaluebasedontouch((int) (_x),(int) (_y));
 }else if(_action==_touchpanel.TOUCH_ACTION_UP) { 
 };
 //BA.debugLineNum = 122;BA.debugLine="If Action <> TouchPanel.TOUCH_ACTION_MOVE_NOTOUCH";
if (_action!=_touchpanel.TOUCH_ACTION_MOVE_NOTOUCH) { 
_update();};
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _xrect = null;
float _currentsectionheight = 0f;
float _currentsectionwidth = 0f;
int _i = 0;
 //BA.debugLineNum = 78;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 79;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_cvs.ClearRect(_cvs.getTargetRect());
 //BA.debugLineNum = 81;BA.debugLine="Dim xRect As B4XRect";
_xrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 83;BA.debugLine="xRect.Initialize(0,0,mBase.Width,mBase.Height)";
_xrect.Initialize((float) (0),(float) (0),(float) (_mbase.getWidth()),(float) (_mbase.getHeight()));
 //BA.debugLineNum = 84;BA.debugLine="cvs.DrawRect(xRect,mBackgroundColor,True,0)";
_cvs.DrawRect(_xrect,_mbackgroundcolor,__c.True,(float) (0));
 //BA.debugLineNum = 86;BA.debugLine="If mVertical = True Then";
if (_mvertical==__c.True) { 
 //BA.debugLineNum = 87;BA.debugLine="Dim CurrentSectionHeight As Float = mBase.Height";
_currentsectionheight = (float) (_mbase.getHeight()-(_mbase.getHeight()/(double)_msections)*_mselectedsection);
 //BA.debugLineNum = 88;BA.debugLine="xRect.Initialize(0,CurrentSectionHeight,mBase.Wi";
_xrect.Initialize((float) (0),_currentsectionheight,(float) (_mbase.getWidth()),(float) (_mbase.getHeight()));
 }else {
 //BA.debugLineNum = 90;BA.debugLine="cvs.DrawLine(0,0,mBase.Width,0,mBackgroundColor,";
_cvs.DrawLine((float) (0),(float) (0),(float) (_mbase.getWidth()),(float) (0),_mbackgroundcolor,(float) (_mbase.getHeight()));
 //BA.debugLineNum = 91;BA.debugLine="Dim CurrentSectionWidth As Float = (mBase.Width/";
_currentsectionwidth = (float) ((_mbase.getWidth()/(double)_msections)*_mselectedsection);
 //BA.debugLineNum = 92;BA.debugLine="xRect.Initialize(0,0,CurrentSectionWidth,mBase.H";
_xrect.Initialize((float) (0),(float) (0),_currentsectionwidth,(float) (_mbase.getHeight()));
 };
 //BA.debugLineNum = 94;BA.debugLine="cvs.DrawRect(xRect,mSelectedSectionColor,True,0)";
_cvs.DrawRect(_xrect,_mselectedsectioncolor,__c.True,(float) (0));
 //BA.debugLineNum = 96;BA.debugLine="If mVertical = True Then";
if (_mvertical==__c.True) { 
 //BA.debugLineNum = 97;BA.debugLine="For i = 0 To (mSections -1) -1";
{
final int step15 = 1;
final int limit15 = (int) ((_msections-1)-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 98;BA.debugLine="If (i +1) <> mSelectedSection Then";
if ((_i+1)!=_mselectedsection) { 
 //BA.debugLineNum = 99;BA.debugLine="cvs.DrawLine(0,mBase.Height - (mBase.Height/mS";
_cvs.DrawLine((float) (0),(float) (_mbase.getHeight()-(_mbase.getHeight()/(double)_msections)*(_i+1)-_mdividerheight/(double)2),(float) (_mbase.getWidth()),(float) (_mbase.getHeight()-(_mbase.getHeight()/(double)_msections)*(_i+1)-_mdividerheight/(double)2),_mdividercolor,_mdividerheight);
 };
 }
};
 }else {
 //BA.debugLineNum = 103;BA.debugLine="For i = 0 To (mSections -1) -1";
{
final int step21 = 1;
final int limit21 = (int) ((_msections-1)-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 104;BA.debugLine="If (i +1) <> mSelectedSection Then";
if ((_i+1)!=_mselectedsection) { 
 //BA.debugLineNum = 105;BA.debugLine="cvs.DrawLine((mBase.Width/mSections)*(i+1) - m";
_cvs.DrawLine((float) ((_mbase.getWidth()/(double)_msections)*(_i+1)-_mdividerheight/(double)2),(float) (0),(float) ((_mbase.getWidth()/(double)_msections)*(_i+1)-_mdividerheight/(double)2),(float) (_mbase.getHeight()),_mdividercolor,_mdividerheight);
 };
 }
};
 };
 //BA.debugLineNum = 110;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _valuechanged(int _section) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Private Sub ValueChanged(Section As Int)";
 //BA.debugLineNum = 136;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ValueC";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ValueChanged",(int) (1))) { 
 //BA.debugLineNum = 137;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ValueC";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ValueChanged",(Object)(_section));
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
