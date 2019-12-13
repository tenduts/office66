package ForkJoinWork;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

/**
 * @CreateTime: 2019-12-04-17:13
 * @Author :杨阳
 * @ClassName :ForkJoinWorkDemo
 *
 * 1.正常的      //x         500000000500000000time6339
 * 2.forkjoin   //invoke    3814802718720time3945
 * 3.stream     //reduce    500000000500000000time213
 **/
public class ForkJoinWorkDemo {
    public static void main(String[]args){
        //test();
        //test2();
        test3();
    }
    public static void  test(){
        long l = System.currentTimeMillis();

        //forkPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        ForkJoinWork task =  new ForkJoinWork(0L,1000000000L);
        Long invoke = forkJoinPool.invoke(task);

        long l2 = System.currentTimeMillis();
        System.out.println("invoke" + invoke+"time"+(l2-l));
        //invoke3814802718720time3945

    }
    public static void  test2(){
        long l = System.currentTimeMillis();

        //线程
        Long x = 0L;
        Long y = 1000000000L;
        for(Long i=0L;i<=y;i++){
            x+=i;
        }

        long l2 = System.currentTimeMillis();
        System.out.println("x" + x+"time"+(l2-l));
        //x500000000500000000time6339
    }

    public static void test3(){
        //拆分
        long l = System.currentTimeMillis();

        //线程
        Long x = 0L;
        Long y = 1000000000L;

        long reduce =  LongStream.rangeClosed(0L,1000000000L).parallel().reduce(0,Long::sum);

        long l2 = System.currentTimeMillis();
        System.out.println("reduce" + reduce+"time"+(l2-l));
        //reduce500000000500000000time213
    }

}
