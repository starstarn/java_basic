package chat02;

import java.io.UnsupportedEncodingException;

public class java_06_String_fangfa {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        //字符串操作
//        //1.拼接
//        String s = "a" + "b"; //"ab"
//        String s1 = "ab";
//        String s2 = "abc" + 1 + 2; //abc12
//        String s3 = 1 + "abc" + 2; //1abc2
//        String s4 = 1 + 2 + "abc"; //3abc
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
//        System.out.println(s2);
//        System.out.println(s3);
//
//        //拼接：字符串1.concat(字符串2)
//        System.out.println(s1.concat("abc"));  //ababc

//        //2.字符串比较
//        String a = "a";
//        String b = "b";
//        //判断是否相等
//        System.out.println(a.equals(b));  //false
//        //忽略大小写的相等
//        System.out.println(a.equalsIgnoreCase("A"));   //true
//
//        // 如果i为正数，则a>b;
//        // 如果i为负数，则a<b；
//        // 如果i为0，则a=b；
//        int i = a.compareTo(b);
//        System.out.println(i);
//        String m = "ad";
//        String n = "ab";
//        System.out.println(m.compareTo(n));
//
//        byte b1 = (byte)'A';
//        byte b2 = (byte)'a';
//        System.out.println("A=" + b1);
//        System.out.println("a=" + b2);
//
//        //3.截断
//        String s = "Hello World";
//        //子字符串
//        //substring方法用于截取字符串的，两个参数。
//        System.out.println(s.substring(0, 3)); //[0,3)  //Hel
//        System.out.println(s.substring(0, "Hello".length()));  //Hello
//        System.out.println(s.substring(6, s.length())); //World
//
//        //如果只传一个参数，就表示从指定位置截取字符串，截取到最后
//        System.out.println(s.substring(6)); //World
//
//        //分解字符串:根据指定的规则对字符串进行分解。可以将一个完整的字符串，分解成几个部分。
//        String[] s1 = s.split(" ");
//        System.out.println(s1.length);  //2
//        for (String s2 : s1) {
//            System.out.println(s2);
//        }
//
//        //trim：去掉字符串的首位空格的信息
//        String s3 = "   Hello World   ";
//        System.out.println("!"+s3.trim()+"!");
//
//        //字符串的替换
//        String s4 = "Hello World World Zhangsan";
//        //repalce("old","new")
//        System.out.println(s4.replace("World", "Java"));
//
//        //replaceAll("规则","new")
//        System.out.println(s4.replaceAll("World|Zhangsan", "Java"));
//
//        //字符串的大小写转换
//        String s5 = "Hello World";
//        System.out.println(s5.toLowerCase());  //都变为小写
//        System.out.println(s5.toUpperCase());  //都变为大写
//
//        String className = "user";  //转为首字母大写User
//        String s6 = className.substring(0,1);  //u
//        String s7 = className.substring(1); //ser
//        String s8 = s6.toUpperCase() + s7;
//        System.out.println(s8);

        //字符串的查找
        String s = "Hello World";
        char[] chars = s.toCharArray();
        byte[] bytes = s.getBytes("UTF-8");
        //charAt可以传递索引定位字符串中指定位置的字符
        System.out.println(s.charAt(1)); //e
        //indexOf()用于获取数据在字符串中第一次出现的位置
        System.out.println(s.indexOf("Hello")); //0
        System.out.println(s.indexOf("World")); //6
        //lastindexOf()用于获取数据在字符串中最后出现的位置
        System.out.println(s.lastIndexOf("World")); //最后一个

        //contains()是否包含指定的字符串，返回布尔类型
        System.out.println(s.contains("Hello"));

        //startsWith()判断字符串是否以指定的数据开头，返回布尔类型
        System.out.println(s.startsWith("World"));

        //endsWith()判断字符串是否以指定的数据结尾，返回布尔类型
        System.out.println(s.endsWith("World"));

        //isEmpty()判断字符串是否为空，" "空格是一个特殊的子房湖，所以看不到，但不为空
        System.out.println(s.isEmpty());


    }
}
