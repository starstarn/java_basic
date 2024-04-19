package chat01;

public class java_10_Object_gouzoa {
    public static void main(String[] args) {
        //如果在一个构造方法中，想要调用其他的构造方法，你们需要使用特殊的关键字：this
        User10 user1 = new User10();
//        User10 user2 = new User10();
//        User10 user3 = new User10();
    }
}
class User10 {
    User10() {
        this("zhangsan");
    }
    User10(String name) {
        this(name,"男");
    }
    User10(String name, String sex) {
        System.out.println(name + "," + sex);
    }
}
