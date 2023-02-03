#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>


int spsum(int num){
    std::string snum;
    int sum=0;
    snum = std::to_string(num);
    for(int i =0; i<snum.length(); ++i)
    {
        // std::cout << "(int)snum[i] : " << (int)(snum[i])-48 << std::endl;
        sum += (int)(snum[i])-48;
    }
    return sum;
}


int main() 
{
    int onum;
    std::cin >> onum;
    std::cout << tnum << std::endl;
}