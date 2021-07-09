import sys


def cal(index, sum, oper):
    plus, minus, multi, div = oper
    if plus < 0 or minus < 0 or multi < 0 or div < 0:
        return -1000000000, 1000000000
    if index == N:
        return sum, sum

    oneMax, oneMin = cal(index+1, sum+nums[index], [plus-1, minus, multi, div])
    twoMax, twoMin = cal(index+1, sum-nums[index], [plus, minus-1, multi, div])
    threeMax, threeMin = cal(
        index+1, sum*nums[index], [plus, minus, multi-1, div])
    if sum < 0:
        sum = -sum
        sum = sum // nums[index]
        sum = -sum
    else:
        sum = sum // nums[index]
    fourMax, fourMin = cal(index+1, sum, [plus, minus, multi, div-1])

    return max(oneMax, twoMax, threeMax, fourMax), min(oneMin, twoMin, threeMin, fourMin)


input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split(" ")))

plus, minus, multi, div = map(int, input().rstrip().split(' '))

operator = ['plus', 'minus', 'multi', 'div']
calOper = [plus, minus, multi, div]

maxNum, minNum = cal(1, nums[0], calOper)

print(maxNum)
print(minNum)
