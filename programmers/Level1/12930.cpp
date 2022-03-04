// 이상한 문자 만들기
#include <string>
#include <vector>

using namespace std;

string solution(string s) {
	string answer(s);

	int idx = 0;
	for (int i = 0; i < s.size(); i++) {
		if (answer[i] == ' ') {
			idx = 0;
			continue ;
		}
		if (idx % 2 == 0)
			answer[i] = toupper(answer[i]);
		else
			answer[i] = tolower(answer[i]);
		idx++;
	}
	return answer;
}