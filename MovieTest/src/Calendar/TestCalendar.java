package Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你想查看的日期（请按照1990-2-5的格式书写）：");
        String dateString = in.nextLine();

        java.sql.Date date = java.sql.Date.valueOf(dateString);
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //获取本月最大天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当日
        int nowDay = cal.get(Calendar.DATE);
        //将日期调为本月第一天
        cal.set(Calendar.DATE, 1);
        //获取这个一号是本周第几天
        int numDay = cal.get(Calendar.DAY_OF_WEEK);
        //提前打印空格
        for (int i = 0; i < numDay - 1; i++){
            System.out.print("\t");
        }
        int count = numDay - 1;
        //顺序输出日历
        for (int i = 1; i <= maxDay; i++) {
            if (i == nowDay){
                System.out.print(i + "*\t");
            } else {
                System.out.print(i + "\t");
            }
            count++;
            //每七天换行
            if (count % 7 == 0) {
                System.out.println();
            }
        }
    }
}
