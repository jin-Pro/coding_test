import sys

count = map(int,sys.stdin.readline())

num = list(input())

result = 0

for i in num:
    result += int(i)

print(result)
