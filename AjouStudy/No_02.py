a,b = map(int,input().split())

board = [list(map(int,input().split())) for _ in range(a)]

visit = [[False] * b ] * a

maxNum = 0

def solve(row,column,depth,sum):
    if row < 0 or column < 0 or row >= a or column >= b:
        return 

    if depth == 5:
        global maxNum
        if sum > maxNum:
            maxNum = sum
        return
    
    if visit[row][column] == False:
        visit[row][column] = True
        solve(row-1,column,depth+1,sum + board[row][column])
        solve(row+1,column,depth+1,sum + board[row][column])
        solve(row,column-1,depth+1,sum + board[row][column])
        solve(row,column+1,depth+1,sum + board[row][column])
        visit[row][column] = False

def solve2(row,col):
    global maxNum
    one,two,three,four = 0,0,0,0

    if row + 2 < a and col + 1 < b:
        one = board[row][col] + board[row+1][col] + board[row+2][col] + board[row+1][col+1]
    if row + 2 < a and col -1 >= 0:
        two = board[row][col] + board[row+1][col] + board[row+2][col] + board[row+1][col-1]
    if row + 1 < a and col + 2 < b:
        three = board[row][col] + board[row][col+1] + board[row][col+2] + board[row+1][col+1]
    if row - 1 >= 0 and col + 2 < b:
        four = board[row][col] + board[row][col+1] + board[row][col+2] + board[row-1][col+1]
    
    maxNum = max(one,two,three,four,maxNum)
    
    return 

for i in range(a):
    for j in range(b):
        solve(i,j,1,0)
        solve2(i,j)

print(maxNum)