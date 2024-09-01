# Rotate Array

## 题目
![Rotate.png](Rotate.png)

### 解题思路
1. 首先把k值取余，因为k可能大于nums的长度 
2. 遍历，设置一个新的数组，然后用新数组进行存储，从nums.length - 1开始遍历到nums.length
3. 最后把前面的也遍历一下，增添到后面就行了