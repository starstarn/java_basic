package chat01;

public class java_09_Object_chongzai {
    public static void main(String[] args) {

        //一个类中，不能重复声明相同的方法，也不能声明相同的属性
        //这里相同的方法指的是方法名，参数列表相同，和返回值类型无关
        //如果方法名相同，参数列表不同（个数，顺序，类型），会认为是不同的方法，只不过名称一样。
        //这个操作在Java称之为方法的重载
        //构造方法也存在方法的重载
        User14 user = new User14("lisi");
        user.login(111);
        user.login("zhangsan","123");
        user.login("starn");


    }
}

class User14 {
    User14() {
        System.out.println("...");
    }

    User14(String name) {
        System.out.println("user"+name);
    }

    void login( String account, String password) {
        System.out.println("账号，密码登录");
    }
    void login(int tel) {
        System.out.println("手机验证码登录");
    }
    void login(String wx) {
        System.out.println("微信登录");
    }
}


