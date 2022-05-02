<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmRecipient
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
        Me.txtMessage = New System.Windows.Forms.RichTextBox()
        Me.lstMessageTitles = New System.Windows.Forms.ListBox()
        Me.btnReturn = New System.Windows.Forms.Button()
        Me.lblWelcome = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'txtMessage
        '
        Me.txtMessage.Enabled = False
        Me.txtMessage.Location = New System.Drawing.Point(340, 85)
        Me.txtMessage.Name = "txtMessage"
        Me.txtMessage.Size = New System.Drawing.Size(180, 212)
        Me.txtMessage.TabIndex = 7
        Me.txtMessage.Text = "You have no new messages"
        '
        'lstMessageTitles
        '
        Me.lstMessageTitles.FormattingEnabled = True
        Me.lstMessageTitles.Location = New System.Drawing.Point(164, 163)
        Me.lstMessageTitles.Name = "lstMessageTitles"
        Me.lstMessageTitles.Size = New System.Drawing.Size(158, 134)
        Me.lstMessageTitles.TabIndex = 6
        '
        'btnReturn
        '
        Me.btnReturn.Location = New System.Drawing.Point(12, 245)
        Me.btnReturn.Name = "btnReturn"
        Me.btnReturn.Size = New System.Drawing.Size(106, 52)
        Me.btnReturn.TabIndex = 5
        Me.btnReturn.Text = "Return"
        Me.btnReturn.UseVisualStyleBackColor = True
        '
        'lblWelcome
        '
        Me.lblWelcome.AutoSize = True
        Me.lblWelcome.Location = New System.Drawing.Point(23, 25)
        Me.lblWelcome.Name = "lblWelcome"
        Me.lblWelcome.Size = New System.Drawing.Size(77, 13)
        Me.lblWelcome.TabIndex = 8
        Me.lblWelcome.Text = "Welcome User"
        '
        'frmRecipient
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(532, 317)
        Me.Controls.Add(Me.lblWelcome)
        Me.Controls.Add(Me.txtMessage)
        Me.Controls.Add(Me.lstMessageTitles)
        Me.Controls.Add(Me.btnReturn)
        Me.Name = "frmRecipient"
        Me.Text = "Recipient"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents txtMessage As System.Windows.Forms.RichTextBox
    Friend WithEvents lstMessageTitles As System.Windows.Forms.ListBox
    Friend WithEvents btnReturn As System.Windows.Forms.Button
    Friend WithEvents lblWelcome As System.Windows.Forms.Label
End Class
