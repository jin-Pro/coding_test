import sys


def dfs(index, sum):
    global count
    global length

    if index == length:
        return

    sum += nums[index]

    if sum == S:
        count += 1

    dfs(index+1, sum)
    dfs(index+1, sum-nums[index])


input = sys.stdin.readline

N, S = map(int, input().split(' '))

nums = list(map(int, input().rstrip().split(' ')))

length = len(nums)

visit = [True] * length

count = 0

dfs(0, 0)

print(count)
