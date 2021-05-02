import sys


def solve(a, b, row, high):
    x = check(a, row, high)
    dis = abs(x-a) + b
    if dis > L:
        return False
    return True


def check(a, row, high):
    if row >= high:
        num1 = abs(sadae[row] - a)
        num2 = 1000000000
        num3 = 1000000000
        if row-1 >= 0:
            num2 = abs(sadae[row-1] - a)
        if row+1 < M:
            num3 = abs(sadae[row+1] - a)

        if min(num1, num2, num3) == num3:
            return sadae[row+1]
        elif min(num1, num2, num3) == num2:
            return sadae[row-1]
        else:
            return sadae[row]

    mid = (row + high)//2
    if a == sadae[mid]:
        return a
    elif a < sadae[mid]:
        return check(a, row, mid-1)
    else:
        return check(a, mid+1, high)


input = sys.stdin.readline

M, N, L = map(int, input().split())

sadae = list(map(int, input().split()))
sadae.sort()

animal = [list(map(int, input().split())) for _ in range(N)]

count = 0

for i in animal:
    a, b = i
    if solve(a, b, 0, M-1):
        count += 1

print(count)