cmake_minimum_required(VERSION 3.10)

project(findmax VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(findmax SHARED findmax.cpp)
target_include_directories(findmax PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(findmax PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)