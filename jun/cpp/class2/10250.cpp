// 2
// 6 12 10
// 30 50 72

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>

int main()
{
	int num;
	std::cin >> num;
	int h,w,n;
	int div_a,div_b;
	div_t temp;
	int result;
	while (num--)
	{
		std::cin >> h >> w >> n;
		temp = div(n,h);
		div_a = temp.quot;
		div_b = temp.rem;
		// std::cout << div_a << " " << div_b << std::endl;
		result = div_b*100 + div_a+1;
		if (div_b == 0)
			result = h*100 + div_a;
		std::cout << result<< std::endl;
	}

}