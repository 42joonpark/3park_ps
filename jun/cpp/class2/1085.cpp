#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>

int main()
{
    int x,y,w,h;
    std::cin >> x >> y >> w >> h;

    std::vector<int> sol_list;
    // std::cout << sol_list[3] << std::endl;
    sol_list.push_back(x);
    sol_list.push_back(y);
    sol_list.push_back(w-x);
    sol_list.push_back(h-y);
    std::cout << *min_element(sol_list.begin(),sol_list.end()) << std::endl;

}