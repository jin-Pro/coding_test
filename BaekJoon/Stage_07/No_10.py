num = int(input())

count = 0

for i in range(num):
    string = input()

    cancle = True
    dog = set([])
    target = ''

    for j in range(len(string)):
        if string[j] in dog :
            if string[j] != target:
                cancle = False;
                continue
        
        dog.add(string[j])
        target = string[j]
    
    if cancle :
        count += 1

print(count)
