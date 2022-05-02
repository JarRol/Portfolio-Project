Public Class frmRecipient


    Private Sub frmRecipient_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim strMessageTitle As New List(Of String)
        strMessageTitle = frmLogin.objDatabase.RecieveMessageTitle
        For Each MessageTitle As String In strMessageTitle
            lstMessageTitles.Items.Add(MessageTitle)
        Next

    End Sub

    Private Sub lstMessageTitles_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstMessageTitles.SelectedIndexChanged
        Dim strMessage As New List(Of String)
        Dim intMessage As Integer

        strMessage = frmLogin.objDatabase.RecieveMessage
        intMessage = Convert.ToInt32(lstMessageTitles.SelectedIndex)
        txtMessage.Text = strMessage(intMessage)
    End Sub

    Private Sub btnReturn_Click(sender As Object, e As EventArgs) Handles btnReturn.Click
        Me.Hide()
        frmLogin.Show()
    End Sub
End Class