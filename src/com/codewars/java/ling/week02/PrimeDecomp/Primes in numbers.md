# Primes in numbers

## 题目

- [Training on Primes in numbers | Codewars](https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java)

  ![image-20211119164040986](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211119164040986.png)

- Title

  Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

  ```
   "(p1**n1)(p2**n2)...(pk**nk)"
  ```

  with the p(i) in increasing order and n(i) empty if n(i) is 1.

  ```
  Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
  ```

## 解题思路
1. 用map集合来计数，如果是他的因子，则存入map集合
2. 最后进行输出