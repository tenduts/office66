package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @CreateTime: 2019-11-25-16:14
 * @Author :杨阳
 * @ClassName :LeetCode.只出现一次的数字
 **/
public class 只出现一次的数字 {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(singleNumber1(nums));
        //System.out.println(singleNumber2(nums));
        //System.out.println(singleNumber3(nums));

    }
    public static int singleNumber1(int[] nums) {//异或
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans = ans^nums[i];
        }

        return ans;
    }
//    public static int singleNumber2(int[] nums) {//哈希
//        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//
//    }
    public static int singleNumber3(int[] nums) {//排序
        Arrays.sort(nums);
        int i=0;
        for( i=0;i<nums.length-2;i+=2)
            if(nums[i]!=nums[i+1])
               break;
        if(i!=nums.length-3)
            return nums[i];
        else
            return nums[nums.length-1];

    }


}
