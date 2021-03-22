def gameOver(x,y,snake):
	#종료 환경 설정
    if x == -1 or y == -1 or x == matrix or y == matrix:
        return True

	#snake안에 x,y가 존재할때
    if [x,y] in snake:
        return True    
    
    return False

def catchApple(x,y,apple):
	#사과가 존재하는곳에 위치한다면
	#사과를 먹었으므로 false해두기 

    if apple[x][y]:
        apple[x][y] = False
        return True
    
    return False


def changeDir(direction,i):
    if i[1] == 'D' :
        if direction == [0,1]:
            direction[0] = 1
            direction[1] = 0
        
        elif direction == [1,0]:
            direction[0] = 0
            direction[1] = -1
        
        elif direction == [0,-1]:
            direction[0] = -1
            direction[1] = 0
        
        elif direction == [-1,0]:
            direction[0] = 0
            direction[1] = 1

    elif i[1] == 'L' :
        if direction == [0,1]:
            direction[0] = -1
            direction[1] = 0

        elif direction == [1,0]:
            direction[0] = 0
            direction[1] = 1
        
        elif direction == [0,-1]:
            direction[0] = 1
            direction[1] = 0
        
        elif direction == [-1,0]:
            direction[0] = 0
            direction[1] = -1

matrix = int(input())

apple = [[False] * matrix for _ in range(matrix)] 

appleNum = int(input())

for i in range(appleNum):
    row,column = map(int,input().split())
    apple[row-1][column-1] = True

dirChangeCount = int(input())
dirInfo = []

for i in range(dirChangeCount):
    time,direction = input().split()
    time = int(time)
    dirInfo.append([time,direction])

snake = []
direction = [0,1]
x = 0
y = 0
time = 0

snake.append([x,y])

while True:
    time += 1

    x = x + direction[0]
    y = y + direction[1]
    
    if gameOver(x,y,snake):
        print(time)
        break

    snake.append([x,y])
    

    if not catchApple(x,y,apple):
        snake.pop(0)


    for i in dirInfo:

        if time == i[0]:
            changeDir(direction,i)