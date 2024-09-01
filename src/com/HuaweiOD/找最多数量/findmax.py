import ctypes
import os

# 加载共享库
lib_path = os.path.join(os.path.dirname(__file__),"build/lib","libfindmax.so")
lib = ctypes.CDLL(lib_path)

# 定义 FindMax 类的接口函数
class FindMax(ctypes.Structure):
    pass

# 指定函数的返回类型和参数类型
lib.FindMax_new.restype = ctypes.POINTER(FindMax)
lib.FindMax_delete.argtypes = [ctypes.POINTER(FindMax)]
lib.FindMax_Solution.argtypes = [ctypes.POINTER(FindMax), ctypes.POINTER(ctypes.c_int), ctypes.c_int, ctypes.c_int]
lib.FindMax_Solution.restype = ctypes.c_int

def test_findmax(cars, window_size):
    # 创建 FindMax 实例
    fm = lib.FindMax_new()
    
    # 转换数据类型
    cars_length = len(cars)
    cars_array = (ctypes.c_int * cars_length)(*cars)
    
    # 调用 C++ 函数
    result = lib.FindMax_Solution(fm, cars_array, cars_length, window_size)
    
    # 删除 FindMax 实例
    lib.FindMax_delete(fm)
    
    return result

def main():
    # 定义多组测试数据
    test_cases = [
        ([0, 1, 1, 2, 0, 2, 2], 3),
        ([0, 1, 1, 2, 0, 2, 2], 2),
        ([0, 0, 0, 1, 1, 1, 2, 2, 2], 3),
        ([0, 1, 2, 2, 2, 2, 1, 0, 1, 2], 4),
        ([0, 1, 1, 0, 0, 1, 2, 2, 0, 1], 5),
        ([0, 0, 0, 0, 0, 0, 0], 3),
        ([1, 2, 1, 2, 1, 2, 1], 4),
        ([2, 2, 2, 2, 2, 2, 2], 7),
        ([0, 1, 2, 0, 1, 2, 0, 1, 2], 2),
        ([2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0], 6),
    ]
    
    for cars, window_size in test_cases:
        result = test_findmax(cars, window_size)
        print(f"Cars: {cars}, Window Size: {window_size}, Max Color Count: {result}")

if __name__ == "__main__":
    main()
