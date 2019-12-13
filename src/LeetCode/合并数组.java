package LeetCode;

import java.util.Arrays;

/**
 * @CreateTime: 2019-11-26-09:54
 * @Author :杨阳
 * @ClassName :LeetCode.合并数组
 **/
public class 合并数组 {
    public static void main(String[] args) {
        int nums1[] = {3,0};
        int nums2[] = {1};
        merge(nums1,1,nums2,1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)
            for(int i=0;i<n;i++)
                nums1[i] = nums2[i];
        else if(m>0 && n>0){
            if(nums1[0]>nums2[n-1]){
                System.out.println("00000000000000");
                for(int i=0;i<m;i++){
                    nums1[n+i] = nums1[i];
                    nums1[i]=nums2[i];
                }
            }
            else if(nums1[m-1]<nums2[0]){
                System.out.println("1111111111111");
                for(int i=m;i<m+n;i++)
                    nums1[i] = nums2[i-m];}
            else{
                System.out.println("2222222222222");
                for(int i=m;i<n+m;i++)
                    nums1[i] = nums2[i-m];
                Arrays.sort(nums1);
            }
        }
        for(int i=0;i<m+n;i++)
            System.out.println(nums1[i]);


    }
}
