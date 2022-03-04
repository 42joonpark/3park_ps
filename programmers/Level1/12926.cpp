// 시저 암호
#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
	string answer = s;
	for (int i = 0; i < s.size(); i++) {
		if (answer[i] == ' ')
			continue ;
		if (islower(answer[i])) {
			if (answer[i] + n > 'z' )
				answer[i]  = ('a' - 1) + (answer[i] + n - 'z');
			else
				answer[i] += n;
		} else if (isupper(answer[i])) {
			if (answer[i] + n > 'Z')
				answer[i] = ('A' - 1) + (answer[i] + n - 'Z');
			else
				answer[i] += n;
		}
	}
	return answer;
}