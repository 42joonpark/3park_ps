#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>


bool scompare(int a, int b) {
    return (std::abs(a) < std::abs(b));
}
int main()
{
    int num,target;
    std::cin >> num >> target;
    std::vector<int> num_list; 
    int temp;
    for (int i=0; i<num; ++i) {
        std::cin >> temp;
        num_list.push_back(temp);
    }
    std::vector<int> sum_list;
    for(int i=0; i<num-2; ++i) {
        for (int j=i+1; j<num-1; ++j) {
            for (int k=j+1; k< num; ++k) {
                // std::cout << i << " " << j  << " "<< k<< std::endl;
                if ((num_list[i]+num_list[j]+num_list[k]-target) <= 0)
                    sum_list.push_back((num_list[i]+num_list[j]+num_list[k]-target));
            }
        }
    }
    
    sort(sum_list.begin(),sum_list.end(), scompare);
    // std::cout << "TEST : ";
    // for (int i=0; i<sum_list.size(); ++i) {
    //     std::cout << sum_list[i] << " ";
    // }
    // std::cout << "\n";

    std::cout << sum_list[0] + target << std::endl;
}