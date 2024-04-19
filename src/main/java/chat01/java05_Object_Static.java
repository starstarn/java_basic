package chat01;

import java.text.Bidi;

public class java05_Object_Static {
    public static void main(String[] args) {
        //面向对象
        //把和对象无关，只和类相关的称之为静态
        //针对于具体对象的属性称之为对象属性，成员属性，实例属性
        //针对于具体对象的方法称之为对象方法，成员方法，实例方法
        //和类相关的属性称之为静态属性
        //和类相关的方法称之为静态方法
        //静态语法就是在属性和方法前增加static关键字
        //静态方法不用创建对象就可以访问
        Chines c = new Chines();
        c.name = "张三";

        System.out.println("Hello" + c.name);
        Bird.fly();
        System.out.println(Bird.type);

        //成员方法可以访问静态属性和静态方法
        Test t = new Test();
        t.sex = "女";
        t.test();
        t.test1();
        Test.test1();

    }
}
class Test {
    String name;
    static String sex;
    void test() {
        test1();
        System.out.println(sex);
        System.out.println("test....");
    }
    static void test1() {
        // test();
        System.out.println("test1...");

    }
}

class Bird {
    static String type = "鸟";
    static void fly() {
        System.out.println("飞");
    }
 }

class Chines {
    String name;
}
