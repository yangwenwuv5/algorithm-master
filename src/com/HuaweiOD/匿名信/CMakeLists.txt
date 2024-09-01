cmake_minimum_required(VERSION 3.10)

project(anonymousLetter VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(anonymousLetter SHARED anonymousLetter.cpp)
target_include_directories(anonymousLetter PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(anonymousLetter PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)