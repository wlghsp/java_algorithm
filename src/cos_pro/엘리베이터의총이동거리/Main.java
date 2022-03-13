package cos_pro.엘리베이터의총이동거리;

public class Main {

    
    public int solution(int[] floors) {
        int dist =0;
        int length = floors.length;
        for (int i = 1; i < length; i++) {
            if (floors[i] > floors[i-1]) {
                dist += floors[i] - floors[i-1];
            } else {
                dist += floors[i - 1] - floors[i];
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Main sol = new Main();

        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        System.out.println("ret = " + ret);
    }
}
