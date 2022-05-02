<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmSender
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmSender))
        Me.btnReturn = New System.Windows.Forms.Button()
        Me.lblQuestion = New System.Windows.Forms.Label()
        Me.lstRecipients = New System.Windows.Forms.ListBox()
        Me.txtMessage = New System.Windows.Forms.RichTextBox()
        Me.btnSend = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'btnReturn
        '
        Me.btnReturn.Location = New System.Drawing.Point(12, 245)
        Me.btnReturn.Name = "btnReturn"
        Me.btnReturn.Size = New System.Drawing.Size(106, 52)
        Me.btnReturn.TabIndex = 0
        Me.btnReturn.Text = "Return"
        Me.btnReturn.UseVisualStyleBackColor = True
        '
        'lblQuestion
        '
        Me.lblQuestion.AutoSize = True
        Me.lblQuestion.Location = New System.Drawing.Point(9, 9)
        Me.lblQuestion.Name = "lblQuestion"
        Me.lblQuestion.Size = New System.Drawing.Size(552, 39)
        Me.lblQuestion.TabIndex = 1
        Me.lblQuestion.Text = resources.GetString("lblQuestion.Text")
        '
        'lstRecipients
        '
        Me.lstRecipients.FormattingEnabled = True
        Me.lstRecipients.Location = New System.Drawing.Point(137, 85)
        Me.lstRecipients.Name = "lstRecipients"
        Me.lstRecipients.Size = New System.Drawing.Size(158, 212)
        Me.lstRecipients.TabIndex = 2
        '
        'txtMessage
        '
        Me.txtMessage.Location = New System.Drawing.Point(318, 85)
        Me.txtMessage.Name = "txtMessage"
        Me.txtMessage.Size = New System.Drawing.Size(180, 212)
        Me.txtMessage.TabIndex = 4
        Me.txtMessage.Text = "Enter your Message Here"
        '
        'btnSend
        '
        Me.btnSend.Enabled = False
        Me.btnSend.Location = New System.Drawing.Point(12, 85)
        Me.btnSend.Name = "btnSend"
        Me.btnSend.Size = New System.Drawing.Size(106, 64)
        Me.btnSend.TabIndex = 5
        Me.btnSend.Text = "Send Message"
        Me.btnSend.UseVisualStyleBackColor = True
        '
        'frmSender
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(563, 309)
        Me.Controls.Add(Me.btnSend)
        Me.Controls.Add(Me.txtMessage)
        Me.Controls.Add(Me.lstRecipients)
        Me.Controls.Add(Me.lblQuestion)
        Me.Controls.Add(Me.btnReturn)
        Me.Name = "frmSender"
        Me.Text = "Sender"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnReturn As System.Windows.Forms.Button
    Friend WithEvents lblQuestion As System.Windows.Forms.Label
    Friend WithEvents lstRecipients As System.Windows.Forms.ListBox
    Friend WithEvents txtMessage As System.Windows.Forms.RichTextBox
    Friend WithEvents btnSend As System.Windows.Forms.Button
End Class
