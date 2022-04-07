package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class test3 {

    public static void main(String[] args) throws ParseException {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HHmm");
        String currentTime = time.format(formatter2);

        String startTime = "1410";
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        Date sTime = sdf.parse(startTime);
        Date cTime = sdf.parse(currentTime);
        boolean result = cTime.after(sTime);
        System.out.println(result);
    }
}
