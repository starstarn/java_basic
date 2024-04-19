package chat01;

public class java_13_Object_ {
    public static void main(String[] args) {
        //面向对象
        //方法的重写：父类对象的方法其实主要体现通用性，无法在特殊的场合下使用
        //          如果子类对象需要在特殊的场合下使用，那么就需要重写方法的逻辑，这个操作在Java中称之为方法的重写
        // 这里的重写，并不意味着父类的方法被覆盖掉，只是在当前场合不适应，如果使用super关键字还是可以使用
        // 方法的重写要求，子类的方法和父类的方法，方法名相同，返回值类型相同，参数列表相同。
        Child13 child = new Child13();
        child.test();
    }
}
class Parent13 {
    String name = "zhangsan";
    void test() {
        System.out.println("parent test...");
    }
}
class Child13 extends Parent13 {
    String name = "lisi";
    void test() {
//        System.out.println(this.name);
//        System.out.println(super.name);
        super.test();
        System.out.println("child test...");
    }
}
