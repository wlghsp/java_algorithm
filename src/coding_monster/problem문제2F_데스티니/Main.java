package coding_monster.problem문제2F_데스티니;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        Point2D[] points = new Point2D[n];

        for(int i = 0 ; i < n ; i++)
        {
            int x=  scanner.nextInt();
            int y=  scanner.nextInt();
            points[i] = new Point2D(x, y);
        }

        // points => N개의 점의 배열
        int minDist = Integer.MAX_VALUE; // 쌍들중 가장 짧았던 거리
        int minCount = 0; // 쌍들중  mindDist라는 거리를 가지는 쌍의 개수

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                /// <i, j> := i는 0~n-1이고 j < i인 모든 쌍
                int sqd = points[i].getSquaredDistanceTo(points[j]);
                if (sqd < minDist) {
                    minDist = sqd;
                    minCount = 1;
                } else if (sqd == minDist) {
                    // 갱신은 안 일어났지만, 최소거리를 가진 쌍을 새로 발견
                    minCount += 1;
                }
            }
        }

        System.out.printf("%.1f\n", Math.sqrt(minDist));
        System.out.printf("%d", minCount);
    }
}

class Point2D{
    int x;
    int y;
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * 2차원 평면 상에서 점 this부터 점 target까지 거리의 제곱을 계산하는 함수
     * @param target
     * @return
     */
    public int getSquaredDistanceTo(Point2D target)
    {
        int deltaX = this.x - target.x;
        int deltaY = this.y - target.y;

        return deltaX*deltaX + deltaY*deltaY;

    }

    public double getDistanceTo(Point2D target)
    {
        return Math.sqrt(this.getSquaredDistanceTo(target));
    }

}
