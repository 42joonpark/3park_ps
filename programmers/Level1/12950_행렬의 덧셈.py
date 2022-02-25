def solution(arr1, arr2):
	answer = [[i for i in arr1[0]] for i in arr1]
	i = 0
	for i in range(0, len(arr1)):
		for j in range(0, len(arr1[i])):
			answer[i][j] = arr1[i][j] + arr2[i][j]
	return answer