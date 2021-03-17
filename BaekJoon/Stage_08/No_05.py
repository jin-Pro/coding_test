testCase = int(input())

for i in range(testCase):
    H,W,N = map(int,input().split())
    if N % H == 0 :
        stair = H * 100
        roomNum = N//H
    else :
        stair = N % H * 100
        roomNum = N // H + 1
    room = stair + roomNum

    print(room)
