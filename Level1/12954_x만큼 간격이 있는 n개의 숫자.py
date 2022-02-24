def solution(x, n):
	answer = []
	i = 0
	e = x
	for i in range(n):
		answer.append(e)
		e += x
	return answer