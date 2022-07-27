package coding_monster.문제2H픽셀수세기;

import java.util.Scanner;


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
        long y = R;

        for (int x = 0; x <= R; x++) {
            for (; y >= 0; y-=1) {
                if(isInside(x, y, R)) {
                    // y:= X좌표에서 위에서부터 내려오다가 최초로 원에 포함되는 픽셀의 y좌표
                    long h = y + 1;
                    count += h;
                    break;
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
