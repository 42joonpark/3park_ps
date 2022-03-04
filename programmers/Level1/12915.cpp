// 문자열 내 마음대로 정렬하기
#include <string>
#include <vector>
#include <algorithm>
#include <cstring>

using namespace std;

int N;

bool comp(string a, string b) {
    if (a[N] == b[N]) {
        return (strcmp(a.c_str(), b.c_str()) < 0);
    }
    return (a[N] < b[N]);
}

vector<string> solution(vector<string> strings, int n) {
    N = n;
    sort(strings.begin(), strings.end(), comp);
    return strings;
}