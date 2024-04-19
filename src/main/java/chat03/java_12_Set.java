package chat03;

import java.util.ArrayList;
import java.util.HashSet;

public class java_12_Set {
    public static void main(String[] args) {
        //HashSet
        HashSet set = new HashSet();
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        set.addAll(list);

        Object[] objects = set.toArray();

        set.contains("lisi");
        set.isEmpty();
        // set.clear();

        Object clone = set.clone();
        System.out.println("克隆后的对象："+clone);

        System.out.println(set);
    }
}
