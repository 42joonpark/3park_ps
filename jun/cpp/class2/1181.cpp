// 13
// but
// i
// wont
// hesitate
// no
// more
// no
// more
// it
// cannot
// wait
// im
// yours
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>
#include <set>

bool scompare(std::string &a, std::string &b) {
	if(a.length() == b.length())
	{
		return a<b;
	}
	return a.length() < b.length();
}

int main()
{
	int num;
	std::vector<std::string> s_list;
	// std::set<std::string> s_list;
	std::string temp;
	std::cin >> num;
	
	for (int i=0; i<num; ++i) {
		std::cin >> temp;
		s_list.push_back(temp);
	}
	// int a=0;
	sort(s_list.begin(), s_list.end(), scompare);

	std::string stemp;
	for(int i=0; i<s_list.size(); ++i)
	{
		if (stemp != s_list[i]) {
			std::cout << s_list[i] << "\n";
			stemp = s_list[i];
		}
	}

}