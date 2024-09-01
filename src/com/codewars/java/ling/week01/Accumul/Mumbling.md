# Mumbling

## 题目

- This time no story, no theory. The examples below show you how to write function `accum`:

  ![image-20211109112827605](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211109112827605.png)

- Example

  ```
  accum("abcd") -> "A-Bb-Ccc-Dddd"
  accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
  accum("cwAt") -> "C-Ww-Aaa-Tttt"
  ```

## 解题思路

1. 做两个循环就可以了