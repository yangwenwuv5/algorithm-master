package com.codewars.java.kazaky.week4.DuplicateEncoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * @author KaZaKy
 */
public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        String words = "";
        char[] ch = word.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(Character character : ch){
            int flag = 0;
            for(Character character1 : ch){
                if(character.equals(character1)){
                    flag++;
                }
            }
            if(flag>=2){
                set.add(character);
            }
        }
        for(Character character : ch){
            if(set.contains(character)){
                words += ")";
            }else{
                words += "(";
            }
        }
        return words;
    }
}
