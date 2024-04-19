package chat03;

import java.util.HashMap;

public class java_15_HashMap {
    public static void main(String[] args) {
        //HashMap: Hash + Map
        //数据存储无序
        HashMap map = new HashMap();

        //添加数据
        //修改数据，put()也可以修改数据，返回值就是被修改的值
        map.put("zhangsan","1");
        System.out.println(map.put("zhangsan", "4"));
        map.put("lisi","2");
        map.put("wangwu","3");

        //查询数据
        System.out.println(map.get("zhangsan"));

        //删除数据
        map.remove("zhangsan");

        System.out.println(map);

    }
}
