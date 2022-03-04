// 콜라츠 추측
#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int answer = 0;
    long num1 = num;
    while (num1 != 1) {
        if (num1 % 2 == 0)
            num1 /= 2;
        else
            num1 = num1 * 3 + 1;
        answer += 1;
        if (answer > 500)
            return (-1);
    }
    return answer;
}