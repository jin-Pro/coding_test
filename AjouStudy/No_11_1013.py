import sys


def solve(num, checkString):
    length = len(checkString)

    if checkString == check[0]:
        if num[:length] == checkString:
            solve(num[length:], check[2])
            return
        else:
            print("NO")
            return

    elif checkString == check[1]:
        if num[:length] == checkString:
            if len(num) == length:
                print("YES")
                return
            else:
                if num[length] == '1':
                    solve(num[length:], check[0])
                    return
                else:
                    solve(num[length:], check[1])
                    return
        else:
            print("NO")
            return

    elif checkString == check[2]:
        for i in range(len(num)):
            if num[i] == '1':

                if i+1 == len(num):
                    print("YES")
                    return

                if num[i+1] == '1':
                    solve(num[i+1:], check[3])
                    return

                else:
                    solve(num[i+1:], check[1])
                    return
        print("NO")
        return

    else:
        for i in range(len(num)):
            if num[i] == '0':

                if num[i+1] == '0':
                    solve(num[i-1:], check[0])
                    return
                else:
                    solve(num[i:], check[1])
                    return
        print("YES")
        return


input = sys.stdin.readline

check = ['100', '01', '0', '1']

testCase = int(input())

for _ in range(testCase):
    num = input().rstrip()
    if num[-1] == '0':
        print("NO")
    else:
        if num[0] == '1':
            solve(num, check[0])

        elif num[0] == '0':
            solve(num, check[1])