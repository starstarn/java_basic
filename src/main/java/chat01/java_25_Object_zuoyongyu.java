package chat01;

public class java_25_Object_zuoyongyu {
    public static void main(String[] args) {
        //作用域
        Child25 child = new Child25();
        child.test();
    }
}
class Person25 {
    public static String name = "zhangsan";
}
class Child25 extends Person25 {
    public String name = "lisi";

    public void test() {
        //String name = "wangwu";
        //如果属性和(局部)变量的名称相同,访问时如果不加修饰符,那么优先访问变量
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
