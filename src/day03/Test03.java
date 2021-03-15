package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sca = new Scanner(System.in);
        String birthday = sca.nextLine();
        Date bir = null;
        try {
            bir = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date now = new Date();
        System.out.println((now.getTime()-bir.getTime())/(7l*24*60*60*1000));

    }
}
