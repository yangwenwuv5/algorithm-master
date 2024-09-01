import ctypes
import os

lib_path = os.path.join(os.path.dirname(__file__),"build/lib","libmidnums.so")
lib = ctypes.CDLL(lib_path)

# 设置参数和返回类型
lib.create_findmidnums.restype = ctypes.POINTER(ctypes.c_void_p)
lib.findmidnums_Solution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.POINTER(ctypes.c_int), ctypes.c_int]
lib.findmidnums_Solution.restype = ctypes.c_int
lib.destroy_findmidnums.argtypes = [ctypes.POINTER(ctypes.c_void_p)]

def create_findmidnums():
    return lib.create_findmidnums()

def findmidnums_Solution(t, nums):
    array_type = ctypes.c_int * len(nums)
    c_array = array_type(*nums)
    return lib.findmidnums_Solution(t, c_array, len(nums))

def destroy_findmidnums(t):
    lib.destroy_findmidnums(t)

# 测试函数
if __name__ == "__main__":
    test_cases = [
        ([2, 5, 3, 6, 5, 6], 3),
        ([1, 2, 3, 4, 6], -1),
        ([1, 1, 1, 1, 1], 2),
        ([2, 3, 4, 6, 2, 3, 1, 1, 1], 4),
        ([10, 1, 1, 10], 1),
        ([1, 2, 3, 0, 6], 4),
        ([1], 0),
        ([1, 2], -1),
        ([0, 0, 0, 0], 0)
    ]

    t = create_findmidnums()
    for i, (nums, expected) in enumerate(test_cases):
        result = findmidnums_Solution(t, nums)
        print(f"Test case {i + 1}: nums = {nums}")
        print(f"Expected: {expected}, Result: {result}")
        print("Pass" if result == expected else "Fail")
        print()

    destroy_findmidnums(t)
