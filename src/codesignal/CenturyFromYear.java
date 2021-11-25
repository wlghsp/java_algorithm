package codesignal;

public class CenturyFromYear {

    static int solution(int year) {
        Double y = (double) year;
        return (int) Math.ceil(y/100);
    }


    public static void main(String[] args) {
        System.out.println(solution(1905));
    }
}
