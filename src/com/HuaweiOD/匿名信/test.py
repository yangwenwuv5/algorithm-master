import ctypes
import os
from ctypes import POINTER, c_char_p, c_bool, c_int

# Load the shared library
lib_path = os.path.join(os.path.dirname(__file__),"build/lib","libanonymousLetter.so")
lib = ctypes.CDLL(lib_path)

# Define function signatures
lib.create_anonymousLetter.restype = ctypes.POINTER(ctypes.c_void_p)
lib.destroy_anonymousLetter.argtypes = [ctypes.POINTER(ctypes.c_void_p)]
lib.anonymousLetter_Solution.argtypes = [
    ctypes.POINTER(ctypes.c_void_p), POINTER(c_char_p), c_int, POINTER(c_char_p), c_int
]
lib.anonymousLetter_Solution.restype = c_bool

# Create Python wrapper class
class AnonymousLetter:
    def __init__(self):
        self.obj = lib.create_anonymousLetter()

    def __del__(self):
        lib.destroy_anonymousLetter(self.obj)

    def solution(self, nesspaper, letter):
        nesspaper_arr = (c_char_p * len(nesspaper))(*[s.encode('utf-8') for s in nesspaper])
        letter_arr = (c_char_p * len(letter))(*[s.encode('utf-8') for s in letter])
        result = lib.anonymousLetter_Solution(self.obj, nesspaper_arr, len(nesspaper), letter_arr, len(letter))
        return result

# Example usage
test_cases = [
    (["example", "words", "in", "the", "newspaper"], ["example", "the"]),
    (["hello", "world"], ["hello", "there"]),
    (["a", "b", "c"], ["d", "e", "f"]),
    (["apple", "banana", "cherry"], ["apple", "grape"]),
    (["this", "is", "a", "test"], ["test", "case"]),
    ([],[])
]

anon = AnonymousLetter()

for i, (nesspaper, letter) in enumerate(test_cases):
    result = anon.solution(nesspaper, letter)
    print(f"Test case {i + 1}: {result}")