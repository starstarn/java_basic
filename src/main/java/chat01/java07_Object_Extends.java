package chat01;

public class java07_Object_Extends {
    public static void main(String[] args) {
        //extends-继承
        //面向对象中三个重要特征：继承，封装，多态
        //类存在父子关系：子类可以直接获取到父类的成员属性和成员方法。
        //类的继承只能是单继承，一个类只能有一个父类。一个父类可以有多个子类

        //继承采用extends语法： 子类 extends 父类
        Child c = new Child();
        c.test();


    }
}

class Parent {
    String name = "zhangsan";
    void test() {
        System.out.println("test");
    }
}

class Child extends Parent{

}
