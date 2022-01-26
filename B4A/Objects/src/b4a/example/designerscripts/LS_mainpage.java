package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="Label_1.Left = 3%x"[MainPage/General script]
views.get("label_1").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 2;BA.debugLine="Label_2.Left = Label_1.Left + Label_1.Width + 3%x"[MainPage/General script]
views.get("label_2").vw.setLeft((int)((views.get("label_1").vw.getLeft())+(views.get("label_1").vw.getWidth())+(3d / 100 * width)));
//BA.debugLineNum = 3;BA.debugLine="Label_3.Left = Label_2.Left + Label_2.Width + 3%x"[MainPage/General script]
views.get("label_3").vw.setLeft((int)((views.get("label_2").vw.getLeft())+(views.get("label_2").vw.getWidth())+(3d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="Label_1.Top = 5%y"[MainPage/General script]
views.get("label_1").vw.setTop((int)((5d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="Label_2.Top = Label_1.Top"[MainPage/General script]
views.get("label_2").vw.setTop((int)((views.get("label_1").vw.getTop())));
//BA.debugLineNum = 7;BA.debugLine="Label_3.Top = Label_2.Top"[MainPage/General script]
views.get("label_3").vw.setTop((int)((views.get("label_2").vw.getTop())));
//BA.debugLineNum = 9;BA.debugLine="JoyStick_X.Left = 0%x"[MainPage/General script]
views.get("joystick_x").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 10;BA.debugLine="JoyStick_Y.Left = 100%x - JoyStick_X.Width"[MainPage/General script]
views.get("joystick_y").vw.setLeft((int)((100d / 100 * width)-(views.get("joystick_x").vw.getWidth())));
//BA.debugLineNum = 12;BA.debugLine="JoyStick_X.Top = 100%y - JoyStick_X.Height"[MainPage/General script]
views.get("joystick_x").vw.setTop((int)((100d / 100 * height)-(views.get("joystick_x").vw.getHeight())));
//BA.debugLineNum = 13;BA.debugLine="JoyStick_Y.Top = JoyStick_Y.Top"[MainPage/General script]
views.get("joystick_y").vw.setTop((int)((views.get("joystick_y").vw.getTop())));
//BA.debugLineNum = 15;BA.debugLine="btn1.Left = 50%x - btn1.Width/2"[MainPage/General script]
views.get("btn1").vw.setLeft((int)((50d / 100 * width)-(views.get("btn1").vw.getWidth())/2d));
//BA.debugLineNum = 16;BA.debugLine="btn2.Left = btn1.Left"[MainPage/General script]
views.get("btn2").vw.setLeft((int)((views.get("btn1").vw.getLeft())));
//BA.debugLineNum = 17;BA.debugLine="btn3.Left = btn2.Left"[MainPage/General script]
views.get("btn3").vw.setLeft((int)((views.get("btn2").vw.getLeft())));
//BA.debugLineNum = 19;BA.debugLine="btn1.Top = JoyStick_X.Top + (JoyStick_X.Height - btn1.Height - btn2.Height - btn3.Height)/2"[MainPage/General script]
views.get("btn1").vw.setTop((int)((views.get("joystick_x").vw.getTop())+((views.get("joystick_x").vw.getHeight())-(views.get("btn1").vw.getHeight())-(views.get("btn2").vw.getHeight())-(views.get("btn3").vw.getHeight()))/2d));
//BA.debugLineNum = 20;BA.debugLine="btn2.Top = btn1.Top + btn1.Width"[MainPage/General script]
views.get("btn2").vw.setTop((int)((views.get("btn1").vw.getTop())+(views.get("btn1").vw.getWidth())));
//BA.debugLineNum = 21;BA.debugLine="btn3.Top = btn2.Top + btn2.Width"[MainPage/General script]
views.get("btn3").vw.setTop((int)((views.get("btn2").vw.getTop())+(views.get("btn2").vw.getWidth())));

}
}