package chat01;

public class java_15_Object_digui {
    public static void main(String[] args) {
        //递归：方法调用自身，称之为递归方法
        //1+3+5+7+9... +19
//        int result = computeAP(10);
//        System.out.println(result);

        //阶乘：5！ => (4,3,2,1) => 5 * 4 * 3 * 2 * 1
        //0的阶乘为1
        int res = computeFactorial(5);
        System.out.println(res);
    }

    public static int computeFactorial(int num) {
        if(num <= 1) {
            return 1;
        } else {
            return num * computeFactorial(num - 1);
        }
    }

    public static int computeAP(int num) {
        num = num % 2 == 0 ? num - 1 : num;
        if(num == 1) {
            return  1;
        } else {
            return num + computeAP(num - 2);
        }
    }
}
