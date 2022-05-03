package programmers.level1.키패드누르기;

// https://programmers.co.kr/learn/courses/30/lessons/67256
// https://youtu.be/jFv2LRVCK6s
public class 키패드누르기_개취풀이 {
    /*
     */
    Position left;
    Position right;
    Position numPos; // 숫자의 위치
    //다이얼의 위치를 배열로 관리한다. 4X3의 배열
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 1. 왼손 오른손 위치를 초기화
        left = new Position(3, 0); // 별표 위
        right = new Position(3, 2); // 우물 정 위

        for (int num : numbers) {
            // 2. 숫자를 누를 손가락 정하기
            numPos = new Position((num-1)/3, (num-1) % 3);
            if (num == 0) numPos = new Position(3, 1);

            String finger = numPos.getFinger(hand);

            // 3. 정해진 손가락은 answer에 담고 손가락 위치 이동
            answer += finger;
            if (finger.equals("L")) left = numPos;
            else right = numPos;
        }

        return answer;
    }

    class Position {
        int row;
        int col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String getFinger(String hand) {
            String finger = hand.equals("right") ? "R" : "L";// 본인의 주손을 넣어두기

            if (this.col == 0) finger = "L"; // 왼쪽 다이얼이면 왼손
            else if(this.col == 2) finger = "R"; // 오른쪽 다이얼이면 오른손
            else {
                // 왼손과 오른손의 거리를 찾는다.
                int leftDist = left.getDistance(this);
                int rightDist = right.getDistance(this);

                // 둘이 같을 때는 위에서 할당한 주손가락을 사용하게 된다.
                if (leftDist < rightDist) {
                    finger = "L";
                } else if(rightDist < leftDist) {
                    finger = "R";
                }

            }
            return finger;
         }
         public int getDistance(Position p) {
             return Math.abs(this.row - p.row) + Math.abs(this.col - p.col);
         }
    }

    public static void main(String[] args) {
        키패드누르기_개취풀이 T = new 키패드누르기_개취풀이();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(T.solution(numbers, hand)); // LRLLLRLLRRL
    }
}
