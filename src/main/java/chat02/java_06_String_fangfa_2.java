package chat02;

public class java_06_String_fangfa_2 {
    public static void main(String[] args) {
        //
        //StringBuilder：构建字符串
        String s = "";
        for(int i = 0; i < 100; i++){
            s = s + i; //01234...
        }
        System.out.println(s);

        StringBuilder s1 = new StringBuilder();
        for( int i = 0; i < 100; i ++) {
            s1.append(i);
        }
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder();
        s2.append("abc");
        System.out.println(s2.toString());
        System.out.println(s2.length());
        System.out.println(s2.reverse());//反转，返回反转后的
        System.out.println(s2.insert(1, "d")); //在指定位置插入字符
    }
}
