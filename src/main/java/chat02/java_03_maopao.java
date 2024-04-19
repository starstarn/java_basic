package chat02;

public class java_03_maopao {
    public static void main(String[] args) {
        //数组
        int nums[] = {1,4,3,5,2};

        for (int num : nums) {
            System.out.println(num);
        }
        //冒泡

        for( int j = 0; j < nums.length; j ++) {
            for(int i = 0; i < nums.length - j - 1; i ++) {
            int num1 = nums[i];
            int num2 = nums[i+1];
            if(num1 > num2) {
                nums[i] =num2;
                nums[i+1] = num1;
            }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
