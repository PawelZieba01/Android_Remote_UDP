package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[MainPage/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="JoyStick.Width = 70%x"[MainPage/General script]
views.get("joystick").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="JoyStick.Height = 70%x"[MainPage/General script]
views.get("joystick").vw.setHeight((int)((70d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="JoyStick.Left = (100%x - JoyStick.Width)/2"[MainPage/General script]
views.get("joystick").vw.setLeft((int)(((100d / 100 * width)-(views.get("joystick").vw.getWidth()))/2d));
//BA.debugLineNum = 6;BA.debugLine="JoyStick.Top = (100%y - JoyStick.Height)/2"[MainPage/General script]
views.get("joystick").vw.setTop((int)(((100d / 100 * height)-(views.get("joystick").vw.getHeight()))/2d));
//BA.debugLineNum = 8;BA.debugLine="Label_1.Width = 30%x"[MainPage/General script]
views.get("label_1").vw.setWidth((int)((30d / 100 * width)));
//BA.debugLineNum = 9;BA.debugLine="Label_1.Height = 10%y"[MainPage/General script]
views.get("label_1").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 10;BA.debugLine="Label_1.Top = 100"[MainPage/General script]
views.get("label_1").vw.setTop((int)(100d));
//BA.debugLineNum = 11;BA.debugLine="Label_1.Left = JoyStick.Left"[MainPage/General script]
views.get("label_1").vw.setLeft((int)((views.get("joystick").vw.getLeft())));
//BA.debugLineNum = 13;BA.debugLine="Label_2.Width = 30%x"[MainPage/General script]
views.get("label_2").vw.setWidth((int)((30d / 100 * width)));
//BA.debugLineNum = 14;BA.debugLine="Label_2.Height = 10%y"[MainPage/General script]
views.get("label_2").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 15;BA.debugLine="Label_2.Top = 100"[MainPage/General script]
views.get("label_2").vw.setTop((int)(100d));
//BA.debugLineNum = 16;BA.debugLine="Label_2.Left = JoyStick.Left + JoyStick.Width - Label_2.Width"[MainPage/General script]
views.get("label_2").vw.setLeft((int)((views.get("joystick").vw.getLeft())+(views.get("joystick").vw.getWidth())-(views.get("label_2").vw.getWidth())));
//BA.debugLineNum = 18;BA.debugLine="Label_xy.Width = 30%x"[MainPage/General script]
views.get("label_xy").vw.setWidth((int)((30d / 100 * width)));
//BA.debugLineNum = 19;BA.debugLine="Label_xy.Height = 10%y"[MainPage/General script]
views.get("label_xy").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="Label_xy.Top = Label_1.Top + Label_xy.Height"[MainPage/General script]
views.get("label_xy").vw.setTop((int)((views.get("label_1").vw.getTop())+(views.get("label_xy").vw.getHeight())));
//BA.debugLineNum = 21;BA.debugLine="Label_xy.Left = (100%x - Label_xy.Width) / 2"[MainPage/General script]
views.get("label_xy").vw.setLeft((int)(((100d / 100 * width)-(views.get("label_xy").vw.getWidth()))/2d));
//BA.debugLineNum = 23;BA.debugLine="btn1.Width = 20%x"[MainPage/General script]
views.get("btn1").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 24;BA.debugLine="btn1.Height = 20%x"[MainPage/General script]
views.get("btn1").vw.setHeight((int)((20d / 100 * width)));
//BA.debugLineNum = 26;BA.debugLine="btn2.Width = 20%x"[MainPage/General script]
views.get("btn2").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 27;BA.debugLine="btn2.Height = 20%x"[MainPage/General script]
views.get("btn2").vw.setHeight((int)((20d / 100 * width)));
//BA.debugLineNum = 29;BA.debugLine="btn3.Width = 20%x"[MainPage/General script]
views.get("btn3").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="btn3.Height = 20%x"[MainPage/General script]
views.get("btn3").vw.setHeight((int)((20d / 100 * width)));
//BA.debugLineNum = 32;BA.debugLine="btn1.Top = JoyStick.Top + JoyStick.Height + 10%y"[MainPage/General script]
views.get("btn1").vw.setTop((int)((views.get("joystick").vw.getTop())+(views.get("joystick").vw.getHeight())+(10d / 100 * height)));
//BA.debugLineNum = 33;BA.debugLine="btn2.Top = btn1.Top"[MainPage/General script]
views.get("btn2").vw.setTop((int)((views.get("btn1").vw.getTop())));
//BA.debugLineNum = 34;BA.debugLine="btn3.Top = btn1.Top"[MainPage/General script]
views.get("btn3").vw.setTop((int)((views.get("btn1").vw.getTop())));
//BA.debugLineNum = 36;BA.debugLine="btn1.Left = (100%x - btn1.Width - btn2.Width - btn3.Width) / 4"[MainPage/General script]
views.get("btn1").vw.setLeft((int)(((100d / 100 * width)-(views.get("btn1").vw.getWidth())-(views.get("btn2").vw.getWidth())-(views.get("btn3").vw.getWidth()))/4d));
//BA.debugLineNum = 37;BA.debugLine="btn2.Left = btn1.Left + btn1.Left + btn1.Width"[MainPage/General script]
views.get("btn2").vw.setLeft((int)((views.get("btn1").vw.getLeft())+(views.get("btn1").vw.getLeft())+(views.get("btn1").vw.getWidth())));
//BA.debugLineNum = 38;BA.debugLine="btn3.Left = btn2.Left + btn1.Left + btn2.Width"[MainPage/General script]
views.get("btn3").vw.setLeft((int)((views.get("btn2").vw.getLeft())+(views.get("btn1").vw.getLeft())+(views.get("btn2").vw.getWidth())));

}
}