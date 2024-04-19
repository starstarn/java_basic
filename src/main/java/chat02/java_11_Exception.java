package chat02;

public class java_11_Exception {
    public static void main(String[] args) {
        //异常
        // 1.类型转换发生了错误
//        String s = "123";
//        Integer i = (Integer)s;

        //2.递归没有跳出的逻辑:StackOverFlowError:Error
        //尽量避免
        //test();

        //3.访问一个为空对象的成员方法时，出现了错误：java.lang.NullPointerException（异常）
        //Java中异常分为2大类：
        //3.1可以通过代码恢复正常逻辑长记性的异常，称之为运行期异常：RuntimeException
        //3.2不可以通过代码恢复正常逻辑长记性的异常，称之为编译期异常：（Exception）
        User user = null;
        System.out.println(user.toString());
    }
    public static void test() {
        test();
    }
 }
class User {

}