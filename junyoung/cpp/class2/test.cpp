#include <string>
#include <vector>
#include <map>
#include <iostream>
// using namespace std;

std::vector<int> solution(std::vector<std::string> genres, std::vector<int> plays) {
    std::vector<int> answer;
    std::map<std::string,std::vector<int> > i_map;
    typedef std::map<std::string,std::vector<int> >  i_maptype;
    std::vector<int> temp;
    for(int i=0; i<plays.size(); ++i)
    {
        i_map.insert(std::pair(genres[i],(temp)));    
    }
    // std::cout << i_map["pop"].first << std::endl;
    for(int i=0; i<plays.size(); ++i) {
            i_map[genres[i]].push_back(plays[i]);
            i_map[genres[i]].push_back(i);
    }

    // }
    // for(i_maptype::iterator it = i_map.begin(); it!=i_map.end(); ++it)
    // {
    //     std::cout << it << std::endl;
    // }
    for(int i =0; i<2; ++i )
    {
        std::cout <<i_map["pop"][0] << std::endl;
    }
    return answer;
    
}