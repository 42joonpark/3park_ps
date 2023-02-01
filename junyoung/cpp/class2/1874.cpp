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
    std::vector<int> num_list;
    std::vector<int> i_list;
    int temp;
    for(int i=0; i< inum; ++i) {
        std::cin >> temp;
        i_list.push_back(temp);
        num_list.push_back(i+1);
    }

    std::vector<int> temp_list;
    int targetnum = i_list[0];
    for(int i=0; i<targetnum; ++i) {
        temp_list.push_back(i+1);
        // temp_list.pop_back();
    }
    // std::cout << temp_list.back() << std::endl;
    // int index = 1;
    for(int i=1; i<inum; ++i)
    {
        if(temp_list.back() == targetnum);
        {    
            temp_list.pop_back();
            targetnum = i_list[i];
        }
        while( targetnum > i_list[i])
    }
    // if (temp_list.back())
}