string = input().upper()

setStr = list(set(string))

strCount = []

for i in setStr:
    strCount.append(string.count(i))

if strCount.count(max(strCount)) > 1:
    print("?")
else :
    print(setStr[strCount.index(max(strCount))])