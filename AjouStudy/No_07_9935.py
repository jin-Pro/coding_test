string = input()
bomb = input()

answer = []

for i in string:
    answer.append(i)

    same = True

    if len(answer) >= len(bomb):
        for j in range(1,len(bomb)+1):
            if answer[-j] != bomb[-j]:
                same = False
                break

        if same:
            for _ in range(len(bomb)):
                answer.pop()

if answer:
    print(''.join(answer))
else:
    print("FRULA")