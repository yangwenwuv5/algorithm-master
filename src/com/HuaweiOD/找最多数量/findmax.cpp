#include <iostream>
#include <vector>
#include<algorithm>

class findmax
{
public:
    int Solution(const std::vector<int> &cars, int nums);
};
int findmax::Solution(const std::vector<int>& cars, int nums) {
    int length = cars.size();
    if (cars.empty() || nums <= 0) {
        return 0;
    }
    
    if (nums > length) {
        throw std::invalid_argument("Window size must be less than or equal to the number of cars.");
    }
    std::vector<int> color_count(3, 0);
    for (int i = 0; i < nums; ++i) {
        color_count[cars[i]]++;
    }
    int max_count = *std::max_element(color_count.begin(), color_count.end());
    for (int i = nums; i < length; ++i) {
        color_count[cars[i - nums]]--;
        color_count[cars[i]]++;
        max_count = std::max(max_count, *std::max_element(color_count.begin(), color_count.end()));
    }
    
    return max_count;
}

extern "C" {
    findmax* FindMax_new() { return new findmax(); }
    void FindMax_delete(findmax* fm) { delete fm; }
    int FindMax_Solution(findmax* fm, const int* cars, int cars_length, int nums) {
        std::vector<int> cars_vector(cars, cars + cars_length);
        return fm->Solution(cars_vector, nums);
    }
}