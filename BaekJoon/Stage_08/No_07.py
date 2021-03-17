kilo = int(input())

first = 0
second = 0

while kilo >= 0:
    if kilo % 5 == 0:
        second = kilo // 5
        print(first + second)
        exit(0)
    
    kilo -= 3
    first += 1

print(-1)
