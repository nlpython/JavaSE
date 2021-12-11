package LocalDateAndTIme;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDate {
    public static void main(String[] args) {
        //获取当前日期时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //of()指定日期时间
        LocalDate of = LocalDate.of(2010, 5, 6);
        LocalTime of1 = LocalTime.of(12, 45, 56);
        LocalDateTime of2 = LocalDateTime.of(1937, 12, 23, 12, 56, 56);
        System.out.println(of2);

        //LocalDateTime用的最多
        //get***()
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());

        //with***() Local系列不可变，需要用新的对象接受with改变后的值
        LocalDateTime newldt = localDateTime.withMonth(9);
        System.out.println(newldt.getMonth());

        //Local提供了加减操作（仍然具有不变性）
        LocalDateTime newldt1 = localDateTime.plusMonths(1);
        System.out.println(localDateTime);
        System.out.println(newldt1.getMonthValue());
        LocalDateTime newldt2 = localDateTime.minusMonths(2);
        System.out.println(newldt2.getMonth());
    }
}
