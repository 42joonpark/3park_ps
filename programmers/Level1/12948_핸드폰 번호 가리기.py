def solution(phone_number):
	answer = ''
	i = len(phone_number)
	k = 0
	for x in range(i - 4):
		answer += '*'
	answer += ''.join(reversed(phone_number[:-5:-1]))
	return answer