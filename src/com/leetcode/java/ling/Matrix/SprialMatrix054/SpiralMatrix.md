# 螺旋矩阵

## 题目
![SpiralMatrix.png](SpiralMatrix.png)

### 解题思路
1. 我这边是设定4个参数，为上下左右
2. 随后判断up <= dowm, left <= right，进行循环判断
3. 随后由左到右 由上到下 进行添加
4. 如果left < right && up < down的时候，还需要回转一下
5. 随后由右到左 由下到上进行添加
6. 最后把边界缩小一圈就行了