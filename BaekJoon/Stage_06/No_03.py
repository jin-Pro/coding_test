import sys

def solve(n):
    a = int(str(n)[1]) - int(str(n)[0])

    for i in range(1,len(str(n))):   #0,1,2
        if a != int(str(n)[i]) - int(str(n)[i-1]):
            return 0

    return 1

num = int(sys.stdin.readline())

if num < 100:
    print(num)
else :
    count = 99
    for i in range(100,num + 1):
        count += solve(i)
    
    print(count)