# Duplicate Encoder

## 题目

- [Training on Duplicate Encoder | Codewars](https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java)

  ![image-20211108172906625](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211108172906625.png)

- Title

  - The goal of this exercise is to convert a string to a new string where each character in the new string is `"("` if that character appears only once in the original string, or `")"` if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

- Examples

  ```
  "din"      =>  "((("
  "recede"   =>  "()()()"
  "Success"  =>  ")())())"
  "(( @"     =>  "))((" 
  ```

- Notes
  - Assertion messages may be unclear about what they display in some languages. If you read `"...It Should encode XXX"`, the `"XXX"` is the expected result, not the input!

## 解题思路

1. 先将字符串转为字符数组
2. 随后将字符数组一个个进行遍历对比
3. 其中对比需要忽略大小写，所以我是先将字符转为字符串，然后用其中的方法equalsIgnoreCase进行对比
4. 如果有相等的则转为字符')',没有则转为字符'('