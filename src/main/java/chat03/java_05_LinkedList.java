package chat03;

import java.util.LinkedList;

public class java_05_LinkedList {
    public static void main(String[] args) {
        //LinkedList:Linked(连接)+List
        //链表结构
        //构建集合对象
        LinkedList list = new LinkedList();
        //增加第一个数据
        list.add("zhangsan");
        list.addFirst("lisi");
        list.add(1,"wangwu");

        //获取数据
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //获取数据（遍历数据）
        System.out.println(list.get(1));
        for(int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }

        for(Object obj : list) {
            System.out.println(obj);
        }

        //修改数据
        list.set(1,"zhaoliu");

        System.out.println(list);
        //删除数据
        list.remove("zhaoliu");

        System.out.println(list);
    }
}
