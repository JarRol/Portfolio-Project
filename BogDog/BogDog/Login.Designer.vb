<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmLogin
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
        Me.txtUsername = New System.Windows.Forms.TextBox()
        Me.txtPassword = New System.Windows.Forms.TextBox()
        Me.lblWelcome = New System.Windows.Forms.Label()
        Me.lblUsername = New System.Windows.Forms.Label()
        Me.lblPassword = New System.Windows.Forms.Label()
        Me.btnEnter = New System.Windows.Forms.Button()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.CreateToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.NewAccountsToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.CloseToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.radSender = New System.Windows.Forms.RadioButton()
        Me.radRecipient = New System.Windows.Forms.RadioButton()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.MenuStrip1.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'txtUsername
        '
        Me.txtUsername.Location = New System.Drawing.Point(135, 94)
        Me.txtUsername.Name = "txtUsername"
        Me.txtUsername.Size = New System.Drawing.Size(175, 20)
        Me.txtUsername.TabIndex = 0
        '
        'txtPassword
        '
        Me.txtPassword.Location = New System.Drawing.Point(135, 133)
        Me.txtPassword.Name = "txtPassword"
        Me.txtPassword.PasswordChar = Global.Microsoft.VisualBasic.ChrW(42)
        Me.txtPassword.Size = New System.Drawing.Size(175, 20)
        Me.txtPassword.TabIndex = 1
        '
        'lblWelcome
        '
        Me.lblWelcome.AutoSize = True
        Me.lblWelcome.Location = New System.Drawing.Point(30, 45)
        Me.lblWelcome.Name = "lblWelcome"
        Me.lblWelcome.Size = New System.Drawing.Size(224, 13)
        Me.lblWelcome.TabIndex = 2
        Me.lblWelcome.Text = "Welcome, Please enter your Login Information"
        '
        'lblUsername
        '
        Me.lblUsername.AutoSize = True
        Me.lblUsername.Location = New System.Drawing.Point(46, 97)
        Me.lblUsername.Name = "lblUsername"
        Me.lblUsername.Size = New System.Drawing.Size(83, 13)
        Me.lblUsername.TabIndex = 3
        Me.lblUsername.Text = "Enter Username"
        '
        'lblPassword
        '
        Me.lblPassword.AutoSize = True
        Me.lblPassword.Location = New System.Drawing.Point(46, 140)
        Me.lblPassword.Name = "lblPassword"
        Me.lblPassword.Size = New System.Drawing.Size(81, 13)
        Me.lblPassword.TabIndex = 4
        Me.lblPassword.Text = "Enter Password"
        '
        'btnEnter
        '
        Me.btnEnter.Location = New System.Drawing.Point(169, 176)
        Me.btnEnter.Name = "btnEnter"
        Me.btnEnter.Size = New System.Drawing.Size(127, 44)
        Me.btnEnter.TabIndex = 5
        Me.btnEnter.Text = "Enter"
        Me.btnEnter.UseVisualStyleBackColor = True
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.CreateToolStripMenuItem, Me.CloseToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(332, 24)
        Me.MenuStrip1.TabIndex = 6
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'CreateToolStripMenuItem
        '
        Me.CreateToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.NewAccountsToolStripMenuItem})
        Me.CreateToolStripMenuItem.Name = "CreateToolStripMenuItem"
        Me.CreateToolStripMenuItem.Size = New System.Drawing.Size(50, 20)
        Me.CreateToolStripMenuItem.Text = "Create"
        '
        'NewAccountsToolStripMenuItem
        '
        Me.NewAccountsToolStripMenuItem.Name = "NewAccountsToolStripMenuItem"
        Me.NewAccountsToolStripMenuItem.Size = New System.Drawing.Size(139, 22)
        Me.NewAccountsToolStripMenuItem.Text = "New Account"
        '
        'CloseToolStripMenuItem
        '
        Me.CloseToolStripMenuItem.Name = "CloseToolStripMenuItem"
        Me.CloseToolStripMenuItem.Size = New System.Drawing.Size(45, 20)
        Me.CloseToolStripMenuItem.Text = "Close"
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
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.radSender)
        Me.GroupBox1.Controls.Add(Me.radRecipient)
        Me.GroupBox1.Location = New System.Drawing.Point(12, 162)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(117, 69)
        Me.GroupBox1.TabIndex = 9
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Choose"
        '
        'frmLogin
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(332, 243)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.btnEnter)
        Me.Controls.Add(Me.lblPassword)
        Me.Controls.Add(Me.lblUsername)
        Me.Controls.Add(Me.lblWelcome)
        Me.Controls.Add(Me.txtPassword)
        Me.Controls.Add(Me.txtUsername)
        Me.Controls.Add(Me.MenuStrip1)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "frmLogin"
        Me.Text = "Login"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents txtUsername As System.Windows.Forms.TextBox
    Friend WithEvents txtPassword As System.Windows.Forms.TextBox
    Friend WithEvents lblWelcome As System.Windows.Forms.Label
    Friend WithEvents lblUsername As System.Windows.Forms.Label
    Friend WithEvents lblPassword As System.Windows.Forms.Label
    Friend WithEvents btnEnter As System.Windows.Forms.Button
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents CreateToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents NewAccountsToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents CloseToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents radSender As System.Windows.Forms.RadioButton
    Friend WithEvents radRecipient As System.Windows.Forms.RadioButton
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox

End Class
