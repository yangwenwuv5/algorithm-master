# Sudoku Solution Validator

## 题目

- [Training on Sudoku Solution Validator | Codewars](https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java)

  ![image-20211129151844561](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211129151844561.png)

## 解题思路
1. 分两个循环，一个是分析行和列，一个是分析3*3的子网格
2. 分析行和列的比较简单，只需要判断map集合是否有重复的和该行或列属于1-9就ok了
3. 分析3*3的子网格比较麻烦，需要3个map集合，所以直接设置其取余为2就可以进行重置，其中的map集合判断与上述第一个循环的判断保持一致就ok了

