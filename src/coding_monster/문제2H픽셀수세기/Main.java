package coding_monster.문제2H픽셀수세기;

import java.lang.*;
import java.util.*;


public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 왼쪽 아래 좌표가 (x,y)인 픽셀이 반지름 R인 원에 포함되는가?
     * @param x
     * @param y
     * @param R
     * @return  포함된다면 true, else false
     */
    public static boolean isInside(long x, long y, long R)
    {
        long sqd = x * x + y * y;
        return sqd < R * R;

    }

    public static void testCase(int caseIndex) {
        long R = scanner.nextLong();
        long count = 0;
        for (int x = 0; x <= R; x++) {
            for (int y = 0; y <= R; y++) {
                // <x,y> := (0,0) ~ (R,R)까지의 모든 좌표가 차례로 한 번씩
                if (isInside(x, y, R)) {
                    // <x,y>가 왼쪽 아래 점인 픽셀들 중 원 내부에 있는 모든 픽셀
                    count++;
                }
            }
        }

        System.out.printf("#%d\n", caseIndex);
        System.out.println(count * 4);
    }

    public static void main(String[] args) throws Exception {
        int caseSize = scanner.nextInt();

        for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
            testCase(caseIndex);
        }
    }

}
