#include <iostream>
#include <string>
#include <vector>
// 11
// 1 4 1 2 4 2 4 2 3 4 4
// 2

int sol()
{
    int num;
    std::cin >> num;
    std::vector<int> num_vec;
    for (int i =0; i<num; ++i)
    {
        int temp;
        std::cin >> temp;
        num_vec.push_back(temp);
    }

    int target;
    std::cin >> target;
    
    int res = 0;
    // std::cout << std::endl;
    for (std::vector<int>::iterator it= num_vec.begin(); it!=num_vec.end(); ++it)
    {
        if (*it == target)
            res++;
    }
    return res;

}

int main()
{
    int result = sol();
    std::cout << result <<"\n";
}