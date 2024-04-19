package chat03;

import java.util.ArrayList;

public class java_04_ArrayList {
    public static void main(String[] args) {
        //ArrayList的常用方法
        ArrayList list = new ArrayList();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhangsan");
        list.add("zhangsan");

        //add()可以传递2个参数的，(索引,数据)
        list.add(1,"zhaoliu");

        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("2");

        list.addAll(list1);

        //size():集合内部数据的数量
        System.out.println(list.size());

        //isEmpty()： 判断集合中的数据是否为空
        System.out.println(list.isEmpty());

        //clear():清空集合中的数据
        //list.clear();

        //删除指定集合中的数据
        list.removeAll(list1);

        //判断集合中是否存在某条数据，返回布尔类型的值
        System.out.println(list.contains("zhangsan"));

        //indexOf():用于获取数据在集合中的第一个索引位置，如果数据不存在，则返回-1
        System.out.println(list.indexOf("zhangsan"));
        System.out.println(list.indexOf("1"));

        //lastIndexOf():用于获取数据在集合中的最后一个索引位置
        System.out.println(list.lastIndexOf("zhangsan"));

        //toArray():集合转数组
        Object[] objects = list.toArray();
        System.out.println(objects);

        //clone()：复制新集合
        Object clone = list.clone();
        ArrayList list2 = (ArrayList) clone;

        System.out.println(list2);

        System.out.println(list);
    }
}
