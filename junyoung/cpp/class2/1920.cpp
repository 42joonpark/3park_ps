#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>
// 5
// 4 1 5 2 3
// 5
// 1 3 7 9 5
int main()
{
	int inum1;
	std::cin >> inum1;
	std::vector<int> n_list;

	for (int i = 0; i<inum1; ++i) {
		int temp;
		std::cin >> temp;
		n_list.push_back(temp);
	}
	int max_ele = *max_element(n_list.begin(),n_list.end());
	int min_ele = *min_element(n_list.begin(),n_list.end());
	
	int inum2;
	std::cin >> inum2;
	std::vector<int> c_list;

	for (int i = 0; i<inum2; ++i) {
		int temp;
		std::cin >> temp;
		c_list.push_back(temp);
	}
	std::vector<int> res_list;
	for (int i = 0; i< inum2; ++i)
	{
		if (find(n_list.begin(), n_list.end(), c_list[i]) != n_list.end())
			res_list.push_back(1);
		else
			res_list.push_back(0);
	}

	for(int i =0; i<inum2; ++i) {
		std::cout << res_list[i] << "\n";
	}

}