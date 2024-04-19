package chat01;

import java.text.CollationKey;

public class java04_Object {
    public static void main(String[] args) {
        // 面向对象
        // 类

        /*
        class 类名 {
            特征（属性）
            功能（方法）
        }
        创建对象的语法：
        new 类名()；
         */

        //问题：做一道菜，红烧排骨
        //类：菜   对象：红烧排骨

        //1.声明类
        //2.创建对象
        //3.声明属性
        //4.声明方法
           //void 方法名（参数）{功能代码}
        //5.执行方法
            //对象.方法名（）

        //引用数据类型
        Cooking c = new Cooking();
        c.name = "红烧排骨";
        c.food = "排骨";

        c.execute();

        Cooking f = new Cooking();
        f.name = "红烧鱼";
        f.food = "草鱼";
        f.execute();

    }
}

class Cooking {
    //特征（属性）
    //名字
    String name;
    //菜的类型
    String type = "红烧";
    //食材
    String food;
    //佐料
    String relish = "大料";

    //执行
    void execute() {
        System.out.println("准备食材："+ food);
        System.out.println("准备佐料："+ relish);
        System.out.println("开始烹饪");
        System.out.println(name + "烹饪完成");
    }

}
