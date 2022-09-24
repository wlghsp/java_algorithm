package real_tests.line_plus_220924;



import java.util.HashMap;

class Array {
    public int size;
    public int numOfElle;
    public int space;
    Array(int size, int numOfElle) {
        this.size = size;
        this.numOfElle = numOfElle;
        this.space = size - numOfElle;
    }
}

public class Number1 {
    public int solution(int[][] queries) {
        int cnt = 0;
        HashMap<Integer, Array> map = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {
            int arrNum = queries[i][0];
            int numOfEle = queries[i][1];

            if (!map.containsKey(arrNum)) {
                map.put(arrNum, new Array((int) getNewArrSize(numOfEle), numOfEle));
            } else{
                Array array = map.get(arrNum);
                if (numOfEle > array.space) {
                    double newArrSize = getNewArrSize(numOfEle + array.numOfElle);
                    map.put(arrNum, new Array((int) newArrSize, numOfEle + array.numOfElle));
                    cnt += array.numOfElle;
                } else {
                    map.put(arrNum, new Array(array.size, numOfEle + array.numOfElle));
                }
            }
        }


        return cnt;
    }

    public double getNewArrSize(int noe) {
        double i = 0;
        double result = 0;
        while(true) {
            result = Math.pow(2, i);
            if (result >= noe) {
                break;
            }
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        Number1 T = new Number1();

        int[][] queries1 = {
                {2, 10},
                {7, 1},
                {2, 5},
                {2, 9},
                {7, 32}};

        int[][] queries2 = {
                {1, 1},
                {1, 2},
                {1, 4},
                {1, 8}};

        System.out.println(T.solution(queries1));  // 16
        System.out.println(T.solution(queries2));  // 11
    }
}
