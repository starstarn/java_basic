package chat01;

public class java03_Datatype_basic_zhuanhuan {
    public static void main(String[] args) {
        //数据类型的转换
        //小范围的数据转为大范围的数据类型是可以的。大->小无法直接转换
        //byte->short->int->long->float->double
        int i = 5;
        double d = 2;

        int i1 = (int)d; //强制类型转换
    }
}
