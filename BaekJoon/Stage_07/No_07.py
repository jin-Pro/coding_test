string = list(input().split(" "))

a = int(string[0][::-1])
b = int(string[1][::-1])

if a >= b:
    print(a)
else :
    print(b)
