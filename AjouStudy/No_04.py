from collections import deque

N,M = map(int,input().split())

robot_x,robot_y,robotDir = map(int,input().split())

board = [list(map(int,input().split())) for _ in range(N)]

dx = [-1,0,1,0]
dy = [0,1,0,-1]

cleanCount = 0

while True:
    q = deque()
    q.append([robot_x,robot_y])
    if board[robot_x][robot_y] == 0:
        board[robot_x][robot_y] = 2
        cleanCount += 1

    while q:
        for i in range(len(q)):
            cur = q.popleft() 

            for j in range(4):
                nx = cur[0] + dx[(robotDir -1)%4]
                ny = cur[1] + dy[(robotDir -1)%4]
                robotDir = (robotDir-1)%4

                if board[nx][ny] == 0:
                    robot_x = nx
                    robot_y = ny
                    break
                else:
                    if j == 3:
                        nx = cur[0] + dx[(robotDir + 2) % 4]
                        ny = cur[1] + dy[(robotDir + 2) % 4]
                        if board[nx][ny] == 1:
                            print(cleanCount)
                            exit()
                        robot_x = nx
                        robot_y = ny