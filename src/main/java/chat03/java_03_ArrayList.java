package chat03;

import java.util.ArrayList;

public class java_03_ArrayList {
    public static void main(String[] args) {
        //List
        // TODo ArrayLiat : Array + List
        //List:列表，清单
        //  按照数据插入的顺序进行存储
        //Array:数据，阵列

        //创建第一个集合对象：ArrayList
        ArrayList list = new ArrayList(3);
        //1.不需要传递构造参数，直接new就可以，底层数组为空数组
        //2.构造参数需要传递一个int类型的值，用于设定底层数组的长度
        //3.构造参数需要传递一个Collection集合类型的值，用于将其他集合中的数据放置在当前集合中

        // 增加数据
        //add()可以增加数据
        //添加数据时，如果集合中没有任何的数据，那么底层会创建长度为10的数组
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        list.add("zhangsan");
        list.add("4124");
        //获取集合中数据的条数
        System.out.println(list.size());
        //获取指定位置的数据，可以采用索引的方式
        System.out.println(list.get(1));
        //遍历集合中的数据
        for (int i = 0; i < list.size(); i ++) {
            System.out.println("集合中的数据："+list.get(i));
        }
        //如果循环遍历集合数据时，不关心数据的位置，那么可以采用特殊的for循环
        for( Object obj : list) {
            System.out.println("集合中的数据："+obj);
        }
        //set() :将指定位置的数据进行修改,(index,new)，方法返回结果为更新前的值
        Object old = list.set(1, "222");
        System.out.println("修改前的值:" + old);

        //remove() :删除数据，返回被删除的值
        Object removeVal = list.remove(1);
        System.out.println("删除的值"+removeVal);


        //打印集合对象
        System.out.println(list);
        System.out.println("main方法执行完毕");
    }
}
