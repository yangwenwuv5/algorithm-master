package com.codewars.java.kazaky.week03.BouncingBall;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/24/19:45
 * @Description:
 */
public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        // your code
        if(bounce<window/h){
            return -1;
        }
        if(bounce==window/h){
            return 1;
        }
        if(bounce>=1){
            return -1;
        }
        if(h<=window){
            return -1;
        }
        int times = (int)Math.floor(logn(window,bounce) - logn(h,bounce));
        return 2*times+1;
    }

    public static double logn(double a,double b){
        return  Math.log(a)/Math.log(b);
    }
}