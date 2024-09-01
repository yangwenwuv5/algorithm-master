cmake_minimum_required(VERSION 3.10)

project(getlocate VERSION 1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_library(getlocate SHARED getlocation.cpp)
target_include_directories(getlocate PUBLIC "${PROJECT_BINARY_DIR}")

set_target_properties(getlocate PROPERTIES 
LIBRARY_OUTPUT_DIRECTORY "${PROJECT_BINARY_DIR}/lib"
)