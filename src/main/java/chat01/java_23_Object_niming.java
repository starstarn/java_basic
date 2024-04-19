package chat01;

public class java_23_Object_niming {
    public static void main(String[] args) {
        //匿名类
        //在模型场合下,类的名字不重要,我们指向使用类中的方法或功能,那么此时我们可以采用特殊的语法:匿名类
        //所谓的匿名类,就是没有名字的类
        Me me = new Me();
//        me.sayHello(new Zhangsan());
//        me.sayHello(new Lisi());
        me.sayHello(new Person23() {
            public String name() {
                return "wangwu";
            }
        });

        new Bird23().fly();
        new Fly(){
            public void fly() {
                System.out.println("使用飞行器飞翔");
            }
        }.fly();
    }
}
interface Fly {
    public void fly();
}
class Bird23 implements Fly {
    public void fly() {
        System.out.println("使用翅膀飞翔");
    }
}
abstract class Person23 {
    public abstract String name();
}
class Me {
    public void sayHello(Person23 person23) {
        System.out.println("Hello " + person23.name());
    }
}
class Zhangsan extends Person23 {
    public String name() {
        return "zhangsan";
    }
}
class Lisi extends Person23 {
    public String name() {
        return "lisi";
    }
}