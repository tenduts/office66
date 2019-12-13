package 单例模式;

/**
 * @CreateTime: 2019-12-05-10:54
 * @Author :杨阳
 * @ClassName :Hungry
 **/
public class Hungry {
    //避免new--
    private Hungry(){
    }
    //类一加载就初始化对象
    private final static Hungry HUNGRY = new Hungry();
    public static Hungry getInstance(){
        return HUNGRY;
    }
}
class Demo01{
    public static void main(String[] args) {
        Hungry instance = Hungry.getInstance();
        Hungry instance2 = Hungry.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
