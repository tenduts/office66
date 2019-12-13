package 单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @CreateTime: 2019-12-05-11:02
 * @Author :杨阳
 * @ClassName :LazyMan
 **/
public class LazyMan {
    private static boolean flag = false;

    private LazyMan(){
        synchronized (LazyMan.class){
            if(flag == false)
                flag =true;
            else
                if(lazyMan !=null)
                    throw new RuntimeException("不要试图破话单例模式");
        }
    }
    private static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if(lazyMan == null){
            synchronized (LazyMan.class){
                lazyMan = new LazyMan();
            }

        }
        return lazyMan;
    }
}


class Demo02{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
       //
        Field field=LazyMan.class.getDeclaredField("flag");
        field.setAccessible(true);


        Constructor<LazyMan> constructor = LazyMan.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        LazyMan instance =constructor.newInstance();

        field.set(instance,false);


        LazyMan instance2=constructor.newInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
