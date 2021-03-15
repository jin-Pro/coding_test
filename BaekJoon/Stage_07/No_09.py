string = ['c=','c-','dz=','d-','lj','nj','s=','z=']

inputString = input()

for i in string:
    inputString = inputString.replace(i,"*");
        
print(len(inputString))