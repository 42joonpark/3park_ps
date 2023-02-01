// 5
// abcde
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>

int main()
{
    int inum;
    std::string istring;
    std::cin >> inum >> istring;
    std::vector<int> h_list;
    

    // std::cout << pow(2,10) <<std::endl;
    long long ttemp = 1;
    long long temp=0;
    for (int i=0; i<inum; ++i)
    {
        temp = temp + (int(istring[i])-96)*(ttemp);
        ttemp = ttemp*31 %1234567891;
    }
    std::cout << temp%1234567891 << std::endl;
}