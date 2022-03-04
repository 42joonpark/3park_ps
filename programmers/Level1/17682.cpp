#include <string>
#include <vector>
#include <iostream>
#include <sstream>
#include <cmath>

using namespace std;

int solution(string dartResult) {
	int answer = 0;
	stringstream ss(dartResult);
	int sum[3] = {0, 0, 0};

	int score;
	char bonus;
	char option;

	ss >> score;
	bonus = ss.get();
	option = ss.get();
	if (option != '*' && option != '#')
		ss.unget();

	for (int i = 0; i < 3; i++) {
		sum[i] += score;
		switch(bonus) {
			case 'S':
				sum[i] = pow(score, 1);
				break ;
			case 'D':
				sum[i] = pow(score, 2);
				break ;
			case 'T':
				sum[i] = pow(score, 3);
				break ;
			default :
				break ;
		}
		switch(option){
			case '*' :
				if (i > 0)
					sum[i - 1] *= 2;
				sum[i] *= 2;
				break ;
			case '#' :
				sum[i] *= -1;
				break ;
			default :
				break ;
		}
	}
	for (int i = 0; i < 3; i++) {
		answer += sum[i];
	}
	return answer;
}

int main(void) {
	cout << solution("1S2D*3T") << endl;
	return (0);
}