// 두 정수 사이의 합
#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    int min, max;
    if (a == b) {
        return (a);
    } else if (a < b) {
        min = a;
        max = b;
    } else {
        min = b;
        max = a;
    }
    for (int i = min; i <= max; i++) {
        answer += i;
    }
    return answer;
}