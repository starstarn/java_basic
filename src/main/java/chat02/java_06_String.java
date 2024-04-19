package chat02;

public class java_06_String {
    public static void main(String[] args) throws Exception{
        //字符串
        //连续字符组成的数据整体
        // java.lang.String  字符串类
        //字符串，字符，字节的关系
        String name = "zhangsan";
        char[] cs = {'中', 'a'};
        byte[] bs = {-28,-72,-83,-27,-101,-67};

        String s = new String(cs);
        String s1 = new String(bs, "UTF-8");
        System.out.println(s);
        System.out.println(s1);

        String s2 = "\"";
        //转义字符 \" => 文字内容的双引号
        // \',\t,\n,\\
        System.out.println(s2);
        System.out.println("\'");
        System.out.println("a\tb");
        System.out.println("c\nd");
        System.out.println("e\\f");

    }
}
