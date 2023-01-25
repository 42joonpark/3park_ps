#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cmath>


int spsum(int num){
    std::string snum;
    int sum=0;
    snum = std::to_string(num);
    for(int i =0; i<snum.length(); ++i)
    {
        // std::cout << "(int)snum[i] : " << (int)(snum[i])-48 << std::endl;
        sum += (int)(snum[i])-48;
    }
    return sum;
}


int main() 
{
    int onum;
    std::cin >> onum;
    // std::string snum;
    // snum = std::to_string(num);
    // std::cout << snum.length() << std::endl;
    // for(int i =0; i<snum.length(); ++i)
    // {
    //     std::cout << "(int)snum[i] : " << (int)(snum[i])-48 << std::endl;
    //     sum += (int)(snum[i])-48;
    // }
    // std::cout << sum << std::endl;
    int sum =0;
    int num = onum;
    int tnum =num;
    int ssum = 0;
    int c =0;
    // 재귀 로 풀어보자 
    while (1)
    {
        //216 , 9 
        sum = spsum(tnum);
        tnum = tnum - sum;
        ssum = spsum(tnum);
        // std::cout << "tt " << tnum << " " << sum << " " << ssum <<"\n";
        // std::cout << num << std::endl;
        if (tnum + ssum != onum) {
            if (c == 0)
                tnum += sum;
            tnum = tnum + sum;
            break;
        }
        c++;
    }
    std::cout << tnum << std::endl;
}