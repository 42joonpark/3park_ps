// 땅따먹기
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<vector<int> > land)
{
	int answer = 0;
	int row, curr, up;

	for (row = 1; row < land.size(); ++row) {
		for (curr = 0; curr < 4; ++curr) {
			for (up = 0 ; up < 4; ++up) {
				if (curr != up)
					if (answer < land[row][curr] + land[row - 1][up])
						answer = land[row][curr] + land[row - 1][up];
			}
			land[row][curr] = answer;
			answer = 0;
		}
	}
	answer = *max_element(land[row - 1].begin(), land[row - 1].end());

	return answer;
}

int main(void) {
	vector<vector<int> > land = {
		vector<int>({1,2,3,5}),
		vector<int>({5,6,7,8}),
		vector<int>({4,3,2,1})
	};
	std::cout << solution(land) << std::endl;
	return (0);
}
