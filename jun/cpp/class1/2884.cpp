#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>
// 0 ~ 23 //  0 ~ 59 
// 45 분 - 
int main()
{
	int a,b;
	std::cin >> a >> b;

	int temp;
	temp = b - 45;
	if (temp < 0) {
		temp = 60 + temp;
		a = a - 1;
	}
	if (a < 0) {
		a = 24 + a;
	}
	std::cout << a << " " << temp << std::endl;
}