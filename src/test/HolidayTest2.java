package test;

public class HolidayTest2 {


    public static void main(String[] args) {
        String useAlvDdCt = "3일 3시간 50분 ";
        String useAlvDdCt1 = "1일 4시간 ";
        String useAlvDdCt2 = "0일 ";
        String useAlvDdCt3 = "6일 55분 ";

        // 모두 '분'단위로 변환
        int minData = intParseUseAlvDdCt(useAlvDdCt3);

        double doubleUseAlvDdCt = 0;
        doubleUseAlvDdCt = intToDouble(minData);
        System.out.println(doubleUseAlvDdCt);

    }

    // 정수 분 데이터를  소수점 2째자리까지 표기한 double 데이터로 변환하여 반환
    public static double intToDouble(int minData) {
        double result = (double) minData / 60 / 8;
        // 소수점 3째자리 반올림
        result = Math.round(result*100) / 100.0;
        return result;
    }

    public static int intParseUseAlvDdCt(String useAlvDdCt) {
        useAlvDdCt = useAlvDdCt.trim();
        String[] strArr = useAlvDdCt.split(" ");

        int totalMins = 0;
        // 모두 분으로 변환하여 리턴한다
        for (String s : strArr) {
            if (s.indexOf("일") != -1) {
                // 하루 근무 일수는 8시간이므로 24시간이 아닌 8시간을 곱해야 함
               totalMins += Integer.parseInt(s.substring(0, s.indexOf("일"))) * 8 * 60;
            } else if (s.indexOf("시간") != -1) {
               totalMins += Integer.parseInt(s.substring(0, s.indexOf("시간"))) * 60;
           } else if (s.indexOf("분") != -1) {
               totalMins += Integer.parseInt(s.substring(0, s.indexOf("분")));
           }
        }
        return totalMins;
    }
}
