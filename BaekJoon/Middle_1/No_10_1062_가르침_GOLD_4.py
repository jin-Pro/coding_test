import sys

input = sys.stdin.readline


def dfs(index, tempAppend, tempWords, depth):
    if depth == K:
        count = 0
        for i in tempWords:
            if i == []:
                count += 1

        return count

    newTempAppend = []

    target = tempAppend[index]

    for i in range(len(tempAppend)):
        if not tempAppend[i] == target:
            newTempAppend.append(tempAppend[i])

    newTempWords = []

    for word in tempWords:
        newWord = []
        for j in range(len(word)):
            if not word[j] == target:
                newWord.append(word[j])
        newTempWords.append(newWord)

    maxAns = 0

    if index >= len(newTempAppend):
        maxAns = max(maxAns, dfs(len(newTempAppend)-1,
                     newTempAppend, newTempWords, depth+1))
    else:
        for i in range(index, len(newTempAppend)):
            maxAns = max(maxAns, dfs(i, newTempAppend, newTempWords, depth+1))

    return maxAns


N, K = map(int, input().split(' '))


K = K-5

words = []
initWord = ['a', 'n', 't', 'i', 'c']
appendWord = set()

for _ in range(N):
    word = list(input().rstrip())
    word = word[4:]
    word = word[:-4]
    word = list(set(word))
    newWord = []

    for i in range(len(word)):
        if not word[i] in initWord:
            newWord.append(word[i])
            appendWord.add(word[i])
    words.append(newWord)

if K < 0:
    print("0")
else:

    appendWord = list(appendWord)

    maxNum = 0

    if K == 0:
        maxNum = dfs(0, appendWord, words, 0)
    else:
        for i in range(len(appendWord)):
            maxNum = max(maxNum, dfs(i, appendWord, words, 0))

    print(maxNum)
