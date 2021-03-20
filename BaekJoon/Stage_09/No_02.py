listLength = 123456 * 2 + 1

sosu = [True] * listLength

for i in range(2, int(listLength**0.5)+1):
    if sosu[i]:
        for j in range(2*i, listLength, i):
            sosu[j] = False

def solve(num):
    if num == 1:
        print(1)
        return 0

    count = 0

    for i in range(num+1, 2 * num + 1):
        if sosu[i]:
            count += 1
    
    print(count)

num = int(input())

while num != 0:
    solve(num)

    num = int(input())