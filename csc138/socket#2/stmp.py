from socket import *
msg = "\r\n I love computer networks!"
endmsg = "\r\n.\r\n"

# Choose a mail server (e.g. Google mail server) and call it mailserver
mailserver = "localhost"
port = 25

sender = "<test@ecs.csus.edu>"
recipient = "<shammahthao@csus.edu>"

# Create socket called clientSocket and establish a TCP connection with mailserver
clientSocket = socket(AF_INET, SOCK_STREAM)
clientSocket.connect((mailserver, port))
recv = clientSocket.recv(1024).decode()
print(recv)
if recv[:3] != '220':
 print('220 reply not received from server.')

# Send HELO command and print server response.
print "Sending HELO command"
heloCommand = 'HELO Alice\r\n'
clientSocket.send(heloCommand.encode())
recv1 = clientSocket.recv(1024).decode()
print(recv1)

if recv1[:3] != '250':
 print('250 reply not received from server.')

# Send MAIL FROM command and print server response.
print "Send MAIL FROM command"
mailFromCommand = 'MAIL FROM: ' + sender + '\r\n'
clientSocket.send(mailFromCommand.encode())
recv1 = clientSocket.recv(1024).decode()
print recv1
if recv1[:3] != '250':
	print '250 reply not received from server'
# Send RCPT TO command and print server response.
print "Sending RCPT TO command"
rcptToCommand = 'RCPT TO: ' + recipient + '\r\n'
clientSocket.send(rcptToCommand.encode())
recv1 = clientSocket.recv(1024).decode()
print recv1
if recv1[:3] != '250':
	print '250 reply not received from server'

# Send DATA command and print server response.
print "Send DATA command"
dataCommand = 'DATA\r\n'
clientSocket.send(dataCommand.encode())
recv1 = clientSocket.recv(1024).decode()
print recv1
if recv1[:3] != '354':
	print ('354 reply not received from server')

# Send message data.
print "Sending message data"
clientSocket.send(msg + endmsg.encode())
recv1 = clientSocket.recv(1024).decode()
print recv1
if recv1[:3] != '250':
	print ('250 reply not received from server\n')


# Message ends with a single period.
print "."


# Send QUIT command and get server response.
print "Sending QUIT command"
quitCommand = 'QUIT\r\n'
clientSocket.send("QUIT\r\n".encode())
recv1 = clientSocket.recv(1024).decode()
print recv1
if recv1[:3] != '221':
	print ('221 reply not received from server')

clientSocket.close()
