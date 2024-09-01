package com.codewars.java.kazaky.week02.XO;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/18/17:17
 * @Description:
 */
public class XO {
    public static boolean getXO (String str) {

        // Good Luck!!
        char[] XO = str.toCharArray();
        for(Character xo :XO){
            if(('x'- xo == 32) | ('o' - xo == 32)){
                xo =(char) (xo + 32);
            }
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(Character xo : XO){
            if(map.containsKey(xo)) {
                int value = map.get(xo);
                map.put(xo, value + 1);
            }else{
                map.put(xo,1);
            }
        }
        if(str.length()==0){
            return false;
        }
        if(map.containsKey('o') || map.containsKey('x')){
        if((map.get('x')==null & map.get('o')>=1) || ((map.get('x')>=1 & map.get('o')==null))){
            return false;
        }}else{
            return true;
        }
        if(map.get('x').equals(map.get('o'))){
            return true;
        }

        return false;
    }
}

