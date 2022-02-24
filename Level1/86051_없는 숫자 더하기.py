def solution(numbers):
	answer = 0
	arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
	for x in arr :
		for y in numbers :
			if x == y :
				answer += y
	answer = 45 - answer
	return answer