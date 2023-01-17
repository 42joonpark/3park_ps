#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

int main()
{
    std::string str;
    std::cin >>str;

    std::string res;
    for (int i = 0; i<str.length(); i++)
    {
        if (isupper(str[i]))
            res += tolower(str[i]);
        else if (islower(str[i]))
            res += toupper(str[i]);
    }
    std::cout << res << std::endl;
}