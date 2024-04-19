package chat01;

public class java_22_Object_Enum {
    public static void main(String[] args) {
        //枚举
        //枚举是一个特殊的类,其中包含了一组特定的对象,这些对象不会发生改变,一般都使用大写的标识符
        //枚举使用enum关键字使用
        //枚举类会将对象放置在最前面,那么和后面的语法需要使用分号隔开
        //枚举类不能创造对象,它的对象是在内部自行创建
        System.out.println(City.BEIJING.name);
        System.out.println(City.SHANGHAI.code);
        System.out.println(Mycity.SHANGHAI.name);
        System.out.println(Mycity.BEIJING.code);
    }
}
//自创枚举类
class Mycity {
    public String name;
    public int code;

    private Mycity(String name, int code) {
        this.name = name;
        this.code = code;
    }
    public static final Mycity BEIJING = new Mycity("北京", 1001);
    public static final Mycity SHANGHAI = new Mycity("上海", 1002);
}
enum City {
    BEIJING("北京", 1001), SHANGHAI("上海",1002);
    City(String name, int code) {
        this.name = name;
        this.code = code;
    }
    public String name;
    public int code;
}
