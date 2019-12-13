package 剑指66;

/**
 * @CreateTime: 2019-12-13-14:51
 * @Author :杨阳
 * @ClassName :超过一半的数字
 **/
public class 超过一半的数字 {
    public static void main(String[] args) {
        int array[] = {1,2,1,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length<=1)
            return array[0];
        int index = array[0];
        int count = 1;
        for(int i=1;i<array.length;i++){
            if(array[i] == index)
                count ++;
            else count -- ;
            if(count <= 0){
                index = array[i];
                count = 1;
            }
        }

        if(count > 0)
        {//如果count大于0说明有可能存在这样的数，是出现次数大于数组的一半的
            //还有一种可能是最后刚好一个数连续出现了2次，导致count>0
            count = 0;
            for(int i=0;i<array.length;i++)
            {//去遍历数组，计数这个number到底出现了几次
                if(index == array[i])
                    count++;
            }
            if(count > array.length/2)
                return index;//出现超过一半
        }
        return 0;
    }
}
