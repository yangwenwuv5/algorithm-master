cmake_minimum_required(VERSION 3.10)

project(midnums VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(midnums SHARED midnums.cpp)
target_include_directories(midnums PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(midnums PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)