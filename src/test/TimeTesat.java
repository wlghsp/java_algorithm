package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTesat {

//    public static void main(String[] args) throws ParseException {
//        LocalDateTime now = LocalDateTime.now();
//        String dateOfToday = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
//
//
//        SimpleDateFormat format = new SimpleDateFormat("HHmm"); // 출장시작시간 파싱을 위해 포맷 재할당
//        String currentTime = now.format(DateTimeFormatter.ofPattern("HHmm"));
//        Date cTime = format.parse(currentTime);
//    }
    
    public String today() {
        LocalDateTime now = LocalDateTime.now();
        String dateOfToday = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return dateOfToday;
    }
    
    public String now() throws ParseException {
        LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat format = new SimpleDateFormat("HHmm"); // 출장시작시간 파싱을 위해 포맷 재할당
        String currentTime = now.format(DateTimeFormatter.ofPattern("HHmm"));

        return currentTime;
    }
    
}
