Option Strict On
Public Class frmNewAccount


    Private Sub btnEnter_Click(sender As Object, e As EventArgs) Handles btnEnter.Click
        Dim strUsername As String
        Dim strPassword As String
        Dim strName As String
        Dim strType As String

        strUsername = txtUsername.Text
        strPassword = txtPassword.Text
        strName = txtName.Text

        If radRecipient.Checked Then
            strType = "Recipient"
            If strUsername = "" Or strPassword = "" Or strName = "" Then
                MsgBox("Please enter something into the textboxes")
            Else
                frmLogin.objDatabase.NewAccount(strUsername, strPassword, strType, strName)
                MsgBox("Your Account was created")
                Me.Hide()
                frmLogin.Show()
            End If

        
          
        ElseIf radSender.Checked Then
            strType = "Sender"
            If strUsername = "" Or strPassword = "" Or strName = "" Then
                MsgBox("Please enter something into the textboxes")
            Else
                frmLogin.objDatabase.NewAccount(strUsername, strPassword, strType, strName)
                MsgBox("Your Account was created")
                Me.Hide()
                frmLogin.Show()
            End If
        Else
            MsgBox("Choose a Radio Button")
        End If
    End Sub
End Class