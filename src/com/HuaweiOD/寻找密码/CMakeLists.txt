cmake_minimum_required(VERSION 3.10)

project(findkey VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(findkey SHARED findkey.cpp)
target_include_directories(findkey PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(findkey PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)