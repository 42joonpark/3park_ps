// 8 8
// WBWBWBWB
// BWBWBWBW
// WBWBWBWB
// BWBBBWBW
// WBWBWBWB
// BWBWBWBW
// WBWBWBWB
// BWBWBWBW
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>

int diff(std::vector<std::string> s_list,std::string wb, std::string bw)
{
    int res=0; 
    for (int i=0; i<8; ++i) {
        if ((i)%2 == 0)
        {
            if (wb == s_list[i])
                continue;
            else {
                for(int j=0; j<8; ++j) {
                    if (s_list[i][j] != wb[j])
                        ++res;
                }
            }
        }
        else {
            if (bw == s_list[i])
                continue;
            else {
                for (int j=0; j<8; ++j) {
                    if (s_list[i][j] != bw[j])
                        ++res;
                }
            }
        }
    }
    return res;
}

int main()
{
    int a,b;
    std::cin >> a >> b;
    std::vector<std::string> s_list;
    std::string line;
    for (int i=0; i<a; ++i) {
        std::cin >> line;
        s_list.push_back(line);
    }    
    // std::cout << s_list[1] << std::endl;

    std::string wb;
    wb = "WBWBWBWB";
    std::string bw;
    bw = "BWBWBWBW";

    // std::string temp;
    // temp = "WB";
    // for (int i =0; i < b-8; ++i)
    // {
    //     wb += temp[i%2];
    //     bw += temp[(i+1)%2];
    // }
    int x = a-8+1;
    int y = b-8+1;
    std::vector< std::vector<std::string> > v(x, std::vector<std::string>(y));
3    
    if (s_list[0][0] == 'B')
        swap(wb,bw);
    std::cout << wb << " " << bw << std::endl;
    //s_list -> sub_s_list;
    // diff(sub_s_list, wb,bw)

    // std::cout << res << std::endl;
}
