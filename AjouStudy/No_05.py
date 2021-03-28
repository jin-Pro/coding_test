from collections import deque

def cal():
    answer = 0
    if first[0] == '1':
        answer += 1
    if second[0] == '1':
        answer += 2
    if third[0] == '1':
        answer += 4
    if fourth[0] == '1':
        answer += 8
    return answer


def circleMove(give,take,giveTooth,direction):
    if take == 0:
        return

    if take == 1:
        target = first
    elif take == 2:
        target = second
    elif take == 3:
        target = third
    else:
        target = fourth


    if give == 0:		
        if take != 4:
            if direction == 1:
                circleMove(take,take+1,target[2],-1)
            else:
                circleMove(take,take+1,target[2],1)

        if take != 1:
            if direction == 1:
                circleMove(take,take-1,target[6],-1)
            else :
                circleMove(take,take-1,target[6],1)

        if direction == 1:
            target.appendleft(target.pop())

        else:
            target.append(target.popleft())


    elif give - take == -1:	
        if giveTooth == target[6]:
            return
        else:
            if take!= 4 :
                if direction == 1:
                    circleMove(take,take+1,target[2],-1)
                else:
                    circleMove(take,take+1,target[2],1)
            
            if direction == 1:
                target.appendleft(target.pop())
            else:
                target.append(target.popleft())


    elif give - take == 1:		
        if giveTooth == target[2]:
            return
        else:
            if take != 1:
                if direction == 1:
                    circleMove(take,take-1,target[6],-1)
                else:
                    circleMove(take,take-1,target[6],1)

            if direction == 1:
                target.appendleft(target.pop())

            else:
                target.append(target.popleft())
    

first = deque(input())
second = deque(input())
third = deque(input())
fourth = deque(input())

testCase = int(input())

for i in range(testCase):
    target,direct = map(int,input().split())
    
    circleMove(0,target,-1,direct)

print(cal())

