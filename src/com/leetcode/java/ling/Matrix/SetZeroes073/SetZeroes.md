# 矩阵置零

## 题目
![SetZeroes.png](SetZeroes.png)

### 解题思路
1. 首先把m n 的长度列出来
2. 随后根据这m n的长度分出两个数组row, col
3. 遍历这个长度，如果有元素为0，分别把row[i]和col[j]置为true 或者其他标志
4. 标志完了后， 随后把row[i]和col[j]为true的，设maxtrix[i][j]为0就ok了