testCase = int(input())

for i in range(testCase):
    start,arrive = map(int,input().split())
    dif = arrive - start
    num = 1

    while True:
        if num**2 <= dif < (num+1)**2 :
            break
        num += 1

    if num ** 2 == dif:
        print(num * 2 -1)
    elif num**2 < dif <= num ** 2 + num:
        print(num*2)
    else :
        print(num * 2 + 1)