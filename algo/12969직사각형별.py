a, b = map(int, input().strip().split(' '))
letter =''
for i in range(1,a + 1):
    letter += '*'
for j in range(1, b+ 1):
    print(letter)
#print(a,b)
