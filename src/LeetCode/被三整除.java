package LeetCode;

import com.sun.javafx.image.BytePixelSetter;

import java.lang.annotation.ElementType;
import java.util.Scanner;

/**
 * @CreateTime: 2019-11-27-17:06
 * @Author :杨阳
 * @ClassName :LeetCode.被三整除
 **/
public class 被三整除 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int temp = 0;
        if(a>b)  {
            temp = a;
            a = b;
            b=temp;
        }
        else {
            System.out.println(num(b)-num(a-1));
        }

    }

    public static int num (int a){
        int num = a%3;
        num = a/3*2 ;
        if(a%3 == 2)
            return num+1;
        else
            return num;
    }
}
