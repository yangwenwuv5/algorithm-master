# Is a number prime?

## 题目

- [Training on Is a number prime? | Codewars](https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java)

  ![image-20211110141954244](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211110141954244.png)

- Title

  - Define a function that takes one integer argument and returns logical value `true` or `false` depending on if the integer is a prime.

    Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.

    ## Requirements

    - You can assume you will be given an integer input.
    - You can not assume that the integer will be only positive. You may be given negative numbers as well (or `0`).
    - **NOTE on performance**: There are no fancy optimizations required, but still *the* most trivial solutions might time out. Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to `n`, or `n/2`, will be too slow.

- Example

  ```c
  is_prime(1)  /* false */
  is_prime(2)  /* true  */
  is_prime(-1) /* false */
  ```

## 解题思路
1. 就是一个简单的判断素数，直接用平方根就行了
