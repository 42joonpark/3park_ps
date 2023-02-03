// 6 8 10
// 25 52 60
// 5 12 13
// 0 0 0

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>

int main()
{
	while(1)
	{
		int a,b,c;
		std::cin >> a >> b >> c;
		std::vector<int> n_list;
		n_list.push_back(a);
		n_list.push_back(b);
		n_list.push_back(c);
		sort(n_list.begin(),n_list.end());
		// std::cout << n_list[0] << std::endl;
		int x,y,z;
		x = n_list[0];
		y = n_list[1];
		z = n_list[2];
		if (!x && !y &&!z)
			break;
		// std::cout << (pow(a,2)+pow(b,2)) << std::endl;
		if ((pow(x,2)+pow(y,2)) == pow(z,2))
			std::cout << "right" << "\n";
		else
			std::cout << "wrong" << "\n";
		
	}
}