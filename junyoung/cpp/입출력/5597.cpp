#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    std::vector<int> stu_list;
    for(int i =0; i < 30; i++)
    {
        stu_list.push_back(i+1);
    }

    for(int i =0; i< 28; ++i)
    {
        int temp;
        std::cin >> temp;
        stu_list.erase(std::find(stu_list.begin(),stu_list.end(),temp));
    }

    for (std::vector<int>::iterator it = stu_list.begin(); it != stu_list.end(); ++it)
    {
        std::cout <<*it <<"\n";
    }
}