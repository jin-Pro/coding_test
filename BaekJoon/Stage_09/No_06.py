a,b,c = map(int,input().split())

while a != 0 and b != 0 and c != 0:
    d = max(a,b,c)
    sum = a*a + b*b + c*c

    if sum == 2 * d * d:
        print("right")
    else :
        print("wrong")

    a,b,c = map(int,input().split())