package com.codewars.java.ling.week04;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2021/11/29
 * @author lingzhao
 * @link https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java
 */
public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        Map<Integer,Integer> map3 = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(sudoku[i][j] < 1 || sudoku[i][j] > 9){
                    return false;
                }
                if(map1.containsKey(sudoku[i][j])){
                    return false;
                }else {
                    map1.put(sudoku[i][j],1);
                }
            }
            for(int j = 0; j < 9; j++){
                if(map2.containsKey(sudoku[j][i])){
                    return false;
                }else {
                    map2.put(sudoku[j][i],1);
                }
            }
            map1.clear();
            map2.clear();
        }
        for(int i = 0; i < 9; i++){
            if(i % 3 == 0){
                map1.clear();
                map2.clear();
                map3.clear();
            }
            for(int j = 0; j < 9; j++){
                if(j / 3 == 0){
                    if(map1.containsKey(sudoku[i][j])){
                        return false;
                    }else {
                        map1.put(sudoku[i][j],1);
                    }
                }
                if(j / 3 == 1){
                    if(map2.containsKey(sudoku[i][j])){
                        return false;
                    }else {
                        map2.put(sudoku[i][j],1);
                    }
                }
                if(j / 3 == 2){
                    if(map3.containsKey(sudoku[i][j])){
                        return false;
                    }else {
                        map3.put(sudoku[i][j],1);
                    }
                }
            }
        }
        return true;
    }

    /*
        public static boolean check(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                for (int i2 = 0; i2 < sudoku.length; i2++) {
                    for (int j2 = 0; j2 < sudoku.length; j2++) {
                        if(sudoku[i][j]==0)
                            return false;
                        if(i==i2 && j==j2)
                            continue;
                        if(sudoku[i][j]==sudoku[i2][j2])
                            if (i/3==i2/3 && j/3==j2/3 || i==i2 || j==j2)
                                return false;
                    }
                }
            }
        }
        return true;
    }
     */
}
