package Stream流;

/**
 * @CreateTime: 2019-12-05-10:02
 * @Author :杨阳
 * @ClassName :User
 **/
public class User {
    /*
    *集合，数据
    * 流，计算
    */
    private int id;
    private String userName;
    private int age;

    public User() {
    }

    public User(int id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
