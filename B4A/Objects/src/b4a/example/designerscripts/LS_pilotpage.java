package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_pilotpage{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label_1").vw.setLeft((int)((3d / 100 * width)));
views.get("label_2").vw.setLeft((int)((views.get("label_1").vw.getLeft())+(views.get("label_1").vw.getWidth())+(3d / 100 * width)));
views.get("label_3").vw.setLeft((int)((views.get("label_2").vw.getLeft())+(views.get("label_2").vw.getWidth())+(3d / 100 * width)));
views.get("label_1").vw.setTop((int)((5d / 100 * height)));
views.get("label_2").vw.setTop((int)((views.get("label_1").vw.getTop())));
views.get("label_3").vw.setTop((int)((views.get("label_2").vw.getTop())));
views.get("btn4_back").vw.setTop((int)((views.get("label_1").vw.getTop())));
views.get("btn4_back").vw.setLeft((int)((100d / 100 * width)-(views.get("btn4_back").vw.getWidth())-(views.get("label_1").vw.getLeft())));
views.get("joystick_x").vw.setLeft((int)((0d / 100 * width)));
views.get("joystick_y").vw.setLeft((int)((100d / 100 * width)-(views.get("joystick_x").vw.getWidth())));
views.get("joystick_x").vw.setTop((int)((100d / 100 * height)-(views.get("joystick_x").vw.getHeight())));
views.get("joystick_y").vw.setTop((int)((views.get("joystick_x").vw.getTop())));
views.get("btn1").vw.setLeft((int)((50d / 100 * width)-(views.get("btn1").vw.getWidth())/2d));
views.get("btn2").vw.setLeft((int)((views.get("btn1").vw.getLeft())));
views.get("btn3").vw.setLeft((int)((views.get("btn2").vw.getLeft())));
views.get("btn1").vw.setTop((int)((views.get("joystick_x").vw.getTop())+((views.get("joystick_x").vw.getHeight())-(views.get("btn1").vw.getHeight())-(views.get("btn2").vw.getHeight())-(views.get("btn3").vw.getHeight()))/2d));
views.get("btn2").vw.setTop((int)((views.get("btn1").vw.getTop())+(views.get("btn1").vw.getWidth())));
views.get("btn3").vw.setTop((int)((views.get("btn2").vw.getTop())+(views.get("btn2").vw.getWidth())));

}
}