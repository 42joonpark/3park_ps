# 9:33 ~ 
def solution(participant, completion):
    participant.sort()
    completion.sort()
    for i,person in enumerate(completion):
        if person != participant[i]:   
            return participant[i]
    return participant[-1]
