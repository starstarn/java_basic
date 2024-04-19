package chat01;

public class java_11_Object_1 {
    public static void main(String[] args) {
        byte b = 10;
        test(b);
        //int => iii
        //byte => 8
        //short => 16
        //char => 16
        //int =>32
        //基本数据类型在匹配方法时，可以在数值不变的情况下，扩大数据的精度
        //byte类型无法和char类型做转换,char没有负数，但是byte存在负数
    }
//    static void test(byte b) {
//        System.out.println("bbb");
//    }
    static void test(short s) {
        System.out.println("sss");
    }
    static void test(char c) {
        System.out.println("ccc");
    }
    static void test(int i) {
        System.out.println("iii");
    }
}
