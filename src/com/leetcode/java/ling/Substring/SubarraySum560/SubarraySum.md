# SubArray Sum

## 题目
![SubarraySum.png](SubarraySum.png)

### 解题思路 暴力法
1. 首先遍历整个数组
2. 从当前的数往前面进行遍历 并且累加，如果=k 则count++
3. 最后返回count

时间复杂度 O(n^2)

