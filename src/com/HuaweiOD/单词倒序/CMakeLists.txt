cmake_minimum_required(VERSION 3.10)

project(reverse VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(reverse SHARED reverse.cpp)
target_include_directories(reverse PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(reverse PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)