import sys
input = sys.stdin.readline

num_list =[]
for _ in range(0,21):
    num_list.append(_)
# print(num_list)
def switch(a,b):
    # print('switch',a,b)
    temp = num_list[a] 
    num_list[a] = num_list[b]
    num_list[b] = temp

# switch(num_list[0],num_list[1])
# print(num_list)

for _ in range(10):
    a,b = map(int,input().split())
    # print(a,b)
    while(1):
        if (a == b or a > b):
            break
        switch(a,b)
        # print(num_list)
        # print('-----',a,b)
        a += 1
        b -= 1

for i ,val in enumerate(num_list[1:]):
    # print(i,val)
    if i == 19:
        print(val)
    else:
        print(val,end=' ')

## 다른분 풀이
# arr = [i for i in range(0, 21)]
# for _ in range(10):
#     a, b = map(int, input().split())
#     b += 1
#     arr_  = arr[:a] + arr[a:b][::-1] + arr[b:]
#     arr = arr_
# print(' '.join(map(str,arr[1:])))