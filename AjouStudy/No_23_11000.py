import sys
import heapq

N = int(sys.stdin.readline().strip())
lesson = []

for _ in range(N):
    lesson.append(list(map(int, sys.stdin.readline().split())))

lesson.sort()
heap = []
heapq.heappush(heap, lesson[0][1])

for i in range(1, N):
    if heap[0] > lesson[i][0]:
        heapq.heappush(heap, lesson[i][1])
    else:
        heapq.heappop(heap)
        heapq.heappush(heap, lesson[i][1])

print(len(heap))