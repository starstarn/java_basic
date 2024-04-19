package chat02;

public class java_05_erfen {
    public static void main(String[] args) {
        //二分查找
        int[] a = {1,2,3,4,5,6,7};
        int l = 0, r = a.length - 1;
        int mid = 0;
        int num = 6;
        while(l<=r) {
            mid = (l+r) / 2;
            if(a[mid] > num) {
                r = mid - 1;
            } else if (a[mid] < num) {
                l = mid + 1;
            } else {
                break;
            }
        }
        System.out.println("数据在数组的位置："+mid);
    }
}
