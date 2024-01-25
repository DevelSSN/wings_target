package com.wings_cp;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        if(m==0)
            nums1[0]=nums2[0];
        int temp=nums1[0];
        int i,j;
        for(i=0,j=0;i<m && j<n;){
            if(temp<=nums2[j]){
                i++;
                temp=nums1[i];
            }
            else{
                temp=nums1[i];
                nums1[i]=nums2[j];
                i++;
                j++;
            }
        }
        for(i=m;i<(m+n)&&j<=n;i++){ 
            if(j==n){
                nums1[i]=temp;
                break;
            }
            if(temp<=nums2[j]&j<n){
                nums1[i]=temp;
                temp=nums2[j];
                j++;
            }
            else{
                nums1[i]=nums2[j];
                nums2[j]=temp;
                j++;
            }
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
        for (int i : nums1) 
            System.out.print(i);
            System.out.println();
    }
}
