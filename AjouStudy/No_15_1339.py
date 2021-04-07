import sys

input = sys.stdin.readline

num = int(input())

inputLang = [input().rstrip() for _ in range(num)]

langCount = [[0, 'A'], [0, 'B'], [0, 'C'], [0, 'D'], [0, 'E'], [0, 'F'], [0, 'G'], [0, 'H'], [0, 'I'], [0, 'J'], [0, 'K'], [0, 'L'], [
    0, 'M'], [0, 'N'], [0, 'O'], [0, 'P'], [0, 'Q'], [0, 'R'], [0, 'S'], [0, 'T'], [0, 'U'], [0, 'V'], [0, 'W'], [0, 'X'], [0, 'Y'], [0, 'Z']]

answer = []

for i in inputLang:
    for j in range(len(i)):
        stringLen = len(i) - j
        target = ord(i[j]) - ord('A')
        langCount[target][0] += 10 ** stringLen

langCount.sort(reverse=True)

for i in inputLang:
    string = ''

    for j in i:
        for k in range(26):
            if j == langCount[k][1]:
                string += str(9-k)

    answer.append(string)
sum = 0

for i in answer:
    sum += int(i)

print(sum)
