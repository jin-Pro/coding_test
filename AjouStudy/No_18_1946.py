import sys

input = sys.stdin.readline

testCase = int(input())

for _ in range(testCase):
    peopleNum = int(input())
    grade = [list(map(int, input().rstrip().split()))
             for _ in range(peopleNum)]

    grade.sort()

    target = grade[0][1]
    target2 = grade[0][1]
    target3 = grade[0][0]
    count = 0

    for i in range(peopleNum):
        if target >= grade[i][1]:
            if target2 >= grade[i][1]:
                target2 = grade[i][1]
                target3 = grade[i][0]
                count += 1

            else:
                if target3 > grade[i][0]:
                    count += 1
    print(count)