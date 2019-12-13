package LeetCode;

/**
 * @CreateTime: 2019-11-25-17:28
 * @Author :杨阳
 * @ClassName :超过一半的书
 **/
public class 超过一半的数 {
    public static void main(String[] args) {
        int nums[]={3,2,3};
        int index = nums[0];
        int num = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=index)
                num--;
            else num++;
            if(num == 0){
                index = nums[i];
                num=1;
            }
        }
        System.out.println(index);
    }
}
