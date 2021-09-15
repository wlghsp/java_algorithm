package java_study.split;

public class SplitEx2 {
    public static void main(String[] args) {
        String str2 = "서울,대전,대구,부산,인천,울산";

        String[] cityArr = str2.split(",");

        for (int i = 0; i < cityArr.length; i++) {
            System.out.println(cityArr[i]);
        }
    }
}
