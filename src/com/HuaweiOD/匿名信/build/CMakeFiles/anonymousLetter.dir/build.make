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
CMAKE_SOURCE_DIR = /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build

# Include any dependencies generated for this target.
include CMakeFiles/anonymousLetter.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/anonymousLetter.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/anonymousLetter.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/anonymousLetter.dir/flags.make

CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o: CMakeFiles/anonymousLetter.dir/flags.make
CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o: ../anonymousLetter.cpp
CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o: CMakeFiles/anonymousLetter.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o -MF CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o.d -o CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o -c /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/anonymousLetter.cpp

CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/anonymousLetter.cpp > CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.i

CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/anonymousLetter.cpp -o CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.s

# Object files for target anonymousLetter
anonymousLetter_OBJECTS = \
"CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o"

# External object files for target anonymousLetter
anonymousLetter_EXTERNAL_OBJECTS =

lib/libanonymousLetter.so: CMakeFiles/anonymousLetter.dir/anonymousLetter.cpp.o
lib/libanonymousLetter.so: CMakeFiles/anonymousLetter.dir/build.make
lib/libanonymousLetter.so: CMakeFiles/anonymousLetter.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX shared library lib/libanonymousLetter.so"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/anonymousLetter.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/anonymousLetter.dir/build: lib/libanonymousLetter.so
.PHONY : CMakeFiles/anonymousLetter.dir/build

CMakeFiles/anonymousLetter.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/anonymousLetter.dir/cmake_clean.cmake
.PHONY : CMakeFiles/anonymousLetter.dir/clean

CMakeFiles/anonymousLetter.dir/depend:
	cd /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信 /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信 /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build /home/yangww/workstation/algorithm/src/com/HuaweiOD/匿名信/build/CMakeFiles/anonymousLetter.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/anonymousLetter.dir/depend

