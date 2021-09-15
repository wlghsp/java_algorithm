package java_study.split;

public class SplitEx3 {
    public static void main(String[] args) {
//        String[] arr = str2.split("-",2);
//        System.out.println("ret4 = " + arr[0]);
//        System.out.println("ret5 = " + arr[1]);


        String str2 = "81-2-010-1234-5678";
        String[] arr2 = str2.split("-", 4);

        System.out.println(arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("ret" + i + " = " + arr2[i]);
        }


    }
}
