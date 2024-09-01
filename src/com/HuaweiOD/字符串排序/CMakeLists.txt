cmake_minimum_required(VERSION 3.10)

project(rearrange VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(rearrange SHARED rearrange.cpp)
target_include_directories(rearrange PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(rearrange PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)