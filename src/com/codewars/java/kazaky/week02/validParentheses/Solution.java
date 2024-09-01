package com.codewars.java.kazaky.week02.validParentheses;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/20/13:43
 * @Description:
 */
public class Solution{

    public static boolean validParentheses(String parens)
    {
        //Put code below
        Stack<Character> stack = new Stack<Character>();
        char[] paren = parens.toCharArray();
        for(Character pa : paren){
            if(pa.equals('(')){
                stack.push('(');
            }
            else if(pa.equals(')') & !stack.isEmpty()){
                stack.pop();
            }
            else if(pa.equals(')') & stack.isEmpty()){
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}