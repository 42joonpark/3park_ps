// Hello
// Baekjoon
// Online Judge 
#include <iostream>
#include <string>

int main ()
{
    while(1){
        std::string str;
        std::getline(std::cin,str);
        if (str == "")
            break;
        std::cout << str << "\n";

    }

  return 0;
}