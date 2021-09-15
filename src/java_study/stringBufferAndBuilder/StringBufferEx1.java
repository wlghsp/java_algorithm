package java_study.stringBufferAndBuilder;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

//        sb.append("hello");
//        sb.append(" ");
//        sb.append("jump to java");
//        System.out.println(sb);

        // insert 학습
//        sb.append("jump to java");
//        sb.insert(0, "hello "); // 0번째 위치에 삽입
//        System.out.println(sb);

        // substring

        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 5));
    }
}
