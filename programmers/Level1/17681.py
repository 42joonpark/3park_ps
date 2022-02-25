# [1차] 비밀지도
def changeBinary(num, n):
	lst = []
	while num != 0:
		lst.append(num % 2)
		num = num // 2
	if (len(lst) < n):
		for i in range(0, n - len(lst)):
			lst.append(0)
	lst.reverse()
	return (lst)

def solution(n, arr1, arr2):
	answer = []
	arr = []
	brr = []
	crr = [[0 for i in range(n)] for j in range(n)]		# crr = [[0]*n] * n  (python에서 배열 생성시 동작 방식의 차이가 있다.)
	for a in arr1:
		arr.append(changeBinary(a, n))
	for b in arr2:
		brr.append(changeBinary(b, n))
	for i in range(0, n):
		for j in range(0, n):
			k = arr[i][j] + brr[i][j]
			if k == 0:
				crr[i][j] = ' '
			else:
				crr[i][j] = '#'
	for i in range(0, n):
		answer.append(''.join(crr[i]))
	return answer

print(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))
