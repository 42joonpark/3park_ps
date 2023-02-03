#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>
int main()
{
	int inum;
	std::cin >> inum;
	std::vector<int> n_list;

	for(int i=0; i<inum; ++i) {
		int tnum;
		std::cin >> tnum;
		n_list.push_back(tnum);
	}

	std::vector<int>::iterator max_index = max_element(n_list.begin(),n_list.end());
	std::cout << *max_index << std::endl;

	int list_sum = std::accumulate(n_list.begin(),n_list.end(),0);
	std::cout << "sum : " << list_sum << std::endl;
	float res;

	res = float(list_sum * pow(*max_index,-1));
	std::cout << res << std::endl;
	res = res * 100;
	std::cout << res << std::endl;
	res = res / inum;
	std::cout << res << std::endl;

}   