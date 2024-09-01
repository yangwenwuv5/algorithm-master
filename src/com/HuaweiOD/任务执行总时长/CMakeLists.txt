cmake_minimum_required(VERSION 3.10)

project(TimeTask VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(TimeTask SHARED time.cpp)
target_include_directories(TimeTask PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(TimeTask PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)