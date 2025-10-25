from socket import *

s = socket()

ip = gethostname()

port = 8888

s.bind((ip, port))

s.listen()

while True:
    c, addr = s.accept()

    print(addr)

    while True:

        c.send('你好'.encode('utf-8'))




