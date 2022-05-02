<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmNewAccount
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
        Me.btnEnter = New System.Windows.Forms.Button()
        Me.lblPassword = New System.Windows.Forms.Label()
        Me.lblUsername = New System.Windows.Forms.Label()
        Me.lblWelcome = New System.Windows.Forms.Label()
        Me.txtPassword = New System.Windows.Forms.TextBox()
        Me.txtUsername = New System.Windows.Forms.TextBox()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.radSender = New System.Windows.Forms.RadioButton()
        Me.radRecipient = New System.Windows.Forms.RadioButton()
        Me.txtName = New System.Windows.Forms.TextBox()
        Me.lblName = New System.Windows.Forms.Label()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'btnEnter
        '
        Me.btnEnter.Location = New System.Drawing.Point(188, 177)
        Me.btnEnter.Name = "btnEnter"
        Me.btnEnter.Size = New System.Drawing.Size(127, 44)
        Me.btnEnter.TabIndex = 11
        Me.btnEnter.Text = "Enter"
        Me.btnEnter.UseVisualStyleBackColor = True
        '
        'lblPassword
        '
        Me.lblPassword.AutoSize = True
        Me.lblPassword.Location = New System.Drawing.Point(45, 103)
        Me.lblPassword.Name = "lblPassword"
        Me.lblPassword.Size = New System.Drawing.Size(81, 13)
        Me.lblPassword.TabIndex = 10
        Me.lblPassword.Text = "Enter Password"
        '
        'lblUsername
        '
        Me.lblUsername.AutoSize = True
        Me.lblUsername.Location = New System.Drawing.Point(45, 73)
        Me.lblUsername.Name = "lblUsername"
        Me.lblUsername.Size = New System.Drawing.Size(83, 13)
        Me.lblUsername.TabIndex = 9
        Me.lblUsername.Text = "Enter Username"
        '
        'lblWelcome
        '
        Me.lblWelcome.AutoSize = True
        Me.lblWelcome.Location = New System.Drawing.Point(15, 9)
        Me.lblWelcome.Name = "lblWelcome"
        Me.lblWelcome.Size = New System.Drawing.Size(321, 26)
        Me.lblWelcome.TabIndex = 8
        Me.lblWelcome.Text = "Welcome, Please enter your new Username, Password, and Name" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Then choose if you w" & _
    "ant to create a new Sender or Recipient"
        '
        'txtPassword
        '
        Me.txtPassword.Location = New System.Drawing.Point(144, 100)
        Me.txtPassword.Name = "txtPassword"
        Me.txtPassword.PasswordChar = Global.Microsoft.VisualBasic.ChrW(42)
        Me.txtPassword.Size = New System.Drawing.Size(175, 20)
        Me.txtPassword.TabIndex = 7
        '
        'txtUsername
        '
        Me.txtUsername.Location = New System.Drawing.Point(144, 74)
        Me.txtUsername.Name = "txtUsername"
        Me.txtUsername.Size = New System.Drawing.Size(175, 20)
        Me.txtUsername.TabIndex = 6
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.radSender)
        Me.GroupBox1.Controls.Add(Me.radRecipient)
        Me.GroupBox1.Location = New System.Drawing.Point(24, 168)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(117, 69)
        Me.GroupBox1.TabIndex = 12
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Choose"
        '
        'radSender
        '
        Me.radSender.AutoSize = True
        Me.radSender.Location = New System.Drawing.Point(6, 19)
        Me.radSender.Name = "radSender"
        Me.radSender.Size = New System.Drawing.Size(59, 17)
        Me.radSender.TabIndex = 7
        Me.radSender.TabStop = True
        Me.radSender.Text = "Sender"
        Me.radSender.UseVisualStyleBackColor = True
        '
        'radRecipient
        '
        Me.radRecipient.AutoSize = True
        Me.radRecipient.Location = New System.Drawing.Point(6, 41)
        Me.radRecipient.Name = "radRecipient"
        Me.radRecipient.Size = New System.Drawing.Size(70, 17)
        Me.radRecipient.TabIndex = 8
        Me.radRecipient.TabStop = True
        Me.radRecipient.Text = "Recipient"
        Me.radRecipient.UseVisualStyleBackColor = True
        '
        'txtName
        '
        Me.txtName.Location = New System.Drawing.Point(144, 126)
        Me.txtName.Name = "txtName"
        Me.txtName.Size = New System.Drawing.Size(175, 20)
        Me.txtName.TabIndex = 13
        '
        'lblName
        '
        Me.lblName.AutoSize = True
        Me.lblName.Location = New System.Drawing.Point(48, 132)
        Me.lblName.Name = "lblName"
        Me.lblName.Size = New System.Drawing.Size(63, 13)
        Me.lblName.TabIndex = 14
        Me.lblName.Text = "Enter Name"
        '
        'frmNewAccount
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(348, 249)
        Me.Controls.Add(Me.lblName)
        Me.Controls.Add(Me.txtName)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.btnEnter)
        Me.Controls.Add(Me.lblPassword)
        Me.Controls.Add(Me.lblUsername)
        Me.Controls.Add(Me.lblWelcome)
        Me.Controls.Add(Me.txtPassword)
        Me.Controls.Add(Me.txtUsername)
        Me.Name = "frmNewAccount"
        Me.Text = "NewAccount"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnEnter As System.Windows.Forms.Button
    Friend WithEvents lblPassword As System.Windows.Forms.Label
    Friend WithEvents lblUsername As System.Windows.Forms.Label
    Friend WithEvents lblWelcome As System.Windows.Forms.Label
    Friend WithEvents txtPassword As System.Windows.Forms.TextBox
    Friend WithEvents txtUsername As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents radSender As System.Windows.Forms.RadioButton
    Friend WithEvents radRecipient As System.Windows.Forms.RadioButton
    Friend WithEvents txtName As System.Windows.Forms.TextBox
    Friend WithEvents lblName As System.Windows.Forms.Label
End Class
