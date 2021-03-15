dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

string = list(input())

sum = 0

for i in string:
    for j in dial:
        if i in j:
            sum += dial.index(j) + 3

print(sum)
