# [1차] 다트 게임
def solution(dartResult):
	answer = 0
	lst = []
	i = 0
	while i < len(dartResult):
		k = i
		while dartResult[i].isdigit():
			i += 1
		lst.append(dartResult[k:i])
		lst.append(dartResult[i])
		i += 1
		j = i
		if i == len(dartResult):
			break
		while not dartResult[i].isdigit():
			i += 1
			if i == len(dartResult):
				break
		if dartResult[j:i] != '':
			lst.append(dartResult[j:i])
	# print(lst)
	a = b = c = i = 0
	# a
	a = int(lst[0])
	i += 1
	if lst[i] == 'S':
		a **= 1
	elif lst[i] == 'D':
		a **= 2
	elif lst[i] == 'T':
		a **= 3
	i += 1
	if not lst[i].isdigit():
		if lst[i] == '#':
			a *= -1
		elif lst[i] == '*':
			a *= 2
		i += 1
	# b
	k = i
	b = int (lst[k])
	i += 1
	if lst[i] == 'S':
		b **= 1
	elif lst[i] == 'D':
		b **= 2
	elif lst[i] == 'T':
		b **= 3
	i += 1
	if not lst[i].isdigit():
		if lst[i] == '#':
			b *= -1
		elif lst[i] == '*':
			b *= 2
			a *= 2
		i += 1
	# c
	k = i
	c = int (lst[k])
	i += 1
	if lst[i] == 'S':
		c **= 1
	elif lst[i] == 'D':
		c **= 2
	elif lst[i] == 'T':
		c **= 3
	i += 1
	if (i != len(lst)):
		if not lst[i].isdigit():
			if lst[i] == '#':
				c *= -1
			elif lst[i] == '*':
				c *= 2
				b *= 2
			i += 1
	# print(a, b, c)
	answer = a + b + c
	return answer


# solution("10S#2D*3T#")
print(solution("1S2D*3T"))
print(solution("1D2S#10S"))
print(solution("1D2S0T"))
print(solution("1S*2T*3S"))
print(solution("1D#2S*3S"))
print(solution("1T2D3D#"))
print(solution("1D2S3T*"))
