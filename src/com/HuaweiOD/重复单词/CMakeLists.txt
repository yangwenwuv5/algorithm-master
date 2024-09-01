cmake_minimum_required(VERSION 3.10)

project(duplicate VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(duplicate SHARED duplicate.cpp)
target_include_directories(duplicate PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(duplicate PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)