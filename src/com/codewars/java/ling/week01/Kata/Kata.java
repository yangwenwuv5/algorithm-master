package com.codewars.java.ling.week01.Kata;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @date 2021/11/9
 * @author lingzhao
 * @link https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
 */
public class Kata {

//    public static int[] arrayDiff(int[] a, int[] b) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(Integer ab : b){
//            map.put(ab,1);
//        }
//        List<Integer> list = new ArrayList<>();
//        int i = 0,n = 0;
//        for (Integer ba : a){
//            if(!map.containsKey(ba)){
//                n++;
//            }
//        }
//        int[] arr = new int[n];
//        for (Integer ar : a){
//            if(!map.containsKey(ar)){
//                arr[i] = ar;
//                i++;
//            }
//        }
//        return arr;
//    }

    public static int[] arrayDiff(int[] a, int[] b){
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }

}