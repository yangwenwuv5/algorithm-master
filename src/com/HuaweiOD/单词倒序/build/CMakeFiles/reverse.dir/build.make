# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.22

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build

# Include any dependencies generated for this target.
include CMakeFiles/reverse.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/reverse.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/reverse.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/reverse.dir/flags.make

CMakeFiles/reverse.dir/reverse.cpp.o: CMakeFiles/reverse.dir/flags.make
CMakeFiles/reverse.dir/reverse.cpp.o: ../reverse.cpp
CMakeFiles/reverse.dir/reverse.cpp.o: CMakeFiles/reverse.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/reverse.dir/reverse.cpp.o"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/reverse.dir/reverse.cpp.o -MF CMakeFiles/reverse.dir/reverse.cpp.o.d -o CMakeFiles/reverse.dir/reverse.cpp.o -c /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/reverse.cpp

CMakeFiles/reverse.dir/reverse.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/reverse.dir/reverse.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/reverse.cpp > CMakeFiles/reverse.dir/reverse.cpp.i

CMakeFiles/reverse.dir/reverse.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/reverse.dir/reverse.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/reverse.cpp -o CMakeFiles/reverse.dir/reverse.cpp.s

# Object files for target reverse
reverse_OBJECTS = \
"CMakeFiles/reverse.dir/reverse.cpp.o"

# External object files for target reverse
reverse_EXTERNAL_OBJECTS =

lib/libreverse.so: CMakeFiles/reverse.dir/reverse.cpp.o
lib/libreverse.so: CMakeFiles/reverse.dir/build.make
lib/libreverse.so: CMakeFiles/reverse.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX shared library lib/libreverse.so"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/reverse.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/reverse.dir/build: lib/libreverse.so
.PHONY : CMakeFiles/reverse.dir/build

CMakeFiles/reverse.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/reverse.dir/cmake_clean.cmake
.PHONY : CMakeFiles/reverse.dir/clean

CMakeFiles/reverse.dir/depend:
	cd /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序 /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序 /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build /home/yangww/workstation/algorithm/src/com/HuaweiOD/单词倒序/build/CMakeFiles/reverse.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/reverse.dir/depend

