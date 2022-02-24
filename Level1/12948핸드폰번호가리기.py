def solution(phone_number):
    answer = ''
    a = len(phone_number) - 4
    for i in range(1,a+1):
        answer += '*'
    
    #for j,i in enumerate(phone_number[-4:]):        
    return answer + phone_number[-4:]
