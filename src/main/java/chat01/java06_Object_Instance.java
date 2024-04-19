package chat01;

public class java06_Object_Instance {
    public static void main(String[] args) {
        //构建对象
        //构造方法：专门用于构建对象
        //如果一个类中没有任何构造方法，那么JVM会自动添加一个公共的，无参的构造方法，方便对象调用
        //基本语法：类名(){}
        // 1.构造方法也是方法，但没有void关键字
        // 2.方法名和类名完全相同
        // 3.如果类中没有构造方法，那么JVM会提供默认的构造方法
        // 4.如果类中有构造方法，那么JVM不会提供默认的构造方法
        // 5.构造方法可以传递参数

        //System.out.println("before...");
        User1 user = new User1("zhangsan");
        //System.out.println("after...");
        user.test();
        System.out.println(user.username);
        //代码块，是在构造对象之前执行的

    }
}

class User1 {
    String username;

    {
        System.out.println("代码块1");
    }

    User1(String name){
        //System.out.println("user...");
        username = name;
    }

    {
        System.out.println("代码块2");
    }

    void test() {
        System.out.println("test....");
    }

    {
        System.out.println("代码块3");
    }

}
