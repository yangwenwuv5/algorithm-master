import ctypes
import os
import time

# Load the shared library
lib_path = os.path.join(os.path.dirname(__file__), "build/lib", "libduplicate.so")
duplicate_lib = ctypes.CDLL(lib_path)

# Define the argument and return types of the functions
duplicate_lib.create_duplicate.restype = ctypes.POINTER(ctypes.c_void_p)
duplicate_lib.duplicate_solution.restype = ctypes.c_char_p
duplicate_lib.duplicate_solution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_char_p, ctypes.c_char_p]
duplicate_lib.duplicate_solution1.restype = ctypes.c_char_p
duplicate_lib.duplicate_solution1.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_char_p, ctypes.c_char_p]
duplicate_lib.destroy_duplicate.argtypes = [ctypes.POINTER(ctypes.c_void_p)]

def find_longest_common_substring(text1, text2):
    # Create an instance of the duplicate class
    duplicate_obj = duplicate_lib.create_duplicate()

    # Measure time for duplicate_solution
    start_time = time.time()
    result = duplicate_lib.duplicate_solution(duplicate_obj, text1.encode('utf-8'), text2.encode('utf-8'))
    end_time = time.time()
    time_taken1 = end_time - start_time

    # Measure time for duplicate_solution1
    start_time = time.time()
    result1 = duplicate_lib.duplicate_solution1(duplicate_obj, text1.encode('utf-8'), text2.encode('utf-8'))
    end_time = time.time()
    time_taken2 = end_time - start_time

    # Convert the result to a Python string
    common_substring1 = result.decode('utf-8')
    common_substring2 = result1.decode('utf-8')

    # Destroy the duplicate object
    duplicate_lib.destroy_duplicate(duplicate_obj)

    return common_substring1, time_taken1, common_substring2, time_taken2

if __name__ == "__main__":
    # Test the function
    test_cases = [
        ("abcdefgh" * 1000, "ijklmnop" * 1000),
        ("a" * 500 + "b" * 50, "a" * 50 + "c" * 50),
        ("abcdefgh" * 20, "abcdefgh" * 20),  # Expected to be slow for Solution
        ("a" * 99 + "b", "a" * 99 + "c"),
        ("abcde" * 20, "fghij" * 20)
    ]

    for text1, text2 in test_cases:
        result, duration_solution, result1, duration_solution1= find_longest_common_substring(text1, text2)
        print(f"Text1: {text1[:20]}...")
        print(f"Text2: {text2[:20]}...")
        print(f"Longest common substring (Solution): {result} (Time taken: {duration_solution:.6f} seconds)")
        print(f"Longest common substring (Solution1): {result1} (Time taken: {duration_solution1:.6f} seconds)\n")