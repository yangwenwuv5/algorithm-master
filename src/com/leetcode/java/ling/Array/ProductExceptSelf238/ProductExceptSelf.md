# 除自身以外数组的乘积

## 题目
![ProductExceptSelf.png](ProductExceptSelf.png)

### 解题思路
1. 因为要求不能用除法，并且只能是O(n)的复杂度完成，所以不能用内嵌循环
2. 只能用双指针了，以左右两侧为指针，进行遍历
3. L数组就是从左到右进行遍历，保存前一个数*L的前一个，这样就能保证存储的是当前左侧的乘积值
4. L数组就是从右到左进行遍历，保存后一个数*L的后一个，这样就能保证存储的是当前右侧的乘积值

