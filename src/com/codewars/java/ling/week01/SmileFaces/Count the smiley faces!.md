# Count the smiley faces!

## 题目

- [Training on Count the smiley faces! | Codewars](https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java)

  ![image-20211110111150322](https://gitee.com/rokzhughost/cloudimage/raw/master/img/image-20211110111150322.png)

- Tile

  - Given an array (arr) as an argument complete the function `countSmileys` that should return the total number of smiling faces.

    Rules for a smiling face:

    - Each smiley face must contain a valid pair of eyes. Eyes can be marked as `:` or `;`
    - A smiley face can have a nose but it does not have to. Valid characters for a nose are `-` or `~`
    - Every smiling face must have a smiling mouth that should be marked with either `)` or `D`

    No additional characters are allowed except for those mentioned.

    **Valid smiley face examples:** `:) :D ;-D :~)`
    **Invalid smiley faces:** `;( :> :} :]`

- Example

  ```
  countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
  countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
  countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
  ```

- Note
  - In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same.

## 解题思路
1. 做一个有效的字符串，包括所有笑脸的类型，看传入的字符串是否属于其中