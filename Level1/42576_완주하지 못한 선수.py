def solution(participant, completion):
	answer = ''
	participant.sort()
	completion.sort()
	completion.append("")
	i = 0
	while i < len(participant):
		if (participant[i] != completion[i]):
			answer = participant[i]
			return answer
		i += 1