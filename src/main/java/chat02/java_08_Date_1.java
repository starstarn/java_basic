package chat02;

import java.util.Calendar;
import java.util.Date;

public class java_08_Date_1 {
    public static void main(String[] args) {
        //日历类
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));
        instance.get(Calendar.DAY_OF_MONTH);

        instance.setTime(new Date());
        instance.add(Calendar.YEAR,1);

    }
}
