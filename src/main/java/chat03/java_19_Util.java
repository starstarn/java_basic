package chat03;

import java.util.Arrays;
import java.util.List;

public class java_19_Util {
    public static void main(String[] args) {
        //TODo 集合 - Arrays
        int[] is = {2,3,5,1,4};
        int[] is1 = {1,2,3,4,5};
        int[] is2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(is));
        System.out.println(is);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //排序（默认为升序）
        Arrays.sort(is);
        System.out.println(Arrays.toString(is));

        //
        System.out.println(Arrays.binarySearch(is, 5));

        //数组的比较,顺序和内容完全相同
        System.out.println(Arrays.equals(is, is1));
        System.out.println(Arrays.equals(is2, 0, 5, is1, 0, 5));
    }
}
