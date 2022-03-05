#include <string>
#include <vector>
#include <iostream>
#include <sstream>
#include <cmath>

using namespace std;

int solution(string dartResult) {
	int answer = 0;
	int sum[3] = {0, 0, 0};
	int i = 0, j = 0;

	while (i < dartResult.size()) {
		int dlen = 0;
		while (isdigit(dartResult[i])) {
			sum[j] = sum[j] * pow(10, dlen) + (dartResult[i] - '0');
			dlen++;
			i++;
		}



		if (dartResult[i] == 'S')
			sum[j] = pow(sum[j], 1);
		else if (dartResult[i] == 'D')
			sum[j] = pow(sum[j], 2);
		else if (dartResult[i] == 'T')
			sum[j] = pow(sum[j], 3);
		i++;

		if (!isdigit(dartResult[i])) {
			if (dartResult[i] == '*') {
				sum[j] *= 2;
				if (i > 0)
					sum[j - 1] *= 2;
			} else if (dartResult[i] == '#') {
				sum[j] *= -1;
			}
			i++;
		}
		j++;
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