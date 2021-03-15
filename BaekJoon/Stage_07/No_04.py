count = int(input())

for i in range(count):
    a = list(input().split())
    
    num = int(a[0])

    for i in range(len(a[1])):
        print(a[1][i] * num, end = "")
    print()