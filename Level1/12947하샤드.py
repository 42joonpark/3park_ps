import math

def get_sum(sum,x):
    sum += math.floor(x%10)
    if x < 9:
        return sum
    return get_sum(sum,math.floor(x/10))

def solution(x):
    sum = 0
    answer = False
    #print(math.floor(x%10))
    #print(get_sum(sum,x))
    if (x % get_sum(sum,x) ) == 0:
        answer = True
    return answer
