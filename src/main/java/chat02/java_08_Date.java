package chat02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class java_08_Date {
    public static void main(String[] args) throws ParseException {
        //日期类
        //时间戳：毫秒
        System.out.println(System.currentTimeMillis());

        //Date：日期类
        //Calendar：日历类
        Date date = new Date();
        System.out.println(date);

        //Java格式化日期格式：
        // y(Y) -> 年 -> yyyy
        // m(M) -> MM：月份， mm：分钟
        // d(D) -> dd：一个月中的日期， D：一年中的日期
        // h(H) -> h：12进制，HH：24进制
        // s(S) -> s：秒，S：毫秒
        //Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String format = sdf.format(date);
        System.out.println(format);

        //String -> Date
        String dateString = "2024-03-22";
        //Date parse = sdf.parse(dateString);
        LocalDate parse1 = LocalDate.parse(dateString);
        //System.out.println(parse);
        System.out.println(parse1);

        //根据时间戳构建指定的日期对象
        date.setTime(System.currentTimeMillis());
        //获取时间戳
        date.getTime();

        //判断哪个日期在前
//        System.out.println(parse1.isBefore(date));
//        System.out.println(parse1.isAfter(date));



    }
}
