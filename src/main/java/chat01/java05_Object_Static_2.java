package chat01;

public class java05_Object_Static_2 {
    public static void main(String[] args) {
        //静态代码块
        //类的信息加载完成后，会自动调用静态代码块，可以完成静态属性的初始化
        //对象准备创建时，也会自动调用代码块，但不是静态的

        // User.test();
        new User();
    }
}

class User {
    static {
        //静态代码块
        System.out.println("静态代码块执行1");
    }
    static {
        //静态代码块
        System.out.println("静态代码块执行2");
    }
    static void test() {
        System.out.println("test...");
    }
    {
        //代码块
        System.out.println("代码块执行1");
    }
    static {
        //静态代码块
        System.out.println("静态代码块执行3");
    }
    {
        //代码块
        System.out.println("代码块执行2");
    }
}