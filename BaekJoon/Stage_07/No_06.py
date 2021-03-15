string = input().split(" ")

num = len(string)

for i in string:
    if i == '':
        num -= 1
print(num)