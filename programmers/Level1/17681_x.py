
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

# print(changeBinary(9, 5))

def solution(n, arr1, arr2):
	answer = []
	arr = []
	brr = []
	crr = [[0]*n] * n
	print(crr)
	for a in arr1:
		arr.append(changeBinary(a, n))
	print(arr)


	for b in arr2:
		brr.append(changeBinary(b, n))
	print(brr)

	for i in range(0, n):
		for j in range(0, n):
			k = arr[i][j] + brr[i][j]
			if k == 0:
				print(i,j)
				crr[i][j] = ' '
			else:
				print(i,j)
				crr[i][j] = '#'
			print(f"k: {k} | i, j: {i}, {j} | crr[{i}][{j}]: ",crr[i][j])

	print("")
	print(crr)

	for i in range(0, n):
		answer.append(''.join(crr[i]))


	# result = [ i + j for i in arr[0] for j in brr[0] ]
	# print(result)

	return answer

print(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))