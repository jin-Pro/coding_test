num = int(input())

line = 0

while(num > line):
    num -= line
    line += 1

if line%2 == 0:
    # 짝수라면  1/line부터 시작
    up = str(num)
    down = str(line-num+1)
else:
    #  홀수라면 line/1부터 시작
    up = str(line-num+1)
    down = str(num)

print(up+"/"+down)