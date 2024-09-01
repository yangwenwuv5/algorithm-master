#include <iostream>
#include <vector>
#include <algorithm>

class findmidnums
{
public:
    int Solution(std::vector<int> nums);
};

int findmidnums::Solution(std::vector<int> nums)
{
    int n = nums.size();
    if (n == 0)
        return -1;
    std::vector<int> prefixProd(n,1);
    std::vector<int> suffixProd(n,1);
    for (int i = 1; i < n; ++i) {
        prefixProd[i] = prefixProd[i - 1] * nums[i - 1];
    }
    for (int i = n - 2; i >= 0; --i) {
        suffixProd[i] = suffixProd[i + 1] * nums[i + 1];
    }
    for (int i = 0; i < n; ++i) {
        if (prefixProd[i] == suffixProd[i]) {
            return i;
        }
    }
    return -1;
}

extern "C" {
    // Create object
    findmidnums* create_findmidnums() {
        return new findmidnums();
    }

    // Solution function
    int findmidnums_Solution(findmidnums* t, int* nums, int length) {
        std::vector<int> nums_vec(nums, nums + length);
        return t->Solution(nums_vec);
    }

    // Destroy object
    void destroy_findmidnums(findmidnums* t) {
        delete t;
    }
}
