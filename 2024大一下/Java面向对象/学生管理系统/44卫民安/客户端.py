from socket import *

def client():
    c = socket()

    ip = gethostname()

    port = 8888

    c.connect((ip, port))
    while True:
        r(c)

def r(c):
    n = c.recv(1024).decode('utf-8')

    print(n)


client()






