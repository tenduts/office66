package JMM;

/**
 * @CreateTime: 2019-12-05-09:54
 * @Author :杨阳
 * @ClassName :JMMDemo
 **/
public class JMMDemo {
    //volatile 感知主内存的变化，但是不能保证原子性
    private volatile static int num = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while(num == 0){

            }
        }).start();
        Thread.sleep(1000);
        num =1;
        System.out.println(num);
    }
}
