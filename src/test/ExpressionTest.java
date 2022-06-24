package test;


public class ExpressionTest {

    public static void main(String[] args) {
        String s = "테O트2(행정지원과/-/주무관/기간제근로자) -> 테O트3(행정지원과/-/주무관/기간제근로자) -> 테O트4(기획조정실/-/주무관/기간제근로자)";
        s  = s.replaceAll("\\((.*?)/", "(");
        System.out.println(s);

    }
}
