package chat01;

public class java_16_Object_ {
    public static void main(String[] args) {
        //访问权限
        //public:公共的，Java的源码中，公共类只能有一个，而且必须和源码文件名相同
        //main方法：main方法是由JVM调用的,JVM调用时应该可以任意调用，而不用考虑权限问题

        //Java中的访问权限主要分为4种：
        //1.private:私有的，同一个类中可以使用
        //2.(default):默认权限，当不设定任何权限时，JVM会默认提供权限，包(路径)权限
        //3.protected；保护的，子类可以访问
        //4.public:公共的，任意使用

        User16 user = new User16();
        //System.out.println(user.name);
        System.out.println(user.username);
        System.out.println(user.sex);
    }
}
class User16 {
    private String name;
    public String username;
    String sex;

    void test() {
        System.out.println(name);
        System.out.println(username);
    }
}

