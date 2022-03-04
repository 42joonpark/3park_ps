// 문자열을 정수로 바꾸기
#include <string>
#include <vector>
#include <cstdlib>

using namespace std;

int solution(string s) {
    int answer = 0;
    // answer = atoi(s.c_str());
    answer = stoi(s);
    return answer;
}