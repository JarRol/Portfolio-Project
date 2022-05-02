Option Strict On
Public Class frmLogin
    Public objDatabase As New DatabaseInteraction()
    Private Sub btnEnter_Click(sender As Object, e As EventArgs) Handles btnEnter.Click
        Dim strUsername As String
        Dim strPassword As String
        Dim strType As String
        Dim blnAccept As Boolean
        strUsername = txtUsername.Text
        strPassword = txtPassword.Text

        If radRecipient.Checked Then
            strType = "Recipient"
            blnAccept = objDatabase.Login(strUsername, strPassword, strType)
            If blnAccept = True Then
                Me.Hide()
                frmRecipient.Show()
            Else
                MsgBox("The username and password you used was incorrect, check for capitilization because it does matter.")
            End If
        ElseIf radSender.Checked Then
            strType = "Sender"
            blnAccept = objDatabase.Login(strUsername, strPassword, strType)
            If blnAccept = True Then
                Me.Hide()
                frmSender.Show()
            Else
                MsgBox("The username and password you used was incorrect, check for capitilization because it does matter.")
            End If
        Else
            MsgBox("Choose a Radio Button")
        End If
    End Sub

    Private Sub CloseToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles CloseToolStripMenuItem.Click
        Close()
    End Sub

    Private Sub NewAccountsToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles NewAccountsToolStripMenuItem.Click
        Me.Hide()
        frmNewAccount.Show()
    End Sub
End Class
