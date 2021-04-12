import sys

input = sys.stdin.readline

string = input().rstrip()

answer = []
stack = []

for i in string:
    if 65 <= ord(i) <= 90:
        answer.append(i)
    else:
        if i == '+' or i == '-':
            while stack:
                target = stack.pop()
                if target == '(':
                    stack.append(target)
                    break
                else:
                    answer.append(target)

            stack.append(i)
        elif i == '*' or i == '/':
            while stack:
                target = stack.pop()
                if target == '(' or target == '-' or target == '+':
                    stack.append(target)
                    break
                else:
                    answer.append(target)

            stack.append(i)
        elif i == ')':
            while stack:
                target = stack.pop()
                if target == '(':
                    break
                else:
                    answer.append(target)
        else:
            stack.append(i)
while stack:
    answer.append(stack.pop())
print(''.join(answer))
