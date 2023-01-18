#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

int main()
{
	std::vector<int> num_list;
	for (int i =0; i < 8; i++)
	{
		int num;
		std::cin >> num;
		num_list.push_back(num);
	}

	std::vector<int> as;
	std::vector<int> ds;
	for(int i=0; i<8; ++i)
	{
		// std::cout << i << "\n";
		as.push_back(i+1);
		ds.push_back(9-i-1);
	}

	std::cout << "as : " << as.size() << std::endl;
	for (int i= 0; i< 8; ++i) {
		std::cout << as[i] << " ";
	}
	std::cout << "\n";
	std::cout << "ds : " << ds.size() << std::endl;
	for (int i= 0; i< 8; ++i) {
		std::cout << ds[i] << " ";
	}
	std::cout << "\n";
	std::cout << "num_list : " << num_list.size() << std::endl;
	for (int i= 0; i< 8; ++i) {
		std::cout << num_list[i] << " ";
	}
	std::cout << "\n";


	if (num_list == as)
		std::cout << "ascending" << "\n";
	else if (num_list == ds)
		std::cout << "descending" << "\n";
	else 
		std::cout << "mixed" << "\n";

}