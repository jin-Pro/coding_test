fixCost,varCost,sellCost = map(int,input().split(" "))

if varCost >= sellCost :
    print(-1)
    exit()

count = fixCost // (sellCost - varCost)

print(count+1) 
