import sys

input = sys.stdin.readline

testCase = int(input())

for _ in range(testCase):
    number = int(input())
    callList = [input().strip() for _ in range(number)]

    callList.sort()
    
    same = True
    for i in range(number-1):
        leng = len(callList[i])
        if callList[i] == callList[i+1][:leng]:
            same = False
            break

    if same:
        print("YES")
    else:
        print("NO")
