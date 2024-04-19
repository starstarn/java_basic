package chat02;

public class java_01_Array {
    public static void main(String[] args) {
        //数组
        //声明方式:类型[] 变量;
        //数组的创建:new 类型[];

//        String[] names = new String[3];
//        User1 user1 = new User1();

        int[] nums = new int[3];
        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = {"zhangsan", "lisi", "wangwu"};
        System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }

        //二维数组
        String[][] namess = new String[3][3];

    }
}

class User1 {
    public void test() {
        System.out.println("test...");
    }
}
