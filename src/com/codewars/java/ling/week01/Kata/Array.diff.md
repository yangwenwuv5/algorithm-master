# Array.diff

## 题目

- [Training on Array.diff | Codewars](https://www.codewars.com/kata/523f5d21c841566fde000009/train/java)

  ![image-20211109142428894](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211109142428894.png)

- Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result..

- Example

  It should remove all values from list `a`, which are present in list `b` keeping their order.

  ```java
  Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
  ```

  If a value is present in `b`, all of its occurrences must be removed from the other:

  ```java
  Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
  ```

## 解题思路

1. 将b数组存入map集合
2. 与a数组进行对比，得到数组元素个数
3. 存入数组不同元素

1. 直接用Stream流方法

