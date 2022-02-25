# 콜라츠추측
def solution(num):
	answer = 0
	while (True):
		if (num == 1):
			break
		if (num % 2 == 0):
			num /= 2
		else:
			num = num * 3 + 1
		answer += 1
		if (answer > 500):
			answer = -1
			break
	return answer