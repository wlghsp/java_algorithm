package codesignal;
/*
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1.
An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side.
You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.


Example

    For n = 2, the output should be
    solution(n) = 5;
    For n = 3, the output should be
    solution(n) = 13.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer n

    Guaranteed constraints:
    1 ≤ n < 104.

    [output] integer

    The area of the n-interesting polygon.


 */


public class ShapeArea {

    static int solution(int n) {
        // 가운데층을 포함한 윗부분과 아래부분으로 나누어 갯수를 더함.
        return (int) (Math.pow(n, 2) + Math.pow(n-1, 2));
    }


    public static void main(String[] args) {
        System.out.println(solution(2)); // 5
        System.out.println(solution(3)); // 13

    }
}
