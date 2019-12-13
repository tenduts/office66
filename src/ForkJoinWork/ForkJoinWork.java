package ForkJoinWork;
//JUC:并发编程
import java.util.concurrent.RecursiveTask;

/**
 * @CreateTime: 2019-12-04-16:50
 * @Author :杨阳
 * @ClassName :ForkJoinWork
 **/
public class ForkJoinWork extends RecursiveTask<Long> {

    private Long start;
    private Long end;

    public static final  Long critcal = 10000L;//临界点

    public ForkJoinWork(Long start, Long end) {
        this.start = start;
        this.end = end;
    }



    @Override
    protected Long compute() {
        //是否拆分完毕
         long length =  end - start;
        if(length<critcal){//没有到达临界值
            Long sum = 0L;
            for(Long i = start;i<=end;i++){
                sum+=i;
            }
            return sum;
        }else {
            //拆分任务
            Long middle = (end + start)/2;
            ForkJoinWork right =  new ForkJoinWork(start,middle);
            right.fork();//分支

            ForkJoinWork left  =  new ForkJoinWork(start,middle);
            left.fork();

            return right.join()+left.join();
        }

    }
}
