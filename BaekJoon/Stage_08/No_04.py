go,back,arrive = map(int,input().split(" "))

if (arrive - go) % (go - back) == 0 :
    print( (arrive - go) // (go - back)  + 1)
else :
    print((arrive - go) // (go - back) + 2)