def catch(num):
    if num == 1:
        return False
    for i in range(2,num):
        if num % i == 0:
            return False
    
    return True

M = int(input())
N = int(input())

min = N
sum = 0

for i in range(M,N+1):
    if catch(i):
        sum += i
        if min > i:
            min = i

if sum != 0:
    print(sum,min)
else:
    print(-1)
