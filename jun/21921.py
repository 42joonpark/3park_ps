#https://www.acmicpc.net/source/53959988

import sys
input = sys.stdin.readline

a,b = map(int,input().split())
num_list = list(map(int,input().split()))

cum = num_list.copy()
k = 0
temp = []
for i in cum:
    k = k + i
    temp.append(k)


#print(temp)
re = []
k = 0
#print(b-1, a-b+1)
for i in range(b-1,a):
    #print(i,k)
    if (i == b-1):
        re.append(temp[i])
    else:
        re.append(temp[i]-temp[k])
        k = k+1

#print(re)

t = max(re)
if (t == 0):
    print("SAD")
else:
    print(t)
    print(re.count(t))
