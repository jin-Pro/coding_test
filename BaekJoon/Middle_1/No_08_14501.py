import sys


def bruteforce(cur, add, sum):
    if cur + add > N + 1:
        return (sum - schedule[cur][2])

    # print("cur :", cur)
    # print("add :", add)
    # print("sum :", sum)
    # print("len(schedule) :", len(schedule))

    maxNum = sum

    for i in range(cur+add, len(schedule)):
        next, day, money = schedule[i]
        maxNum = max(maxNum, bruteforce(next, day, sum+money))

    return maxNum


input = sys.stdin.readline

N = int(input())

schedule = [()]

for i in range(1, N+1):
    T, P = map(int, input().split(' '))
    schedule.append((i, T, P))

maxNum = 0

for i in range(1, len(schedule)):
    start, day, money = schedule[i]
    if start + day <= N+1:
        maxNum = max(maxNum, bruteforce(start, day, money))

print(maxNum)
