# import ctypes
# import os

# # 加载共享库
# lib_path = os.path.join(os.path.dirname(__file__), 'build/lib', 'libTimeTask.so')
# print(lib_path)
# time_task_lib = ctypes.CDLL(lib_path)

# # 定义返回类型和参数类型
# time_task_lib.test_test.restype = ctypes.POINTER(ctypes.c_void_p)
# time_task_lib.my_Soulution.restype = ctypes.POINTER(ctypes.c_int)
# time_task_lib.my_Soulution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_int, ctypes.c_int, ctypes.c_int]

# # 创建 Time 对象
# time_obj = time_task_lib.test_test()

# # 定义多组输入
# inputs = [
#     (3, 5, 10),
#     (2, 4, 8),
#     (4, 6, 12)
# ]

# # 处理每组输入
# for input_data in inputs:
#     taskAtime, taskBtime, TaskNum = input_data
#     print(taskAtime)
#     print(taskBtime)
#     print(TaskNum)

#     # 调用 Soulution 方法
#     result_ptr = time_task_lib.my_Soulution(time_obj, taskAtime, taskBtime, TaskNum)

#     # 获取结果并转换为 Python 数组
#     result_array = [result_ptr[i] for i in range(TaskNum)]

#     # 打印结果
#     print(f"Input: taskAtime={taskAtime}, taskBtime={taskBtime}, TaskNum={TaskNum}")
#     print("Result:", result_array)
#     print()

import ctypes
import os

# 加载共享库
lib_path = os.path.join(os.path.dirname(__file__), 'build/lib', 'libTimeTask.so')
time_task_lib = ctypes.CDLL(lib_path)

# 定义返回类型和参数类型
time_task_lib.test_test.restype = ctypes.POINTER(ctypes.c_void_p)
time_task_lib.my_Solution.restype = ctypes.POINTER(ctypes.c_int)
time_task_lib.my_Solution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_int, ctypes.c_int, ctypes.c_int, ctypes.POINTER(ctypes.c_int)]
time_task_lib.free_memory.argtypes = [ctypes.POINTER(ctypes.c_int)]

# 创建 Time 对象
time_obj = time_task_lib.test_test()

# 定义多组输入
inputs = [
    (3, 5, 10),
    (2, 4, 8),
    (1,2,3),
    (4, 6, 12)
]

# 处理每组输入
for input_data in inputs:
    taskAtime, taskBtime, TaskNum = input_data
    print(taskAtime)
    print(taskBtime)
    print(TaskNum)

    # 调用 Solution 方法
    out_size = ctypes.c_int()
    result_ptr = time_task_lib.my_Solution(time_obj, taskAtime, taskBtime, TaskNum, ctypes.byref(out_size))

    # 获取结果并转换为 Python 列表
    result_array = [result_ptr[i] for i in range(out_size.value)]

    # 释放内存
    time_task_lib.free_memory(result_ptr)

    # 打印结果
    print(f"Input: taskAtime={taskAtime}, taskBtime={taskBtime}, TaskNum={TaskNum}")
    print("Result:", result_array)
    print()
