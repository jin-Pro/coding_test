import copy

#풀이 설명 : anta,tica 사이에 있는 단어들을 list로 저장을 해준다.
#list에 있는 단어를 set으로 중복을 제거하고 다시 저장해준다.
# 중복을 제거한 알파벳들을 하나씩 브루트포스로 골라서 list에있는 알파벳들을 지워주면서 모든 경우를 탐색한다.

def countEmpty(copyList):
    count = 0
    for i in copyList:
        if i == []:
            count += 1
    return count

def solve(delNum,depth,copyList):

    if depth == 0 or delNum == len(appendToList):  
        return countEmpty(copyList)

    maxNum = 0

    remove = False

    for i in copyList:

        if appendToList[delNum] in i:
            i.remove(appendToList[delNum])   
            remove = True
    
    if remove:
        a = solve(delNum+1,depth-1,copyList)
    else:
        a = solve(delNum+1,depth,copyList)
    if maxNum < a :
        maxNum = a

    return maxNum


N,K = map(int,input().split())
M = K
lang = ['a','n','t','i','c']
count = 0
K = K-5

appendlang = []

for i in range(N):
    language = input()
    language = language[4:]
    language = language[:-4]

    appendlang.append(list(set(language)))

appendlang.sort(key=len)

if K < 0:
    print(0)
    exit()

emptyNum = appendlang.count([])

if N == emptyNum:
    print(N)
    exit()

for i in appendlang:
    j = 0

    while True:
        if j == len(i):
            break
        if i[j] in lang:
            i.remove(i[j])
        else :
            j+= 1

appendToList = ''

for i in appendlang:
    for j in i:
        appendToList += j

appendToList = list(set(appendToList))
appendToList.sort(key = len)
maxNumber = 0

for i in range(len(appendToList)):
    copyList = copy.deepcopy(appendlang)
    b = solve(i,K,copyList)
    if maxNumber < b :
        maxNumber = b

print(maxNumber)
