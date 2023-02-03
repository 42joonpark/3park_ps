// 10
// 5
// 2
// 3
// 1
// 4
// 2
// 3
// 5
// 1
// 7
#include <iostream>
#include <algorithm>
#include <vector>

bool scom(int a, int b)
{
    if (a > b)
        return false;
    return true;
}
int main() {
    int num;
    std::cin >> num;
    int temp;
    std::vector<int> n_list;
    for(int i=0; i<num; ++i)  {
        std::cin >>temp;
        n_list.push_back(temp);
    }
    sort(n_list.begin(), n_list.end(), scom);

    for(int i =0; i<num; ++i){
        std::cout << n_list[i] << "\n";
    }
}

// 메모리.. temp에 저장해서 넣으면 안 되나? 