import sys


def solve(index, answer, depth, mo, so):
    if depth >= L:
        if mo >= 1 and so >= 2:
            print(answer)
        return
    

    for i in range(index, C):
        if alpha[i] in mother:
            solve(i+1, answer+alpha[i], depth+1, mo+1, so)
        else:
            solve(i+1, answer+alpha[i], depth+1, mo, so+1)


input = sys.stdin.readline

L, C = map(int, input().split())
alpha = list(input().rstrip().split())

mother = ['a', 'e', 'i', 'o', 'u']

alpha.sort()
for i in range(C-3):

    answer = ''
    if alpha[i] in mother:
        solve(i+1, alpha[i], 1, 1, 0)
    else:
        solve(i+1, alpha[i], 1, 0, 1)