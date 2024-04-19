package chat03;

import java.util.Hashtable;

public class java_17_Hashtable {
    public static void main(String[] args) {
        //TODo 集合-Map
        //Hashtable
        Hashtable table = new Hashtable();
        table.put("a","1");


        // 1.与HashMap继承的父类不一样
        // 2.底层结构的容量不同：HashMap(16),Hashtable(11)
        // 3.Hashmap的K,V都可以为null
        // 4.HashMap的数据定位采用的是Hash算法，但是Hashtable采用的是Hashcode
        // 5.HashMap的性能较高，但是Hashtable性能较低
    }
}
