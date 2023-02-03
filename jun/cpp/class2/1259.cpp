// 121
// 1231
// 12421
// 0

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>


bool sol(std::string &mstr) {
    int a=0;
    int b=mstr.length();
    for(int i=0; i < mstr.length()/2; ++i) {
        if(mstr[i] != mstr[b-i-1]) {
            return false;
        }   
    }
    return true;
}

int main()
{
    std::string mstr;
    
    while(1) {
        std::cin >> mstr;
        if (mstr == "0")
            break;
        if(sol(mstr) == true)
            std::cout << "yes" << "\n";
        else
            std::cout << "no" << "\n";
    } 
}