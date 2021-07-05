import sys


def first(root):
    print(chr(root+64), end='')

    if not node[root][0] == ' ':
        first(node[root][0])
    if not node[root][1] == ' ':
        first(node[root][1])


def second(root):
    if not node[root][0] == ' ':
        second(node[root][0])

    print(chr(root+64), end='')

    if not node[root][1] == ' ':
        second(node[root][1])


def third(root):
    if not node[root][0] == ' ':
        third(node[root][0])
    if not node[root][1] == ' ':
        third(node[root][1])

    print(chr(root+64), end='')


N = int(input())

node = [[] for _ in range(N+1)]

for _ in range(N):
    root, left, right = input().rstrip().split(' ')
    root = ord(root) - 64
    left = ord(left) - 64
    right = ord(right) - 64

    if left < 0:
        left = ' '
    if right < 0:
        right = ' '

    node[root].append(left)
    node[root].append(right)

first(1)
print()
second(1)
print()
third(1)
