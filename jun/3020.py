
import sys
input = sys.stdin.readline

if __name__ == "__main__":
    n, h = map(int, input().split())
    #for i in range(n):
    #    n_list.append(int(input().strip()))
    n_list = [int(input().strip()) for i in range(n)]
    print(n_list)
    temp = [0 for i in range(h)] 
    print(n_list)
    print(temp) 
    for index,val in enumerate(n_list):
        if(index % 2 == 0):
            for k in range(val):
                temp[k] = temp[k] + 1
        else:
            for r in range(val):
                print(h-r-1)
                temp[h-r-1] = temp[h-r-1] + 1

    print(temp)
    max_v = min(temp)
    count = temp.count(max_v)
    print(max_v, count)
            
        

    
