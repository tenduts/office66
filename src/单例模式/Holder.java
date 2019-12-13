package 单例模式;

/**
 * @CreateTime: 2019-12-05-11:14
 * @Author :杨阳
 * @ClassName :Holder
 **/
public class Holder {
    private Holder(){

    }
    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }

    private static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
