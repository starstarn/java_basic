package chat02;

public class java_15_Exception {
    public static void main(String[] args) {
        //5.格式化异常：NumberFormatException
        String s = "a123";
        //Integer i = (Integer)s;
//        Integer i = Integer.parseInt(s);
//        System.out.println(i);

        //6. 类型转换错误
        Object obj = new User15();
        if(obj instanceof Emp15) {
            Emp15 emp = (Emp15)obj;
        }
    }
}

class User15 {

}
class Emp15 {

}