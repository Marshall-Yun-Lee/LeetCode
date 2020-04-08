import socket
import sys
import time

TCP_IP = 'localhost'
TCP_PORT = 8080
BUFFER_SIZE = 1024 

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
try:
	s.connect((TCP_IP, TCP_PORT))
	print("File requesting: " + sys.argv[1])
	s.send(sys.argv[1].encode("utf-8"))
	
	isFound: str = s.recv(1024).decode("utf-8")
	if isFound == "0":
		sys.exit("The file is not found in the server")

except Exception:
	sys.exit("make sure the server is open!")

with open(sys.argv[1], "wb") as f:
    print ("file opened")
    while True:
        data = s.recv(BUFFER_SIZE)
        print("data=%s", (data))
        if not data:
            f.close()
            print ("file close()")
            break
        # write data to a file
        f.write(data)

print("Successfully get the file")
s.close()
print("connection closed")
