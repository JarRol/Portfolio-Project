Option Strict On
Public Class frmSender

    Private Sub frmSender_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim strRecipients As New List(Of String)
        strRecipients = frmLogin.objDatabase.Sender
        For Each Recpient As String In strRecipients
            lstRecipients.Items.Add(Recpient)
        Next
    End Sub

    Private Sub btnSend_Click(sender As Object, e As EventArgs) Handles btnSend.Click
        Dim intRecipientID As Integer
        Dim strMessage As String
        Dim strMessageTitle As String

        strMessageTitle = InputBox("Enter a Title to your Message")
        If strMessageTitle = "" Then
            MsgBox("All Messages Must have a Title")
        Else
            strMessage = txtMessage.Text
            intRecipientID = Convert.ToInt32(lstRecipients.SelectedIndex + 1)
            If strMessage = "" Or strMessage = "Enter your Message Here" Then
                MsgBox("You have not entered a Message")
            Else
                frmLogin.objDatabase.MessageSent(intRecipientID, strMessageTitle, strMessage)
                MsgBox("Your Message was sent")
            End If

        End If

    End Sub

    Private Sub lstRecipients_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstRecipients.SelectedIndexChanged
        btnSend.Enabled = True
    End Sub

    Private Sub btnReturn_Click(sender As Object, e As EventArgs) Handles btnReturn.Click
        Me.Hide()
        frmLogin.Show()
    End Sub
End Class