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
    int tnum =0;
    int ssum = 0;
    int c =0;
    // 재귀 로 풀어보자 
    while (1)
    {
        //216 , 9 
        //245
        sum = spsum(num);

        // 207 
        // 234
        tnum = num;
        num = num - sum;
        ssum = spsum(num);
        // std::cout << num << std::endl;
        if (num + ssum != tnum){
            if (c == 0)
                num = onum + sum;
            break;
        }
        c++;
    }
    std::cout <<  num << std::endl;
}