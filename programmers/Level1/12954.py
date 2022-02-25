# x만큼 간격이 있는 n개의 숫자
def solution(x, n):
	answer = []
	i = 0
	e = x
	for i in range(n):
		answer.append(e)
		e += x
	return answer