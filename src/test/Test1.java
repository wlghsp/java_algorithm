package test;

public class Test1 {

    public static void main(String[] args) {

        int ttUseAlvDdCt = 450; // 7시간 30분 사용
        int ttUseAlvDdCt1 = 1380; // 2일 7시간 사용

        int ttAlvDdCt = 10560;

        ttAlvDdCt = ttAlvDdCt / 60 / 8;

        int hours = ttUseAlvDdCt / 60 % 8;
        System.out.println("hours = " + hours);


        double doubleTtUseAlvDdCt = (double) ttUseAlvDdCt1 / 60 / 8;
        System.out.println("doubleTtUseAlvDdCt = " + doubleTtUseAlvDdCt);
        doubleTtUseAlvDdCt = Math.round(doubleTtUseAlvDdCt*100) / 100.0;
        System.out.println("doubleTtUseAlvDdCt = " + doubleTtUseAlvDdCt);
        System.out.println("ttAlvDdCt = " + ttAlvDdCt);



    }
}
