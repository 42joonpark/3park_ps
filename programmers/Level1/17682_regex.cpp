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


	for (int i = 0; i < 3; i++) {
		ss >> score;
		bonus = ss.get();
		option = ss.get();
		if (option != '*' && option != '#')
			ss.unget();
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
	cout << solution("1D2S#10S") << endl;
	cout << solution("1D2S0T") << endl;
	cout << solution("1S*2T*3S") << endl;
	cout << solution("1D#2S*3S") << endl;
	cout << solution("1T2D3D#") << endl;
	cout << solution("1D2S3T*") << endl;
	return (0);
}