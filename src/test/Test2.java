package test;

public class Test2 {
    public static void main(String[] args) {

        String useAlvDdCt = "360";
        double finalUseAlvDdCt = 0.0;

        if (useAlvDdCt.contains("일")) { // 연가를 1일 이상 쓴 경우
            // 사용연가일수 useAlvDdCt 8시간 기준 비율 처리 예( 1일 4시간 -> 1.5, 1일 6시간 -> 1.75)
            String day = useAlvDdCt.split(" ")[0];
            day = day.substring(0, day.length() - 1); // "일" 문자 제거
            String hours = useAlvDdCt.split(" ")[1];
            hours = hours.substring(0, hours.length() - 2); // "시간" 문자 제거
            finalUseAlvDdCt = Double.parseDouble(day) + (Double.parseDouble(hours) / (double) 8);
        } else { // 연가를 1일 이하로 사용한 경우
            useAlvDdCt  = useAlvDdCt.substring(0, useAlvDdCt.length() - 2); // "시간" 문자 제거
            finalUseAlvDdCt = Double.parseDouble(useAlvDdCt) / (double) 8;
        }

        System.out.println("total = " + finalUseAlvDdCt);

    }
}
