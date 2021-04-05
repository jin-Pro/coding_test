import sys

input = sys.stdin.readline

countTree = 0
trees = []

while True:
    tree = input().rstrip()
    if tree == '':
        break
    countTree += 1
    trees.append(tree)

trees.sort()

treeInfo = ''

count = 1

for i in range(countTree-1):
    if trees[i] == trees[i+1]:
        count += 1
    else:
        print("%s %.4f" % (trees[i], count/countTree * 100))
        count = 1

print("%s %.4f" % (trees[-1], count/countTree * 100))