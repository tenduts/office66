package 单例模式;

/**
 * @CreateTime: 2019-12-05-11:35
 * @Author :杨阳
 * @ClassName :EnumSingleton
 **/
public enum  EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;

    }
}

class Demo04{
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance2);
    }
}
