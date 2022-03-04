// 문자열 내 p와 y의 개수
#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    int pcnt = 0;
    int ycnt = 0;

    for (int i = 0; i < s.size(); i++) {
        if (s[i] == 'p' || s[i] == 'P')
            pcnt++;
        else if (s[i] == 'y' || s[i] == 'Y')
            ycnt++;
    }
    if ((pcnt == 0 && ycnt == 0) || (pcnt == ycnt))
        return (true);
    return (false);
}