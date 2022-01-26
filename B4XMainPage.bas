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
	Private Label_3 As Label
	Private JoyStick_X As JoyStick
	Private JoyStick_Y As JoyStick
	
	Private btn1_state As Boolean = False
	Private btn2_state As Boolean = False
	Private btn3_state As Boolean = False
	
	Dim MyData As Map = CreateMap("Pos_X":0, "Pos_Y":0, "Btn1_state":False, "Btn2_state":False, "Btn3_state":False)
	Dim UDPSocket1 As UDPSocket
	
	Dim Packet1 As UDPPacket
	Dim data() As Byte
	
	
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	JoyStick_X.ButtonDrawable = "button"
	JoyStick_X.PadBackground = "pad"
	JoyStick_X.ButtonColor = Colors.Cyan
	JoyStick_X.PadColor = Colors.Gray
	
	JoyStick_Y.ButtonDrawable = "button"
	JoyStick_Y.PadBackground = "pad"
	JoyStick_Y.ButtonColor = Colors.Cyan
	JoyStick_Y.PadColor = Colors.Gray
	
	btn1.Color = 0xFF4F4F4F
	btn2.Color = 0xFF4F4F4F
	btn3.Color = 0xFF4F4F4F
	
	UDPSocket1.Initialize("UDP", 1901, 255)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Send_UDP_Data
	Dim JSONGenerator As JSONGenerator
	
	JSONGenerator.Initialize(MyData)
	data = JSONGenerator.ToString.GetBytes("UTF8")
	'Msgbox(data, "qwerty")
	Packet1.Initialize(data, "192.168.1.16", 53795)
	UDPSocket1.Send(Packet1)
End Sub

Private Sub btn1_Click
	btn1_state = Not(btn1_state)
	Log(btn1_state)
	
	If btn1_state Then
		btn1.Color = Colors.Cyan
		btn1.Text = "ON"
	Else
		btn1.Color = 0xFF4F4F4F
		btn1.Text = "OFF"
	End If
	
	MyData.Put("Btn1_state", btn1_state)
	Send_UDP_Data
	
End Sub

Private Sub btn2_Click
	btn2_state = Not(btn2_state)
	Log(btn2_state)
	
	If btn2_state Then
		btn2.Color = Colors.Cyan
		btn2.Text = "ON"
	Else
		btn2.Color = 0xFF4F4F4F
		btn2.Text = "0FF"
	End If
	
	MyData.Put("Btn2_state", btn2_state)
	Send_UDP_Data
End Sub

Private Sub btn3_Click
	btn3_state = Not(btn3_state)
	Log(btn3_state)
	
	If btn3_state Then
		btn3.Color = Colors.Cyan
		btn3.Text = "ON"
	Else
		btn3.Color = 0xFF4F4F4F
		btn3.Text = "OFF"
	End If
	
	MyData.Put("Btn3_state", btn3_state)
	Send_UDP_Data
End Sub

Private Sub JoyStick_X_value_changed(angle As Double, angleDegrees As Double, powr As Double)
	Dim Pos_X As Int = Round(CosD(angleDegrees)*-powr)
	Label_1.Text = "TURN: " & Pos_X 
	MyData.Put("Pos_X", Pos_X)
	Send_UDP_Data
End Sub

Private Sub JoyStick_Y_value_changed(angle As Double, angleDegrees As Double, powr As Double)
	Dim Pos_Y As Int = Round(SinD(angleDegrees)*powr)
	Label_2.Text = "POWER: " & Pos_Y 
	MyData.Put("Pos_Y", Pos_Y)
	Send_UDP_Data
End Sub

Sub UDP_PacketArrived(Packet As UDPPacket)
	Dim JSONParser As JSONParser
	Dim Map_Data As Map
	
	Dim msg As String
	msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, "UTF8")
	JSONParser.Initialize(msg)
	Map_Data = JSONParser.NextObject
	Try
		Label_3.Text = "BATTERY: " & Map_Data.Get("Battery_level") & "%"
	Catch
		Msgbox("Próba pobrania wartości 'Battery_level' nie powiodła się! Błędny parametr json", "ERROR")
	End Try
End Sub
