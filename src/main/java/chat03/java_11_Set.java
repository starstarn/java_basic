package chat03;

import java.util.HashSet;

public class java_11_Set {
    public static void main(String[] args) {
        //Set
        //HashSet
        //ArrayList:数组
        //LinkedList:
        HashSet set = new HashSet();
        //TODo 增加数据
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");

        //TODo 修改数据


        //TODo 删除数据
        set.remove("wangwu");

        //TODo 查询数据
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println(set);
    }
}
