package chat01;

public class java_19_Object_final {
    public static void main(String[] args) {
        //面向对象
        // Java中提供了一种语法，可以在数据初始化后不被修改，使用关键字final
        // final可以修饰变量：变量的值一旦初始化后无法修改
        // final可以修饰属性：那么JVM无法自动进行初始化，需要自己进行初始化,属性值不能发生变化
        // 一般将final修饰的变量称之为常量，或者叫不可变量
        // final可以修饰方法，这个方法不能被子类重写
        // final可以修饰类，这样类就没有子类
        // final不可以修饰构造方法
        // final可以修饰方法的参数,一旦修饰,参数就无法修改
        String name = "zhangsan";

//        User19 user = new User19("wangwu");
//        System.out.println(user.name);
    }
}

final class User19 {
    public User19() {

    }
//    public void test(final String name) {
//        name = "lisi";
//    }

//    public final String name;
//    public User19(String name) {
//        this.name = name;
//    }
//    public final void test(){
//
//    }
}
//class Chind19 extends User19{
//    public void test() {
//
//    }
//}
