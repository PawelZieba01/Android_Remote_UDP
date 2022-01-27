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
	Private p2 As B4XPilotPage
	Private btn1_connect As Button
	Private text1_remote_ip As EditText
	Private text2_remote_port As EditText
	Private text3_listen_port As EditText
	Private Label6_msg As Label
	
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	
	p2.Initialize
	B4XPages.AddPage("page2", p2)
	
End Sub

Public Sub IsValidIPv4Address(IPAddress As String) As Boolean
	Return Regex.IsMatch("^(([01]?\d\d?|2[0-4]\d|25[0-5])\.){3}([01]?\d\d?|2[0-4]\d|25[0-5])$", IPAddress)
End Sub

Private Sub btn1_connect_Click
	If Not(IsValidIPv4Address(text1_remote_ip.Text)) Then
		Label6_msg.Text = "Wrong remote IP address"
	Else If Not(text2_remote_port.Text > 0 And text2_remote_port.Text <= 65535) Then
		Label6_msg.Text = "Wrong remote port (1 - 65535)"
	Else If Not(text3_listen_port.Text >= 0 And text3_listen_port.Text <= 65535) Then
		Label6_msg.Text = "Wrong listen port (0 - 65535)"
	Else
		Label6_msg.Text = ""
		Main.Remote_ip = text1_remote_ip.Text
		Main.Remote_port = text2_remote_port.Text
		Main.Listen_port = text3_listen_port.Text
		B4XPages.ShowPage("page2")
	End If
	
End Sub

