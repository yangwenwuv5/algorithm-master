#include<iostream>
#include<vector>
#include<algorithm>

class getlocation{
    public:
        int Solution(int nums, std::vector<int> arrays);
};

int getlocation::Solution(int nums,std::vector<int> arrays){
    if(nums %2 == 0){
        std::sort(arrays.begin(),arrays.end());
        return arrays[nums/2 -1];
    }else{
        std::sort(arrays.begin(),arrays.end());
        return arrays[nums/2];
    }
}

extern "C" {
    getlocation* getlocation_new() { return new getlocation(); }
    void getlocation_delete(getlocation* obj) { delete obj; }
    int getlocation_solution(getlocation* obj, int nums, int* arrays, int length) {
        std::vector<int> vec(arrays, arrays + length);
        return obj->Solution(nums, vec);
    }
        // 用于释放内存
    void free_memory(int* ptr) {
        delete[] ptr;
    }
}