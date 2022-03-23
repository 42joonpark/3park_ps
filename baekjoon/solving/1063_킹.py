import sys
input = sys.stdin.readline

# R : 한 칸 오른쪽으로
# L : 한 칸 왼쪽으로
# B : 한 칸 아래로
# T : 한 칸 위로
# RT : 오른쪽 위 대각선으로
# LT : 왼쪽 위 대각선으로
# RB : 오른쪽 아래 대각선으로
# LB : 왼쪽 아래 대각선으로
row = ['A','B','C','D','E','F','G','H']
col = [ 8,  7,  6,  5,  4,  3 , 2,  1]
arr = [[0] * 8 for _ in range(8)]
print(arr)
a,b,c = map(str,input().split())
# print(row.index('A'))
arr[col.index(int(a[1]))][row.index(a[0])] = 1
king_y = col.index(int(a[1]))
king_x = row.index(a[0])
arr[col.index(int(b[1]))][row.index(b[0])] = 2
stone_y = col.index(int(b[1]))
stone_x = row.index(b[0])

# arr[row.index(a[0])][col.index(int(a[1]))] = 1
# arr[row.index(b[0])][col.index(int(b[1]))] = 2
for i in arr:
    print(i)
for i in range(int(c)):
    inp = str(input().strip())
    if inp == 'R':
        king_x += 1
        stone_x += 1

arr[king_x][king_y] = 1
arr[stone_x][stone_y] = 2
for i in arr:
    print(i)