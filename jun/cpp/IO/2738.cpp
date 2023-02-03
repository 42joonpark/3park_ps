// 3 3
// 1 1 1
// 2 2 2
// 0 1 0
// 3 3 3
// 4 4 4
// 5 5 100
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

int main()
{
	// std::vector<int> v1{1, 2, 3};
	// std::vector<int> v2{4, 5, 6};
	int x,y;
	std::cin >> x >> y;
	std::vector< std::vector<int> > v(x, std::vector<int>(y));

	for (int i =0; i<x; ++i) {
		for (int j =0; j<y; ++j)
			v[i][j] = 0;
	}
	// std::cout << v[1][1] <<std::endl;

	for (int k =0; k<2; ++k) 
	{
		for (int i =0; i< x; ++i) {
			// std::vector<int> temp;
			for (int j=0; j<y; ++j) {
				int num;
				std::cin >> num;
				v[i][j] += num;
			}
		}
	}
	for (int i =0; i<x; ++i) {
		for (int j =0; j<y; ++j)
			std::cout << v[i][j] << " ";
		std::cout << "\n";
}
	// std::cout << v3[1][1] <<std::endl;
}