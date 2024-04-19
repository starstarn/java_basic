package chat03;

import java.util.LinkedList;

public class java_06_LinkedList {
    public static void main(String[] args) {
        //LinkedList
        LinkedList list = new LinkedList();

        //追加数据
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        //向指定的位置增加数据
        list.add(1,"zhaoliu");
        list.addFirst("1");
        list.addLast("2");
        LinkedList list1 = new LinkedList();
        list1.add("a");
        list1.add("b");
        System.out.println(list.addAll(list1));

        System.out.println(list.remove("1"));
        System.out.println(list.remove()); //删除第一个
        list.removeFirst();//删除第一个
        list.removeLast();//删除第二个
        list.remove(1);//删除指定位置的

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        list.contains("1");
        list.element(); //获取第一个数据
        list.indexOf("zhangsan"); //获取数据所在的位置
        list.lastIndexOf("zhangsan");//获取数据的最后一个位置
        list.push("aaa"); //添加数据，添加到第一个位置
        list.pop(); //弹出数据，弹出第一个数据

        System.out.println(list);
    }
}
