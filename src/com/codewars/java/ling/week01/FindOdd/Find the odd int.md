# Find the odd int

## 题目

- [Training on Find the odd int | Codewars](https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java)

  ![image-20211109151212068](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211109151212068.png)

- Title

  - Given an array of integers, find the one that appears an odd number of times.

    There will always be only one integer that appears an odd number of times.

- Example

  `[7]` should return `7`, because it occurs 1 time (which is odd).
  `[0]` should return `0`, because it occurs 1 time (which is odd).
  `[1,1,2]` should return `2`, because it occurs 1 time (which is odd).
  `[0,1,0,1,0]` should return `0`, because it occurs 3 times (which is odd).
  `[1,2,2,3,3,3,4,3,3,3,2,2,1]` should return `4`, because it appears 1 time (which is odd).
  
## 解题思路
1. 直接进行异或处理就行