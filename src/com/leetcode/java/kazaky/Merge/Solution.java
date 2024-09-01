package com.leetcode.java.kazaky.Merge;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int i = 0,m1=0,n1=0;
        while(i<m+n){
            if(nums1[m1]>nums2[n1]) {
                nums[i++] = nums2[n1++];
            }else if(nums1[m1]==nums2[n1]){
                nums[i++]=nums1[m1++];
                nums[i++]=nums2[n1++];
            }else{
                nums[i++] = nums1[m1++];
            }
        }
        for(int j =0 ;j<m+n;j++){
            nums1[j]=nums[j];
        }
    }
}

/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }
}
 */