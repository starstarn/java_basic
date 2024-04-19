package chat01;

public class java_20_Object_abstract {
    public static void main(String[] args) {
        //抽象类:不完整的类
        //       abstract class 类名
        //        因为类不完整,所以无法直接构造对象
        //抽象方法:只有声明,没有实现的方法
        //        abstract 返回值类型 方法名(参数)

       // 分析问题:对象(具体)  => 类(抽象)
        // 编写代码:类(抽象) = > 对象(具体)

        //如果一个类中含有抽象方法,那么这个类是抽象类
        //如果一个类的抽象类,他的方法不一定是抽象方法
        //抽象类无法直接构建对象,但可以通过子类间接构建对象
        //如果抽象类中有抽象方法,那么子类继承抽象类时,需要重写抽象方法,将方法补充完整
        //abstract关键字不能和final同时使用
        //Person20 person = new Person20();
        Chinese20 c = new Chinese20();
        c.eat();
    }
}
abstract class Person20 {
    public abstract void eat();
    public void test() {
    }
}

class Chinese20 extends Person20 {
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
}