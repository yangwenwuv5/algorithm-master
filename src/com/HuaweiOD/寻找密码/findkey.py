import ctypes,os

# Load the shared library
lib_path = os.path.join(os.path.dirname(__file__),"build/lib" , "libfindkey.so")
lib = ctypes.CDLL(lib_path)

# Define the create_findkey function
lib.create_findkey.restype = ctypes.POINTER(ctypes.c_void_p)

# Define the findkey_solution function
lib.findkey_solution.restype = ctypes.c_char_p
lib.findkey_solution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_char_p]

# Define the destroy_findkey function
lib.destroy_findkey.argtypes = [ctypes.POINTER(ctypes.c_void_p)]

class FindKeyWrapper:
    def __init__(self):
        self.obj = lib.create_findkey()

    def solution(self, words):
        result = lib.findkey_solution(self.obj, words.encode('utf-8'))
        return result.decode('utf-8')

    def __del__(self):
        lib.destroy_findkey(self.obj)

# Example usage
if __name__ == "__main__":
    finder = FindKeyWrapper()
    
    # Test data
    test_cases = [
        "apple ple le e banana anana nana ana na a",
        "test t te st s e",
        "abcd abc ab a",
        "singleword",
        "multiple words with some valid subsequence",
        "x y z yz yza yzab yzabc",
        "testcase case tes es e ase"
    ]
    
    for i, words in enumerate(test_cases):
        result = finder.solution(words)
        print(f"Test case {i + 1}:")
        print(f"Input: {words}")
        print(f"Largest valid password: {result}")
        print("-" * 50)
