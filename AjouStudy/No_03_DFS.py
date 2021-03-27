def catchSmallFish():
    global count,eatCount,sharkSize,eatCount,mySeat_x,mySeat_y

    mySeat_x = smallFish[0][1]
    mySeat_y = smallFish[0][2]
    count += smallFish[0][0]
    eatCount += 1

    if eatCount == sharkSize:
        sharkSize += 1
        eatCount = 0

    deleteIndex = fish.index([mySeat_x,mySeat_y,board[mySeat_x][mySeat_y]])     # index(찾는 원소) >> 찾는 원소의 인덱스값 반환
    fish.pop(deleteIndex)       # pop(인덱스값) 인덱스값을 지움

def countDistance(move_X,move_Y,count,arrive_X,arrive_Y):
    if move_X < 0 or move_Y < 0 or move_X == matrix or move_Y == matrix:
        return 9999
    
    if move_X == arrive_X and move_Y == arrive_Y:
        return count

    a,b,c,d = 9999,9999,9999,9999

    if move_X + 1 < matrix and visit[move_X+1][move_Y]:
        visit[move_X+1][move_Y] = False;
        a = countDistance(move_X+1,move_Y,count+1,arrive_X,arrive_Y)
        visit[move_X+1][move_Y] = True;

    if move_Y + 1 < matrix and visit[move_X][move_Y+1]:
        visit[move_X][move_Y+1] = False;
        b = countDistance(move_X,move_Y+1,count+1,arrive_X,arrive_Y)
        visit[move_X][move_Y+1] = True;

    if move_X - 1 >= 0 and visit[move_X-1][move_Y]:
        visit[move_X-1][move_Y] = False;
        c = countDistance(move_X-1,move_Y,count+1,arrive_X,arrive_Y)
        visit[move_X-1][move_Y] = True;

    if move_Y - 1 >= 0 and visit[move_X][move_Y-1]:
        visit[move_X][move_Y-1] = False;
        d = countDistance(move_X,move_Y-1,count+1,arrive_X,arrive_Y)
        visit[move_X][move_Y-1] = True;
    return min(a,b,c,d)

def findDistance(x,y):
    visit[mySeat_x][mySeat_y] = False;
    answer =  countDistance(mySeat_x,mySeat_y,0,x,y)
    visit[mySeat_x][mySeat_y] = True;
    return answer




def findSmallFish():
    smallFish.clear()

    for i in fish:

        if i[2] <= sharkSize:
            visit[i[0]][i[1]] = True
        else:
            visit[i[0]][i[1]] = False

    for i in fish:
        if i[2] < sharkSize:
            smallFish.append([findDistance(i[0],i[1]),i[0],i[1]])   # findDistance의 조건에는 이동하는 경로에 물고기가 없어야한다.
        
    if smallFish == []:
        return -1

    smallFish.sort()     # FindDistance의 길이가 작은 순서대로, 그리고 행의 수가 작을수록, 그리고 열의 수가 작은순서로 정렬한다.
    catchSmallFish()    # smallFish의 0번째 인덱스로 아기상어의 위치를 이동하고 count에 distance만큼  더한다. eatCount에 1을 증가해주고 sharkSize의 변화를 확인한다.

    return 1


matrix = int(input())

board = [list(map(int,input().split())) for _ in range(matrix)]
visit = [[True] * matrix for _ in range(matrix)]

fish = []
smallFish = []

sharkSize = 2
eatCount = 0

mySeat_x = -1
mySeat_y = -1

count = 0

for i in range(matrix):                    # i,j로 한 이유가 fish에 list로 열과 행으로 fish의 정보를 넣어주기 위해서
    for j in range(matrix):
        if board[i][j] > 0 and board[i][j] < 7:
            fish.append([i,j,board[i][j]])      #물고기의 위치를 저장한다.
        if board[i][j] == 9:
            mySeat_x = i            #현재 아기상어의 위치를 구한다.
            mySeat_y = j

while True:
    if findSmallFish() == -1:
        print(count)
        break;