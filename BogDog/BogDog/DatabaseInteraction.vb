Option Strict On
Public Class DatabaseInteraction
    Private Connection As OleDb.OleDbConnection
    Private User As String
    Private ThePassword As String
    Private UserID As Integer
    Private DataBase As OleDb.OleDbDataAdapter
    Private objDataset As New DataSet



    Public Sub ConnectToDatabase()
        Connection = New OleDb.OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0; " & "Data Source=P:\InClass Assignments\BogDog Database\BOGDOG.accdb;")
        Connection.Open()
    End Sub

    Public Sub DisconnectFromDatabase()
        Connection.Close()
    End Sub
   

    Public Function Login(Username As String, Password As String, Type As String) As Boolean

        ConnectToDatabase()
        User = Username
        ThePassword = Password
        Dim Approved As Boolean = False
        If Type = "Sender" Then
            Dim Query As String = "SELECT * FROM Senders"
            Dim Command As New OleDb.OleDbCommand(Query, Connection)
            Dim DBReader As OleDb.OleDbDataReader = Command.ExecuteReader
            Dim strDBUsername As String
            Dim strDBPassword As String

            Do While DBReader.Read
                strDBUsername = Convert.ToString(DBReader("Username"))
                strDBPassword = Convert.ToString(DBReader("Passcode"))

                If User = strDBUsername And ThePassword = strDBPassword Then
                    UserID = Convert.ToInt32(DBReader("SenderID"))
                    Approved = True
                End If
            Loop

        ElseIf Type = "Recipient" Then
            Dim Query As String = "SELECT * FROM Recipients"
            Dim Command As New OleDb.OleDbCommand(Query, Connection)
            Dim DBReader As OleDb.OleDbDataReader = Command.ExecuteReader
            Dim strDBUsername As String
            Dim strDBPassword As String

            Do While DBReader.Read
                strDBUsername = Convert.ToString(DBReader("Username"))
                strDBPassword = Convert.ToString(DBReader("Passcode"))

                If User = strDBUsername And ThePassword = strDBPassword Then
                    UserID = Convert.ToInt32(DBReader("RecipientID"))
                    Approved = True
                End If
            Loop

        End If

        DisconnectFromDatabase()
        Return Approved
    End Function

    Public Sub NewAccount(strUsername As String, strPassword As String, Type As String, strName As String)
        ConnectToDatabase()
          If Type = "Sender" Then
            Dim Query As String = "INSERT INTO Senders(Username,Passcode,SenderName) VALUES( '" & strUsername & "', '" & strPassword & "', '" & strName & "')"
            Dim Command As New OleDb.OleDbCommand(Query, Connection)
            Command.ExecuteNonQuery()


        ElseIf Type = "Recipient" Then
            Dim Query As String = "INSERT INTO Recipients(Username, Passcode, RecipientName) VALUES( '" & strUsername & "', '" & strPassword & "', '" & strName & "')"
            Dim Command As New OleDb.OleDbCommand(Query, Connection)
            Command.ExecuteNonQuery()
        End If

        DisconnectFromDatabase()


    End Sub

    Public Function Sender() As List(Of String)
        ConnectToDatabase()
        Dim Query As String = "SELECT * FROM Recipients"
        Dim Command As New OleDb.OleDbCommand(Query, Connection)
        Dim DBReader As OleDb.OleDbDataReader = Command.ExecuteReader
        Dim strSender As New List(Of String)
        Dim strHolding As String
        Do While DBReader.Read
            strHolding = Convert.ToString(DBReader("RecipientName"))
            strSender.Add(strHolding)
        Loop
        DisconnectFromDatabase()
        Return strSender
    End Function
    Public Sub MessageSent(RecipientID As Integer, MessageTitle As String, Message As String)
        ConnectToDatabase()
        Dim Query As String = "INSERT INTO Messages(SenderID,RecipientID,MessageTitle, Message) VALUES( '" & UserID & "', '" & RecipientID & "', '" & MessageTitle & "', '" & Message & "')"
        Dim Command As New OleDb.OleDbCommand(Query, Connection)
        Command.ExecuteNonQuery()
        DisconnectFromDatabase()
    End Sub
    Public Function RecieveMessageTitle() As List(Of String)
        ConnectToDatabase()

        Dim Query As String = "SELECT * FROM Messages WHERE RecipientID = " & UserID
        Dim Command As New OleDb.OleDbCommand(Query, Connection)
        Dim DBReader As OleDb.OleDbDataReader = Command.ExecuteReader
        Dim strMessageTitle As New List(Of String)
        Dim strHolding As String

        Do While DBReader.Read
            strHolding = Convert.ToString(DBReader("MessageTitle"))
            strMessageTitle.Add(strHolding)
        Loop
        DisconnectFromDatabase()
        Return strMessageTitle
    End Function
    Public Function RecieveMessage() As List(Of String)
        ConnectToDatabase()
        Dim Query As String = "SELECT * FROM Messages WHERE RecipientID = " & UserID
        Dim Command As New OleDb.OleDbCommand(Query, Connection)
        Dim DBReader As OleDb.OleDbDataReader = Command.ExecuteReader
        Dim strMessage As New List(Of String)
        Dim strHolding As String

        Do While DBReader.Read
            strHolding = Convert.ToString(DBReader("Message"))
            strMessage.Add(strHolding)
        Loop
        DisconnectFromDatabase()
        Return strMessage
    End Function
End Class
