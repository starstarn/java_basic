package chat01;

public class java_12_Object_2 {
    public static void main(String[] args) {
        //AAA aaa = new AAA();
        //BBB aaa = new BBB();
        AAA aaa = new BBB();  //aaa
        test(aaa);
        //多态其实就是约束了对象的使用场景
        //方法的重载：方法名相同，参数列表不同（个数，顺序，类型）
    }
    static void test(AAA aaa) {
        System.out.println("aaa");
    }
    static void test(BBB bbb) {
        System.out.println("bbb");
    }
}

class AAA {

}
class BBB extends AAA{

}
