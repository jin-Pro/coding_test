num = int(input())

count = 1
num -= 1
minus = 6

while(1):
    if num <= 0:
        break
    num -= minus
    count += 1


    minus += 6

print(count)
