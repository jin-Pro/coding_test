import sys
input = sys.stdin.readline

N = int(input())
K = int(input())
sensor = list(map(int, input().split()))
#sensor = input().rstrip().split(" ")
if N == 1:
    print(0)
else : 
    sensor.sort()
    dis = []

    for i in range(0, len(sensor)-1):
        dis.append((int(sensor[i+1]) - int(sensor[i])))

    dis.sort()
    K = K-1

    while True:
        if K == 0:
            break
        dis.pop()
        K -= 1
    sum = 0

    for i in dis:
        sum += i

    print(sum)