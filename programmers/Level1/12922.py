# 수박수박수박수박수박수
def solution(n):
	answer = ''
	i = 0
	while i < n:
		if (i % 2 == 0):
			answer += "수"
		else:
			answer += "박"
		i += 1
	return answer