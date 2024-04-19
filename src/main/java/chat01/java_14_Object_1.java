package chat01;

public class java_14_Object_1 {
    public static void main(String[] args) {
        //重写
        //CCC ccc = new CCC();
        //System.out.println(ccc.sum());  //20
//        DDD ddd = new DDD();
//        System.out.println(ddd.sum());   //40
        CCC ddd = new DDD();
        //一个对象能使用什么方法，取决于引用变量的类型
        //一个对象能使用什么属性，取决于引用变量的类型
        //一个对象的方法具体的使用(直接，间接)是需要看具体的对象的

        //一个对象的属性具体的使用是不需要看具体的对象的，属性在哪里声明在哪里使用

        //总结：方法：编译看左边，执行看左边
        //     属性：编译看左边，执行看右边

        System.out.println(ddd.sum());

    }
}
class CCC {
    int i = 10;
//    int sum() {
//        return i + 10;
//    }
    int sum() {
        return getI() + 10;
    }
    int getI() {
        return i;
    }
}
class DDD extends CCC {
    int i = 20;
//    int sum() {
//        return i + 20;
//    }
    int getI() {
        return i;
    }
}
