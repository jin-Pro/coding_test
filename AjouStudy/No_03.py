from collections import deque


matrix = int(input())

board = [list(map(int,input().split())) for _ in range(matrix)]

dx = [-1,0,1,0]
dy = [0,-1,0,1]

sharkSize = 2
eatCount = 0

mySeat_x = -1
mySeat_y = -1

count = 0

for i in range(matrix):
    for j in range(matrix):
        if board[i][j] == 9:
            mySeat_x = i
            mySeat_y = j
    

while True:
    q = deque()
    q.append((mySeat_x,mySeat_y))
    smallFish = []
    visit = [[1] * matrix for _ in range(matrix)]
    visit[mySeat_x][mySeat_y] = 0
    setting = False
    dis = 0
    
    while q:

        for i in range(len(q)):
            curr = q.popleft()

            for s in range(4):
                nx = curr[0] + dx[s]
                ny = curr[1] + dy[s]

                if 0 <= nx < matrix and 0 <= ny < matrix and board[nx][ny] <= sharkSize and visit[nx][ny]:
                    q.append((nx,ny))
                    visit[nx][ny] = 0

                    if 0 < board[nx][ny] < sharkSize:
                        smallFish.append([dis+1,nx,ny])
        dis += 1

        if smallFish:
            board[mySeat_x][mySeat_y] = 0
            
            smallFish.sort()

            mySeat_x = smallFish[0][1]
            mySeat_y = smallFish[0][2]

            count += smallFish[0][0]
            eatCount += 1
            
            if eatCount == sharkSize:
                sharkSize += 1
                eatCount = 0

            board[mySeat_x][mySeat_y] = 9

            setting = True
            break;
        

    if not smallFish:
        break


print(count) 
