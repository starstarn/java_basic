package chat03;

import java.util.ArrayList;
import java.util.Comparator;

public class java_09_Sort {
    public static void main(String[] args) {
        //Sort 排序
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);

        //排序需要传递一个实现了比较器接口的对象
        list.sort(new NumberComparator());

        System.out.println(list);

    }
}
class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //如果第一个数据大于第二个数据，则返回正数，表示升序
        //return o1-o2;  //前减后，升序
        //如果第一个数据小于第二个数据，则返回负数，表示降序
        return o2-o1;    //后减前，降序
        //如果第一个数据等于第二个数据，则返回0，
    }
}
