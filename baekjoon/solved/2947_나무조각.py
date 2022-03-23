import sys
input = sys.stdin.readline

tree_slack = list(map(int,input().split()))
flag = False
cnt = 0
def switch(a,b):
    temp = tree_slack[a]
    tree_slack[a] = tree_slack[b]
    tree_slack[b] = temp
k =0
while(k<10):
    for i in range(4):
        if tree_slack[i] > tree_slack[i+1]:
            switch(i,i+1)
            print(' '.join(map(str,tree_slack)))
    if flag == False:
        for i in range(4):
            if tree_slack[i] < tree_slack[i+1]:
                flag = True
                cnt += 1
                # print('----',cnt)
            else:
                flag = False
                break
    if cnt == 4:
        break
    k+=1