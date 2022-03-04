// 소수 찾기
#include <string>
#include <vector>
#include <cmath>
#include <iostream>

using namespace std;

bool isPrime(int n) {
	int cnt = 0;

	if (n < 2)
		return (false);
	for (int i = 2; i * i <= n; i++) {
		if (n % i == 0)
			return (false);
	}
	return (true);
}

int solution(int n) {
	int answer = 0;
	for (int i = 1; i <= n; i++) {
		if (isPrime(i)) {
			answer++;
		}
	}
	return answer;
}