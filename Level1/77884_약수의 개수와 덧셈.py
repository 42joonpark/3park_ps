def solution(left, right):
	answer = 0
	count = 0
	while left <= right:
		count = cnt_check(left)
		if count % 2 == 0:
			answer += left
		else:
			answer -= left
		left += 1
	return answer

def cnt_check(a):
	cnt = 0
	i = 1
	condition = a // 2
	while i <= condition:
		if a % i == 0:
			cnt += 1
		i += 1
	return cnt + 1