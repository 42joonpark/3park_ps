// 2016년
#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(int a, int b) {
	string answer = "";
	int month[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	string today[7] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	int sum = 0;
	for (int i = 0; i + 1 < a; i++) {
		sum += month[i];
	}
	sum += (b - 1);
	answer = today[sum % 7];

	return answer;
}