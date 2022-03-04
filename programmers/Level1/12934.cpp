// 정수 제곱근 판별
#include <string>
#include <vector>
#include <cmath>
#include <iostream>
using namespace std;

long long solution(long long n) {
	long long answer = 0;
	int intvalue = sqrt(n);
	if (sqrt(n) - intvalue > 0)
		return (-1);
	answer = pow(sqrt(n) + 1, 2);
	return answer;
}