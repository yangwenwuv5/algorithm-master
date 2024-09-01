import ctypes
import os

# Load the shared library
# 注意：确保路径正确，如果库文件在当前目录，使用 './libreverse.so'
lib_path = os.path.join(os.path.dirname(__file__), "build/lib", "libreverse.so")
if not os.path.exists(lib_path):
    raise FileNotFoundError(f"Shared library not found at {lib_path}")
reverse_lib = ctypes.CDLL(lib_path)

# Define the argument and return types of the functions
reverse_lib.create_reverse.restype = ctypes.POINTER(ctypes.c_void_p)
reverse_lib.reverse_solution.restype = ctypes.c_char_p
reverse_lib.reverse_solution.argtypes = [ctypes.POINTER(ctypes.c_void_p), ctypes.c_char_p]
reverse_lib.destroy_reverse.argtypes = [ctypes.POINTER(ctypes.c_void_p)]

def test_reverse_sentence(sentence):
    # Create an instance of the Reverse class
    reverse_obj = reverse_lib.create_reverse()

    # Call the solution function
    result = reverse_lib.reverse_solution(reverse_obj, sentence.encode('utf-8'))

    # Convert the result to a Python string and print it
    reversed_sentence = result.decode('utf-8')
    print(f"Original: {sentence}")
    print(f"Reversed: {reversed_sentence}")

    # Destroy the Reverse object
    reverse_lib.destroy_reverse(reverse_obj)

if __name__ == "__main__":
    # Test sentences
    sentences = [
        "Hello, world! How are you?",
        "C++ and Python integration.",
        "This is a test sentence.",
        "Do you like programming?"
    ]

    for sentence in sentences:
        test_reverse_sentence(sentence)
