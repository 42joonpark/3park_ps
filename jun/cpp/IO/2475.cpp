#include <iostream>
#include <ctime>

int main() {
    time_t currentTime = time(nullptr);
    tm* localTime = localtime(&currentTime);
    std::cout << localTime->tm_year + 1900 << "-";
    if (localTime->tm_mon+1 > 10)
        std::cout << localTime->tm_mon + 1 << "-";
    else {
        std::cout <<"0";
        std::cout << localTime->tm_mon + 1 << "-";
    }

    std::cout << localTime->tm_mday << "\n";
    return 0;
}