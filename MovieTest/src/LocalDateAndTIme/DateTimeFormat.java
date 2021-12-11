package LocalDateAndTIme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormat {
    public static void main(String[] args) {
        // 格式化类： DateTimeFormatter

        // 方式一：预定义的标准格式。如：ISO_LOCAL_DATE_TIME
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // df1就可以帮我们完成LocalDateTime和String之间的转换：

        // LocalDateTime-->String:
        LocalDateTime now = LocalDateTime.now();
        String str = df1.format(now);
        System.out.println(str);

        // String-->LocalDateTime:
        TemporalAccessor parse = df1.parse("2021-08-22T12:43:36");
        System.out.println(parse);
        System.out.println("----------------------");

        // 方式二：本地化相关的格式。如：oflocalizedDateTime()
        // 参数：FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        // LocalDateTime-->String
//        LocalDateTime now1 = LocalDateTime.now();
//        String str2 = df2.format(now1);
//        System.out.println(str2);

        // 方式三：自定义格式。如：ofPattern( "yyyy-MM-dd hh:mm:ss" ) -->常用
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yy-MM-dd hh:mm:ss");
        // LocalDateTime-->String
        LocalDateTime now3 = LocalDateTime.now();
        String format = df3.format(now3);
        System.out.println(format);
        // String-->LocalDateTime
        TemporalAccessor parse2 = df3.parse("21-08-22 12:58:38");
        System.out.println(parse2);
    }
}
