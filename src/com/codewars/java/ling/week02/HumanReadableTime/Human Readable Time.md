# Human Readable Time

## 题目

- [Training on Human Readable Time | Codewars](https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java)

  ![image-20211118205936027](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211118205936027.png)

- Title

  Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (`HH:MM:SS`)

  - `HH` = hours, padded to 2 digits, range: 00 - 99
  - `MM` = minutes, padded to 2 digits, range: 00 - 59
  - `SS` = seconds, padded to 2 digits, range: 00 - 59

  The maximum time never exceeds 359999 (`99:59:59`)

  You can find some examples in the test fixtures.

## 解题思路
1. 非常简单的一道题，只需要将其格式化就ok了，前面为%02d