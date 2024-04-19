package chat02;

public class java_16_Exception {
    public static void main(String[] args) throws Exception {
        User16 user = new User16();
        int i = 10;
        int j = 0;

        try {
            user.test(i,j);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //user.test(i,j);
    }
}
class User16 {
    //如果方法中可能会出现问题，那么需要提前声明，方法可能会出问题
    //此时需要使用关键字throws
    //如果程序中需要手动抛出异常对象，那么需要使用throw关键字，然后new出异常对象
    public void test(int i, int j) throws Exception{
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw  new  Exception();
        }

    }
}
