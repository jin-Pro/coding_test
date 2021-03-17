testCase = int(input())

for i in range(testCase):
    stair = int(input())
    roomNum = int(input())

    people = [l for l in range(1,roomNum+1)]

    for j in range(stair):
        for k in range(1,roomNum):
            people[k] += people[k-1]
    print(people[-1])

