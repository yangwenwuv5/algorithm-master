import ctypes
from ctypes import *
import os

lib_path = os.path.join(os.path.dirname(__file__),"build/lib","libgetlocate.so")

# 加载共享库
lib = cdll.LoadLibrary(lib_path)

# 定义C++类方法的参数和返回类型
class GetLocation:
    def __init__(self):
        # 创建一个getlocation实例
        self.obj = lib.getlocation_new()
        
    def __del__(self):
        # 删除getlocation实例
        lib.free_memory(self.obj)
        
    def solution(self, nums, arrays):
        array_type = ctypes.c_int * len(arrays)
        c_arrays = array_type(*arrays)
        result = lib.getlocation_solution(self.obj, nums, c_arrays, len(arrays))
        return result

# 创建一个GetLocation实例
get_location = GetLocation()

# 测试数据
test_cases = [
    (5, [3, 1, 4, 1, 5]),
    (4, [3, 1, 4, 1]),
    (3, [2, 3, 1]),
    (6, [10, 5, 3, 2, 4, 1]),
    (7, [7, 3, 5, 1, 9, 6, 2]),
    (8, [8, 4, 3, 7, 1, 5, 2, 6]),
    (9, [9, 2, 6, 4, 1, 3, 8, 5, 7]),
    (10, [10, 3, 8, 6, 2, 5, 9, 1, 4, 7])
]

# 运行测试并打印结果
for nums, arrays in test_cases:
    result = get_location.solution(nums, arrays)
    print(f"Input array: {arrays} -> Median value: {result}")

