package chat01;

public class java_07_Object_Extends_2 {
    public static void main(String[] args) {
        //如果父类和子类含有相同的属性，使用关键字进行区分 super this
        Child1 c = new Child1();
        System.out.println(c.name);
        c.test();
    }
}

class Parent1 {
    String name = "zhangsan";
}

class Child1 extends Parent1 {
    String name = "lisi";
    void test() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
    }

}
