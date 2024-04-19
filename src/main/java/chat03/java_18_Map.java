package chat03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class java_18_Map {
    public static void main(String[] args) throws Exception{
        //集合-Map
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        Set<String> keys = map.keySet();

//        for (String key : keys) {
//            if("c".equals(key)) {
//                map.remove("b");
//            }
//            System.out.println(map.get(key));
//        }

        //迭代器
        Iterator<String> iterator = keys.iterator();
        //hasNext()用于判断是否存在下一条数据
        while (iterator.hasNext()) {
            //获取下一条数据
            String key = iterator.next();
            if("b".equals(key)) {
                iterator.remove();
            }
            System.out.println(map.get(key));
        }



    }
}
