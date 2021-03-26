testCase = int(input())

def solve():
    
    x_1,y_1,r_1,x_2,y_2,r_2 = map(int,input().split())

    if x_1 == x_2 and y_1 == y_2:
        if r_1 == r_2:
            print(-1)
            return
        else:
            print(0)
            return
    
    else:  
        length = (x_1 - x_2) * (x_1 - x_2) + (y_1 - y_2) * (y_1 - y_2)
        dis = (r_1 + r_2) * (r_1 + r_2)
        dis_2 = (r_1 - r_2) * (r_1 - r_2)

        if length < dis_2 :
            print(0)
            return
            
        if length == dis_2 :
            print(1)
            return 

        if length == dis:
            print(1)
            return
        elif length < dis:
            print(2)
            return
        else:
            print(0)
            return

for i in range(testCase):
    solve() 