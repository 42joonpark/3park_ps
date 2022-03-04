#include <iostream>
#include <regex>
#include <string>

using namespace std;

vector<string> token;
int a, b, c;

void parsing(string dartResult) {
	regex re(R"(\d{1,2}|[SDT]|[#*])");
	smatch match;

	auto start = sregex_iterator(dartResult.begin(), dartResult.end(), re);
	auto end = sregex_iterator();
	cout << "------------------" << endl;
	while (start != end) {
		cout << start->str() << endl;
		token.push_back(start->str());
		++start;
	}
	cout << "===================" << endl;
}

int solution(string dartResult) {
	int answer = 0;
	int bonus[3] = {1, 2, 3};
	int option[2] = {2, -1};
	parsing(dartResult);
	for (int i = 0; i < token.size(); i++) {

		answer += stoi(token[i]);
		if (token[i] == "S")
			answer = answer;
		else if (token[i] == "D")
			answer = answer * answer;
		else if (token[i] == "T")
			answer = answer * answer * answer;
	}
	return 0;
}

int main(void) {
	solution("10S2D*3T");
	for (int i = 0; i < token.size(); i++) {
		cout << token[i] << " ";
	}
	cout << endl;
	return (0);
}