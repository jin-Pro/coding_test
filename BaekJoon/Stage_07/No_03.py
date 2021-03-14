string = input()

count = [-1] *(ord('z') - ord('a')+1)

for i in range(len(string)):
    if count[ord(string[i]) - ord('a')] != -1:
        continue
    else :
        count[ord(string[i]) - ord('a')] = i

for i in range(len(count)):
    print(count[i] ,end=" ");