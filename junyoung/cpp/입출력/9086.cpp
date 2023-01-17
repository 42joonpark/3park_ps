// 3
// ACDKJFOWIEGHE
// O
// AB

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <iomanip>

int main()
{
    int num;
    std::cin >> num;
    for (int i =0; i<num; ++i)
    {
        std::string str;
        std::cin >> str;
        if (str.length() > 1)
            std::cout << *str.begin() << *(str.end()-1) << "\n";
        else
            std::cout << str[0] << str[0] << "\n";
    }
}