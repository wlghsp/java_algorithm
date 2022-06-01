package test;

public class HolidayTest {


    public static void main(String[] args) {
        String useAlvDdCt = "3일 3시간 50분 ";
        String useAlvDdCt1 = "1일 5시간 ";
        String useAlvDdCt2 = "0일 ";

        useAlvDdCt = parseUseAlvDdCt(useAlvDdCt);
        useAlvDdCt1 = parseUseAlvDdCt(useAlvDdCt1);
        useAlvDdCt2 = parseUseAlvDdCt(useAlvDdCt2);

        System.out.println(useAlvDdCt);
        System.out.println(useAlvDdCt1);
        System.out.println(useAlvDdCt2);

    }

    public static String parseUseAlvDdCt(String useAlvDdCt) {
        String result = "";

        useAlvDdCt = useAlvDdCt.trim();
        String[] s = useAlvDdCt.split(" ");
        int len = s.length;

        if (len == 3) {
            double day = Double.parseDouble(s[0].replaceAll("[^0-9]", ""));
            double hour = Double.parseDouble(s[1].replaceAll("[^0-9]", "")) / 8;
            double minutes = Double.parseDouble(s[2].replaceAll("[^0-9]", "")) / 60 / 8;
            // 소숫점 3째자리 반올림
            result = String.valueOf(Math.round((day + hour + minutes) * 100) / 100.0);
        } else if (len == 2) {
            double day = Double.parseDouble(s[0].replaceAll("[^0-9]", ""));
            double hour = Double.parseDouble(s[1].replaceAll("[^0-9]", "")) / 8;
            // 소숫점 3째자리 반올림
            result = String.valueOf(Math.round((day + hour) * 100) / 100.0);
        } else if (len == 1) {
            int day = Integer.parseInt(useAlvDdCt.replaceAll("[^0-9]", ""));
            result = String.valueOf(day);
        }

        return result;
    }
}
