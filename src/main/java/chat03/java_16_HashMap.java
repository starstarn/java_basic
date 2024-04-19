package chat03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class java_16_HashMap {
    public static void main(String[] args) {
        //HashMap: 底层是数组+单向链表
        HashMap<String, String> map = new HashMap();

        //添加数据
        //修改数据，返回旧的值,
//        map.put("a","0");
//        Object oldVal = map.put("a", "1"); //如果是第一次添加，则返回null
//        System.out.println(oldVal);
//
//        //添加数据
//        map.putIfAbsent("b","2");
//        map.putIfAbsent("b","3");  //如果map中没有，则添加，如果有，则不添加也不覆盖
//
//        //修改数据
//        Object b = map.replace("b", "4");  //返回修改前的值
//        map.replace("c","5"); //map中没有则不修改
//        System.out.println(b);

        map.clear();
        map.put("zhangsan","1");
        map.put("lisi","2");
        map.put("wangwu","3");

        //获取map集合中所有的key
//        Set set = map.keySet();
//        for (Object k : set) {
//            System.out.println(map.get(k));
//        }
//
//        System.out.println(map.containsKey("zhangsan"));
//
//        Collection values = map.values();
//        for (Object value : values) {
//            System.out.println(value);
//        }
//
//        System.out.println(map.containsValue("2"));

        //TODo 获取键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() +"="+entry.getValue());
        }

        map.remove("zhangsan","1111");

        map.size();
        map.clear();
        map.clone();
        map.isEmpty();

        System.out.println(map);
    }
}
