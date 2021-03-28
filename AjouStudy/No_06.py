import copy

def backCal(Item,direction,stage):  
    start_X = Item[0]
    start_Y = Item[1]

    direct = 0

    if stage == 1: 
        direct = (direction -1) %4
    if stage == 2: 
        direct = (direction +1) % 4
    if stage == 3:  
        direct = (direction + 2) % 4
    if stage == 4: 
        direct = (direction % 4)

    while True:
        start_X = start_X + dx[direct]
        start_Y = start_Y + dy[direct]

        if start_X < 0 or start_X >= N or start_Y < 0 or start_Y >= M:
            break
        
        value = space[start_X][start_Y]

        if value == '0' or value == '5' or value == '6':
            break

        if '#' in value:
            space[start_X][start_Y] = space[start_X][start_Y].replace('#','',1)
            if space[start_X][start_Y] == '':
                space[start_X][start_Y] = '0'

def backView(Item,direction):
    stage = space[Item[0]][Item[1]]
    backCal(Item,direction,1)

    if stage == '2' or stage == '4' or stage == '5':
        backCal(Item,direction,2)

    if stage == '3' or stage == '4' or stage == '5':
        backCal(Item,direction,3)

    if stage == '5':
        backCal(Item,direction,4)

def cal(Item,direction,stage):
    start_X = Item[0]
    start_Y = Item[1]
    
    direct = 0

    if stage == 1: 
        direct = (direction -1) % 4
    if stage == 2: 
        direct = (direction +1) % 4
    if stage == 3:  
        direct = (direction + 2) % 4
    if stage == 4: 
        direct = (direction % 4)

    while True:
        start_X = start_X + dx[direct]
        start_Y = start_Y + dy[direct]

        if start_X < 0 or start_X >= N or start_Y < 0 or start_Y >= M:
            break
        
        value = space[start_X][start_Y]

        if value == '6' or value == '5':
            break

        if value == '0':
            space[start_X][start_Y] = '#'

        if '#' in value:
            space[start_X][start_Y] += '#'
        

def view(Item,direction):

    stage = space[Item[0]][Item[1]]
    cal(Item,direction,1)
    

    if stage == '2' or stage == '4' or stage == '5':
        cal(Item,direction,2)

    if stage == '3' or stage == '4' or stage == '5':
        cal(Item,direction,3)

    if stage == '5':
        cal(Item,direction,4)


def countZero():
    answer = 0
    
    for i in range(N):
        answer += space[i].count('0')

    return answer

def solve(cctvItem,depth,direct):
    global space

    view(cctvItem,direct)
    
    minNum = N*M

    if depth+1 == len(cctv):
        return countZero()

    for i in range(1,5):
        minNum = min(minNum,solve(cctv[depth+1],depth+1,i))

        if minNum == 0:
            print(0)
            exit()

        backView(cctv[depth+1],i)
        
        if board[cctv[depth+1][0]][cctv[depth+1][1]] == '5':
            break
        if board[cctv[depth+1][0]][cctv[depth+1][1]] == '2':
            if i == 2:
                break

    return minNum

N,M = map(int,input().split())

board = [list(input().split()) for _ in range(N)]

direct = [1,2,3,4]

dx = [-1,0,1,0]
dy = [0,1,0,-1]

cctv = []

for i in range(N):
    for j in range(M):
        if board[i][j] != '0' and board[i][j] != '6':
            cctv.append([i,j])

minNum = N*M

for i in range(1,5):
    space = copy.deepcopy(board)
    if cctv:
        minNum = min(minNum,solve(cctv[0],0,i))
    else:
        minNum = countZero()

print(minNum)
