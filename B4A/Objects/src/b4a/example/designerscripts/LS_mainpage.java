package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="Label5.Width = 100%x"[MainPage/General script]
views.get("label5").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 2;BA.debugLine="Label5.Height = 20%y"[MainPage/General script]
views.get("label5").vw.setHeight((int)((20d / 100 * height)));
//BA.debugLineNum = 3;BA.debugLine="Label5.Top = 0"[MainPage/General script]
views.get("label5").vw.setTop((int)(0d));
//BA.debugLineNum = 4;BA.debugLine="Label5.Left = 0"[MainPage/General script]
views.get("label5").vw.setLeft((int)(0d));
//BA.debugLineNum = 6;BA.debugLine="text1_remote_ip.Left = 5%x"[MainPage/General script]
views.get("text1_remote_ip").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="text2_remote_port.Left = text1_remote_ip.Left"[MainPage/General script]
views.get("text2_remote_port").vw.setLeft((int)((views.get("text1_remote_ip").vw.getLeft())));
//BA.debugLineNum = 8;BA.debugLine="text3_listen_port.Left = text2_remote_port.Left"[MainPage/General script]
views.get("text3_listen_port").vw.setLeft((int)((views.get("text2_remote_port").vw.getLeft())));
//BA.debugLineNum = 10;BA.debugLine="Label1.Left = text1_remote_ip.Left + text1_remote_ip.Width + 2%x"[MainPage/General script]
views.get("label1").vw.setLeft((int)((views.get("text1_remote_ip").vw.getLeft())+(views.get("text1_remote_ip").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 11;BA.debugLine="Label2.Left = text2_remote_port.Left + text2_remote_port.Width + 2%x"[MainPage/General script]
views.get("label2").vw.setLeft((int)((views.get("text2_remote_port").vw.getLeft())+(views.get("text2_remote_port").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="Label3.Left = text3_listen_port.Left + text3_listen_port.Width + 2%x"[MainPage/General script]
views.get("label3").vw.setLeft((int)((views.get("text3_listen_port").vw.getLeft())+(views.get("text3_listen_port").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 13;BA.debugLine="Label4.Left = text3_listen_port.Left"[MainPage/General script]
views.get("label4").vw.setLeft((int)((views.get("text3_listen_port").vw.getLeft())));
//BA.debugLineNum = 14;BA.debugLine="Label4.Width = Label3.Left + Label3.Width - text1_remote_ip.Left"[MainPage/General script]
views.get("label4").vw.setWidth((int)((views.get("label3").vw.getLeft())+(views.get("label3").vw.getWidth())-(views.get("text1_remote_ip").vw.getLeft())));
//BA.debugLineNum = 16;BA.debugLine="text1_remote_ip.Top = Label5.Height + ((100%y - Label5.Height) - text1_remote_ip.Height - text2_remote_port.Height - text3_listen_port.Height - Label4.Height - 10%y)/2"[MainPage/General script]
views.get("text1_remote_ip").vw.setTop((int)((views.get("label5").vw.getHeight())+(((100d / 100 * height)-(views.get("label5").vw.getHeight()))-(views.get("text1_remote_ip").vw.getHeight())-(views.get("text2_remote_port").vw.getHeight())-(views.get("text3_listen_port").vw.getHeight())-(views.get("label4").vw.getHeight())-(10d / 100 * height))/2d));
//BA.debugLineNum = 17;BA.debugLine="text2_remote_port.Top = text1_remote_ip.Top + text1_remote_ip.Height + 5%y"[MainPage/General script]
views.get("text2_remote_port").vw.setTop((int)((views.get("text1_remote_ip").vw.getTop())+(views.get("text1_remote_ip").vw.getHeight())+(5d / 100 * height)));
//BA.debugLineNum = 18;BA.debugLine="text3_listen_port.Top = text2_remote_port.Top + text2_remote_port.Height + 5%y"[MainPage/General script]
views.get("text3_listen_port").vw.setTop((int)((views.get("text2_remote_port").vw.getTop())+(views.get("text2_remote_port").vw.getHeight())+(5d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="Label1.Top = text1_remote_ip.Top"[MainPage/General script]
views.get("label1").vw.setTop((int)((views.get("text1_remote_ip").vw.getTop())));
//BA.debugLineNum = 21;BA.debugLine="Label2.Top = text2_remote_port.Top"[MainPage/General script]
views.get("label2").vw.setTop((int)((views.get("text2_remote_port").vw.getTop())));
//BA.debugLineNum = 22;BA.debugLine="Label3.Top = text3_listen_port.Top"[MainPage/General script]
views.get("label3").vw.setTop((int)((views.get("text3_listen_port").vw.getTop())));
//BA.debugLineNum = 23;BA.debugLine="Label4.Top = text3_listen_port.Top + text3_listen_port.Height"[MainPage/General script]
views.get("label4").vw.setTop((int)((views.get("text3_listen_port").vw.getTop())+(views.get("text3_listen_port").vw.getHeight())));
//BA.debugLineNum = 25;BA.debugLine="btn1_connect.Top = text3_listen_port.Top"[MainPage/General script]
views.get("btn1_connect").vw.setTop((int)((views.get("text3_listen_port").vw.getTop())));
//BA.debugLineNum = 26;BA.debugLine="btn1_connect.Left = 100%x - btn1_connect.Width - text1_remote_ip.Left"[MainPage/General script]
views.get("btn1_connect").vw.setLeft((int)((100d / 100 * width)-(views.get("btn1_connect").vw.getWidth())-(views.get("text1_remote_ip").vw.getLeft())));
//BA.debugLineNum = 27;BA.debugLine="Label6_msg.Top = btn1_connect.Top - Label6_msg.Height"[MainPage/General script]
views.get("label6_msg").vw.setTop((int)((views.get("btn1_connect").vw.getTop())-(views.get("label6_msg").vw.getHeight())));
//BA.debugLineNum = 28;BA.debugLine="Label6_msg.Left = btn1_connect.Left + btn1_connect.Width/2 - Label6_msg.Width/2"[MainPage/General script]
views.get("label6_msg").vw.setLeft((int)((views.get("btn1_connect").vw.getLeft())+(views.get("btn1_connect").vw.getWidth())/2d-(views.get("label6_msg").vw.getWidth())/2d));

}
}