spot = []

for i in range(3):
    x,y = map(int,input().split())
    spot.append([x,y])

if spot[1][0] == spot[0][0]:
    first = spot[2][0]
elif spot[1][0] == spot[2][0]:
    first = spot[0][0]
else:
    first = spot[1][0]

if spot[1][1] == spot[0][1]:
    second = spot[2][1]
elif spot[1][1] == spot[2][1]:
    second = spot[0][1]
else:
    second = spot[1][1]

print(first,second)