# 하샤드 수
def solution(x):
	answer = True
	a = sum(list(map(int, list(str(x)))))
	if (x % a != 0):
		answer = False
	return answer