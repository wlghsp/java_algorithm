package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeTest2 {
    public static void main(String[] args) {

        String docGaEdate = "2022-04-25";
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate endDate = LocalDate.parse(docGaEdate, formatter);
        int diff = now.compareTo(endDate);
        System.out.println(diff);

    }
}
