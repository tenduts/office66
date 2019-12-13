package LeetCode;
import java.util.Scanner;

/**
 * @CreateTime: 2019-12-02-10:49
 * @Author :杨阳
 * @ClassName :斐波那契数列
 **/
public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Fibonacci(n);

    }
    public static int Fibonacci(int n){
        if(n<=0) System.out.println(0);
        else if(n<2) System.out.println(1);

        int a=1;
        int b=1;
        int sum = 0;
        for(int i=3;i<=n;i++){
            sum = a+b;
            System.out.println(sum);
            a= b;
            b = sum;

        }

        return n;
    }

}
