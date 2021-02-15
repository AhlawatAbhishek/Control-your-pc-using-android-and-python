from socket import *
import os

host="192.168.1.9"
port = 9999

s = socket(AF_INET, SOCK_STREAM)

s.bind((host, port))

s.listen(5);

while True:
	c,addr = s.accept()

	type = c.recv(1024).decode('utf-8')
	if(type == "s"):
	  os.system("shutdown")
	elif(type == "r"):
	  os.system("shutdown /r")
	elif(type == "m"):
	  os.system("D:\\1.mp3")    
	#s.close() 