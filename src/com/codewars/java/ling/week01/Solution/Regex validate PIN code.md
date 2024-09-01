# Regex validate PIN code

## 题目

- [Training on Regex validate PIN code | Codewars](https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java)

  ![image-20211109102922085](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211109102922085.png)

- Title

  - ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but **exactly** 4 digits or exactly 6 digits.

    If the function is passed a valid PIN string, return `true`, else return `false`.

- Example

  ```
  "1234"   -->  true
  "12345"  -->  false
  "a234"   -->  false
  ```

## 解题思路

1. 将字符串转为字符组，随后将每个字符进行判断
2. 如果是在0-9之间，则value+1
3. 最后当其长度为4或6并且完全为数字就返回true，否则就是false