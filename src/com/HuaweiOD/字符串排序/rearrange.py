import ctypes
import os
# 加载共享库（假设生成的共享库文件名为 "rearrange.so"）
lib_path = os.path.join(os.path.dirname(__file__), "build/lib", "librearrange.so")
lib = ctypes.CDLL(lib_path)

# 创建函数原型
lib.create_rearrange.restype = ctypes.POINTER(ctypes.c_void_p)
lib.rearrange_solution.restype = ctypes.c_char_p
lib.rearrange_solution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_char_p]
lib.destroy_rearrange.argtypes = [ctypes.POINTER(ctypes.c_void_p)]

# 创建 rearrange 实例
obj = lib.create_rearrange()

#测试数据
test_data = [
    "apple banana apple orange banana banana apple",
    "this is a test this is only a test",
    "hello world hello",
    "aaa bbb aaa ccc bbb aaa",
    "dog cat bird dog bird bird",
    "one two three four one two three four one two",
    "a ab abc ab abc abc a ab abc ab a abc",
    "same same same word word different",
    "My sister is in the house not in the yard",
    "This is an apple",
]

# 逐个测试并输出结果
for i, input_string in enumerate(test_data, 1):
    result = lib.rearrange_solution(obj, input_string.encode('utf-8'))
    print(f"Test {i}: Input: '{input_string}'")
    print(f"Output: '{result.decode('utf-8')}'")
    print()

# 销毁 rearrange 实例
lib.destroy_rearrange(obj)
