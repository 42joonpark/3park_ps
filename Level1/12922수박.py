def solution(n):
    one = '수'
    two = '박'
    a =[one,two]
    answer =''
    for i in range(1,n+1):
        if(i % 2==0):
            answer+=a[1]
        else:
            answer+=a[0]
        
    return answer
