# Stop gninnipS My sdroW!

## 题目：

- 链接：[Training on Stop gninnipS My sdroW! | Codewars](https://www.codewars.com/kata/5264d2b162488dc400000001/train/java)

![image-20211108153919908](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211108153919908.png)

Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"

## 解题思路

1. 首先将输入的字符串进行分组，其中用的是String方法的split方法
2. 随后遍历其数组，并且通过toCharArray方法将字符串进行进行拆分并且进行反转。
3. 其中最后得注意，最后一个字符串不能有空格 得去掉