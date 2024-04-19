package chat01;

public class java_26_Object_ {
    public static void main(String[] args) {
        //常见类和对象
        Object obj = new Person26();
        //将对象转换成字符串
        //toString默认打印的就是对象的内存地址,所以,为了能够更直观理解对象的内容,所以可以重写这个方法
        String s = obj.toString();
        System.out.println(s);

        //获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        //判断两个对象是否相等,如果相等返回true,否则返回false
        //equals方法比较对象时,默认比较就是内存地址
        Person26 person26 = new Person26();
        System.out.println(person26.hashCode());
        System.out.println(obj.equals(person26));

        //getClass获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getPackageName());
    }
}
class Person26 {
    public String name;
//    @Override
//    public String toString() {
//        return "Person["+name+"]";
//    }

    public boolean equals(Object obj) {
        return true;
    }
}
class user extends Person26{

}
