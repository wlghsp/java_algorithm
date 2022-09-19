package test;

public class LastNumIncreaseTest {

    //https://stackoverflow.com/questions/21938228/how-to-increment-the-number-in-a-string-by-1

    public static void main(String[] args) {
        String[] arr = {"MNG135001",
                    "MNG135002",
                    "MNG135003",
                    "MNG135004",
                    "MNG135005",
                    "MNG135005",
                    "MNG135006",
                    "MNG135006",
                    "MNG135005",
                    "MNG135007"};

        for (String frcnSts : arr) {
            if ("MNG135006".equals(frcnSts)|| "MNG135007".equals(frcnSts)) continue;
            String newFrcnSts = "MNG" + (Integer.parseInt(frcnSts.substring(3))+1);
            System.out.println(newFrcnSts);
        }



    }
}
