import math

def catch(num):
    for j in range(2,int(math.sqrt(num))+1):
        if num % j == 0:
            return False
    
    return True

def solve(num):
    for i in range(num//2,1,-1):
        if catch(i) and catch(num-i):
            print(i,num-i)
            return

TestCase = int(input())

for i in range(TestCase):
    num = int(input())
    solve(num)
