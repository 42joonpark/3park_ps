// A+: 4.3, A0: 4.0, A-: 3.7

// B+: 3.3, B0: 3.0, B-: 2.7

// C+: 2.3, C0: 2.0, C-: 1.7

// D+: 1.3, D0: 1.0, D-: 0.7

// F: 0.0

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <iomanip>

int main()
{
    std::map<std::string, float> grade;
    // grade["A+"] = 4.3;
    grade.insert(std::make_pair("A+",4.3));
    grade.insert(std::make_pair("A0",4.0));
    grade.insert(std::make_pair("A-",3.7));
    grade.insert(std::make_pair("B+",3.3));
    grade.insert(std::make_pair("B0",3.0));
    grade.insert(std::make_pair("B-",2.7));
    grade.insert(std::make_pair("C+",2.3));
    grade.insert(std::make_pair("C0",2.0));
    grade.insert(std::make_pair("C-",1.7));
    grade.insert(std::make_pair("D+",1.3));
    grade.insert(std::make_pair("D0",1.0));
    grade.insert(std::make_pair("D-",0.7));
    grade.insert(std::make_pair("F",0.0f));

    std::string str;
    std::cin >> str;
    // std::cout << grade[str] << std::endl;
    std::cout << std::fixed << std::setprecision(1) << grade[str] << std::endl;

}