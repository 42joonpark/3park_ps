import sys
input = sys.stdin.readline

inum = int(input().strip())

a = inum 
aa = []
flag = 0
if inum > 100:
    a = inum - 9*(len(str(a)))
else :
    a = 1
for i in range(a,inum):
    # print(i)
    s = str(i)
    temp = 0
    for k in range(len(s)):
        temp += int(s[k])
    if temp + i == inum :
        # aa.append(i)
        print(i)
        flag = 1 
        break
if flag != 1:
    print(0)
# print(aa)

