x,y,w,h = map(int,input().split())

leastWidth = (w-x) if x > (w - x) else x
leastHeight = (h-y) if y > (h - y) else y
print(leastWidth if leastWidth < leastHeight else leastHeight)