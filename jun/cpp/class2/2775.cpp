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

    for (int i=0; i<inum; ++i) {
        int a,b;
        std::cin >> a >>b;
        std::vector<int> temp;
        for (int i =0; i<b; ++i)
        {
            temp.push_back(i+1);
        }
        for(int k =0; k < a; ++k) {
            for(int i=1; i<b; ++i)
            {
                temp[i] += temp[i-1];
            }
        }
        // std::cout << "temp : ";
        // for(int i=0; i<temp.size(); ++i) {
        //     std::cout << temp[i] << " ";
        // }
        // std::cout << std::endl;
        std::cout << temp.back() << std::endl;
    }
}