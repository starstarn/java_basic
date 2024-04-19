package chat03;

public class java_08_Collection {
    public static void main(String[] args) {
        //泛型语法
        //泛型和类型的区别
        //类型：用于约束外部对象的使用场景
        //泛型：用于约束内部对象的使用场景，泛型没有多态
        //有时，也把泛型称之为类型参数
        MyContainer<User8> myContainer = new MyContainer();
        //myContainer.data = new Object();
        //test(myContainer);

    }
    public static void test(MyContainer<Object> myContainer) {
        System.out.println(myContainer);
    }
}
//容器类
class MyContainer<C> {
    public C data;
}
class User8 {

}
