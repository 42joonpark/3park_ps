// 2 1 5 
#include <iostream>



int main() {
    long long a,b,c;
    std::cin >> a >> b >> c;

    long long step = a - b;
    long long target = c - a;

    long long temp = target % step;
    long long an = target/step;
    if (an == 0 && temp != 0)
        ++an;
    else if (an != 0 && temp != 0)
        ++an;
    if (a == c)
        an =0;
    std::cout << an+1 << std::endl;
}

