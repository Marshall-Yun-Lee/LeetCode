import sys
import socket
from threading import Thread
from socketserver import ThreadingMixIn

TCP_IP = "localhost"
TCP_PORT = 8080
BUFFER_SIZE = 1024 # 1mb

class ClientThread(Thread):
    def __init__(self, ip, port, sock, requestedFile):
        Thread.__init__(self)
        self.ip = ip
        self.port = port
        self.sock = sock
        self.requested = requestedFile
        print ("New thread started for " + ip + ":" + str(port))

    def run(self):
        try:
            file = open(self.requested,"rb")
            self.sock.send(("1").encode("utf-8"))
        except FileNotFoundError:
            self.sock.send(("0").encode("utf-8"))
            sys.exit('File not found!')
        
        while True:
            line = file.read(BUFFER_SIZE)
            while (line):
                self.sock.send(line)
                line = file.read(BUFFER_SIZE)
            if not line:
                file.close()
                self.sock.close()
                break

tcpsock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
tcpsock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
tcpsock.bind((TCP_IP, TCP_PORT))
threads = []

while True:
    tcpsock.listen(6) # 6 QA members
    print ("Waiting for incoming connections...")
    (conn, (ip, port)) = tcpsock.accept()
    print ("Got connection from ", (ip, port))
    
    requestedFile = conn.recv(1024).decode("utf-8")
    print("The file requested: " + requestedFile)
    newthread = ClientThread(ip,port,conn, requestedFile)
    newthread.start()
    threads.append(newthread)

for t in threads:
    t.join()