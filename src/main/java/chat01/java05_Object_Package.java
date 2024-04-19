package chat01;

public class java05_Object_Package {
    public static void main(String[] args) {
        //package中容纳类
        // 基本语法：package 包名
        //主要功能用于分类管理
        //多个包使用.隔开

        //一个类可以没有包，但是一个包不可以在同一个源码文件中使用多次
        //包为了区分类名，所以一般全部都是小写（大写也可以）

        //Java中存在不同包的相同名称的类，可以使用包进行区分
        //一般情况下，在使用类的情况下，会使用类的全名（包名+类型）
        new java.util.Date();
    }
}
