package 线程池工作原理;

import java.util.concurrent.*;

/**
 * @CreateTime: 2019-12-04-17:50
 * @Author :杨阳
 * @ClassName :MyThredaDemo
 **/
public class MyThredaDemo {
    public static void main(String[] args) {
        //阿里不允许使用ExecutorService
        //ExecutorService threadPool = Executors.newFixedThreadPool(5);//5条线程
        //ExecutorService threadPool = Executors.newSingleThreadExecutor();//单条线程
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,              //默认大小
                5,          //最大的大小
                2L,
                TimeUnit.SECONDS,           //时间单温
                new LinkedBlockingQueue<>(3), //等待区大小
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy()
        );


        try {

            for(int i=1;i<=9;i++)
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"办理业务");
                });
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }
}
