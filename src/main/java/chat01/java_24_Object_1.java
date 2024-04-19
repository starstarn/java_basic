package chat01;

public class java_24_Object_1 {
    public static void main(String[] args) {
        //bean规范
        //1.主要用于编写逻辑
        //2.主要用于建立数据模型(bean)
        //Bean类的设计规范:
        //1.类要求必须含有无参,公共的构造方法
        //2.属性必须私有化,然后提供公共的,set get方法
        User24 user = new User24();
        user.setAccount("admin");
        user.setPassword("123");
        System.out.println(login(user));
    }
    public static boolean login(User24 user) {
        if(user.getAccount().equals("admin") && user.getPassword().equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}
class User24 {
    private String account;
    private String password;
    public void setAccount(String account) {
        this.account = account;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return password;
    }
}
