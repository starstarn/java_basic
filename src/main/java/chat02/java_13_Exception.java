package chat02;

public class java_13_Exception {
    public static void main(String[] args) {
        //异常
        //1.除数为0的算术异常：java.lang.ArithmeticException
        //运行期异常
//        int i = 0;
//        if(i != 0) {
//            int j = 10 / i;
//        }

        //2 空指针异常 ： java.lang.NullPointerException
        //调用了一个为空对象的属性或方法时，就会发生异常
        User13 user = null;
//        if(user != null) {
//            System.out.println(user.toString());
//        }
        try {
            System.out.println(user.toString());
            System.out.println(user.name);
        } catch (NullPointerException e) {
            System.out.println("对象为空，需要分析数据为空的原因");
        }
    }
}
class User13 {
    public static String name = "zhangsan";
}
