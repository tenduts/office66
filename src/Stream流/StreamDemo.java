package Stream流;

import java.util.Arrays;
import java.util.List;

/**
 * @CreateTime: 2019-12-05-10:04
 * @Author :杨阳
 * @ClassName :StreamDemo
 **/
public class StreamDemo {
    /**
     * 选出满足下列条件的用户
     * 1.偶数ID
     * 2年龄大于24
     * 用户名转换为大写
     * 用户名字母倒排序
     * 只输出一个用户名字
     */
    public static void main(String[] args) {
        User u1 = new User(11,"a",23);
        User u2 = new User(12,"b",24);
        User u3 = new User(13,"c",22);
        User u4 = new User(14,"d",28);
        User u5 = new User(16,"e",26);

        List<User> list= Arrays.asList(u1,u2,u3,u4,u5);
        /**
         * 1.将list转化为Stream流
         * 2.将用户过滤出来 函数式接口，Lamba
         * 3.
         */
        list.stream()
                .filter(u->{return u.getId()%2 == 0;})
                .filter(u->{return u.getAge()>24;})
                .map(u->{return  u.getUserName().toUpperCase();})
                .sorted((o1,o2)->{return o2.compareTo(o1);})
                .limit(1)
                .forEach(System.out::println);
    }
}
