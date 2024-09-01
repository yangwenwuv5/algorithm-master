package com.codewars.java.kazaky.week01.nbYear;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/09/10:38
 * @Description: nbYear
 */
class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        double rate = percent/100;
        double sum = p0;
        int year = 0;
        while(sum<p){
            sum = sum * (1+rate)+ aug;
            year++;
        }
        return year;
    }
}