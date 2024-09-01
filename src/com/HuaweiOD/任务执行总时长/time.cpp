#include <iostream>
#include <vector>

class Time{
    public:
        std::vector<int> Soulution(int taskAtime,int taskBtime,int TaskNum);
};

std::vector<int> Time::Soulution(int taskAtime,int taskBtime,int TaskNum){
    std::vector<int> res;
    std::cout << "taskAtime:" << taskAtime << " taskBtime:" << taskBtime << " TaskNum: " << TaskNum << std::endl;
    for(int i = 0;i<TaskNum+1;i++){
        res.push_back(taskAtime*(TaskNum-i)+taskBtime*i);
    }
    return res;
}

// // 封装C接口
// extern "C"{
// // 创建对象
//     Time* test_test(){
//         return new Time;
//     }
//     std::vector<int> my_Soulution(Time *t,int taskAtime,int taskBtime,int TaskNum){
//         return t->Soulution(taskAtime,taskBtime,TaskNum);
//     }
// }

// 封装C接口
extern "C" {
    // 创建对象
    Time* test_test() {
        return new Time;
    }

    // 用于返回数组长度
    int* my_Solution(Time* t, int taskAtime, int taskBtime, int TaskNum, int* out_size) {
        std::vector<int> result = t->Soulution(taskAtime, taskBtime, TaskNum);
        *out_size = result.size(); // 设置输出大小
        int* res = new int[*out_size];
        for (int i = 0; i < *out_size; i++) {
            res[i] = result[i];
        }
        return res;
    }

    // 用于释放内存
    void free_memory(int* ptr) {
        delete[] ptr;
    }
}