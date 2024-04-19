package chat02;

import java.util.HashMap;

public class java_10_compare {
    public static void main(String[] args) {
        //比较
        //等于
        //基本数据类型，双等号==比较数值
        int i = 10;
        int j = 10;
        System.out.println(i == j); //true
        double d = 10.0;
        System.out.println(i == d); //true

        //引用数据类型，双等号==比较变量的内存地址
        String s = "abc";
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s == s1); //true
        System.out.println(s == s2); //false
        System.out.println(s.equals(s2));  //true

        User10 user1 = new User10();
        User10 user2 = new User10();
        System.out.println(user1 == user2); //false
        System.out.println(user1.equals(user2)); //false

        //包装类型

//        Integer i1 = 128;
//        Integer i2 = 128; //-128-127
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}

class User10 {
    //重写euqals()
    @Override
    public boolean equals(Object obj) {
        return true;
    }
    @Override
    public int hashCode() {
        return 1;
    }
}