B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private btn1 As Button
	Private btn2 As Button
	Private btn3 As Button
	Private Label_1 As Label
	Private Label_2 As Label
	Private Label_xy As Label
	Private JoyStick As JoyStick
	
	Private btn1_state As Boolean = False
	Private btn2_state As Boolean = False
	Private btn3_state As Boolean = False
	
	Dim MyData As Map = CreateMap("Pos_X":0, "Pos_Y":0, "Btn1_state":False, "Btn2_state":False, "Btn3_state":False)
	Dim UDPSocket1 As UDPSocket
	Dim JSONGenerator As JSONGenerator
	Dim Packet As UDPPacket
	Dim data() As Byte
	
	
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	'JoyStick.ButtonDrawable = "button"
	'JoyStick.PadBackground = "pad"
	JoyStick.ButtonColor = Colors.Cyan
	JoyStick.PadColor = Colors.Gray
	btn1.Color = Colors.Cyan
	btn2.Color = Colors.Cyan
	btn3.Color = Colors.Cyan
	
	UDPSocket1.Initialize("UDP", 1901, 255)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Send_UDP_Data
	JSONGenerator.Initialize(MyData)
	data = JSONGenerator.ToString.GetBytes("UTF8")
	'Msgbox(data, "qwerty")
	Packet.Initialize(data, "192.168.4.1", 1900)
	UDPSocket1.Send(Packet)
End Sub

Private Sub btn1_Click
	btn1_state = Not(btn1_state)
	Log(btn1_state)
	
	If btn1_state Then
		btn1.Color = Colors.Magenta
		btn1.Text = "ON"
	Else
		btn1.Color = Colors.Cyan
		btn1.Text = "OFF"
	End If
	
	MyData.Put("Btn1_state", btn1_state)
	Send_UDP_Data
	
End Sub

Private Sub btn2_Click
	btn2_state = Not(btn2_state)
	Log(btn2_state)
	
	If btn2_state Then
		btn2.Color = Colors.Magenta
		btn2.Text = "ON"
	Else
		btn2.Color = Colors.Cyan
		btn2.Text = "0FF"
	End If
	
	MyData.Put("Btn2_state", btn2_state)
	Send_UDP_Data
End Sub

Private Sub btn3_Click
	btn3_state = Not(btn3_state)
	Log(btn3_state)
	
	If btn3_state Then
		btn3.Color = Colors.Magenta
		btn3.Text = "ON"
	Else
		btn3.Color = Colors.Cyan
		btn3.Text = "OFF"
	End If
	
	MyData.Put("Btn3_state", btn3_state)
	Send_UDP_Data
End Sub



Private Sub JoyStick_value_changed(angle As Double, angleDegrees As Double, powr As Double)
	Dim Pos_X As Int = Round(CosD(angleDegrees)*-powr)
	Dim Pos_Y As Int = Round(SinD(angleDegrees)*powr)
	
	Label_1.Text = "Angle: " & Round(angleDegrees)
	Label_2.Text = "Power: " & Round(powr)
	Label_xy.Text = "X: " & Pos_X & "   Y: " & Pos_Y
	
	If angleDegrees == 0 And powr == 0 Then
		JoyStick.ButtonColor = Colors.Cyan
	Else
		JoyStick.ButtonColor = Colors.Magenta
	End If
	
	MyData.Put("Pos_X", Pos_X)
	MyData.Put("Pos_Y", Pos_Y)
	
	Send_UDP_Data
End Sub