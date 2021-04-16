import sys


def calDP(a, b):
    if dp[a][b] == 0:
        dp[a][b] = calDP(a-1, b) + calDP(a, b-1)

    return dp[a][b]


def solve(a, b, k, string):
    if a == 0 or b == 0:
        return string, a, b

    if dp[a-1][b] >= k:
        string += 'a'
        return solve(a-1, b, k, string)
    else:
        string += 'z'
        return solve(a, b-1, k-dp[a-1][b], string)


input = sys.stdin.readline

N, M, K = map(int, input().split())

dp = [[0 for _ in range(101)] for _ in range(101)]

dp[1][0] = 1
dp[0][1] = 1

dp[N][M] = dp[N-1][M] + dp[N][M-1]

for i in range(101):
    dp[i][0] = 1
    dp[0][i] = 1

calDP(N, M)
if dp[N][M] < K:
    print(-1)
    exit()
    
answer, a, b = solve(N, M, K, '')

for _ in range(a):
    answer += 'a'
for _ in range(b):
    answer += 'z'
print(answer)