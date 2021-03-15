package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sca = new Scanner(System.in);
        System.out.println("输入生产日期格式\"yyyy-MM-dd\"");
        String produceDay = sca.nextLine();
        System.out.println("输入保质期");
        int days = sca.nextInt();
        Date produce = null;
        try {
            produce = sdf.parse(produceDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance(); //抽象类用getInstance获得实例对象
        cal.setTime(produce); //用Date设置时间
        cal.add(Calendar.DATE,days);//加上保质期天数
        cal.add(Calendar.WEEK_OF_MONTH,-2);
        cal.roll(Calendar.DAY_OF_WEEK,4);
        String target= sdf.format(cal.getTime());
        System.out.println("促销日是"+target);

    }

}
