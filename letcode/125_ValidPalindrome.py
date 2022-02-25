class Solution:
	def isPalindrome(self, s: str) -> bool:
		answer = []
		a = s.split(' ')	# 공백 기준으로 문자열을 분리
		for b in a:
			for i in range(0, len(b)):
				if b[i].isalpha() or b[i].isdigit(): # 문자열에 알파벳 또는 숫자만 추출
					answer.append(b[i].lower())		# 대문자들은 소문자로 변경
		s1 = ''.join(answer)
		s2 = ''.join(list(reversed(s1)))
		if (s1 == s2):	# 역순과 같은지 비교
			return True
		return False


# a = Solution()
# print(a.isPalindrome("0P"))
# print(a.isPalindrome("race a car"))
# print(a.isPalindrome("A man, a plan, a canal: Panama"))

