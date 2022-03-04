
// 하샤드 수
#include <string>
#include <vector>

using namespace std;

int xsum(int value) {
    int mok, mod, sum;
	mok = mod = sum = 0;
    while (value) {
        mok = value / 10;
        mod = value % 10;
        sum += mod;
        value = mok;
    }
    return (sum);
}

bool solution(int x) {
    bool answer = true;
    if (x % xsum(x) == 0)
        return true;
    return false;
}