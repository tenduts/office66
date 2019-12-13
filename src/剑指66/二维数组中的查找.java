package 剑指66;

/**
 * @CreateTime: 2019-12-03-09:21
 * @Author :杨阳
 * @ClassName :二维数组中的查找
 **/
public class 二维数组中的查找 {
    public static void main(String[] args) {

        int [][] array = {{1,2},{3,4}};
        int target = 1;
        Find(target,array);

    }

    public static boolean Find(int target, int [][] array) {
        if(array.length==0||array[0].length==0){
            return false;
        }
        int row = array[0].length-1;
        int line = array.length-1;

        int i=0;
        int j=line;
        while(i<=row && j>=0){
            if(array[i][j]>target) j--;
            else if(array[i][j]<target) i++;
            else  return true;
        }
        return false;
    }

}

