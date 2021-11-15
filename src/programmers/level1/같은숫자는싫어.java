package programmers.level1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

    arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
    arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.

배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
제한사항

    배열 arr의 크기 : 1,000,000 이하의 자연수
    배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

입출력 예
arr 	              answer
[1,1,3,3,0,1,1] 	 [1,3,0,1]
[4,4,4,3,3] 	        [4,3]


*/
public class 같은숫자는싫어 {
    /*
    {1,1,3,3,0,1,1}의 배열이 있을 때, 인덱스 0번째 항을 기준으로 그 다음(1) 요소와 비교하여 같으면 아무 처리도 하지 않고 continue,
    다르면 임시 ArrayList에 담았다. 마지막 검사가 뒤에서 두번째 1에서 마지막 1과의 검사로 끝나게 된다. 
    여기서 마지막 1은 다음행이 없기 때문에 이전 요소와의 값이 같아도 넣어주어야 하고, 달라도 넣어주어야 한다. 
    */
    public static int[] solution1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) { // 같은 숫자가 나온 경우이고, 마지막 i일때만 list에 넣어줌 
                if (i == arr.length - 2) list.add(arr[i]);  // 마지막 i라면
                continue; // 마지막  i가 아니면 continue
            } else {
                list.add(arr[i]);
                if (i == arr.length - 2) list.add(arr[i+1]); // 마지막 i라면
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }

    // 다른 사람 풀이. 이렇게 풀고 싶다. 
    public static int[] solution2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) if (arr[i] != arr[i-1]) list.add(arr[i]);// 앞 인덱스와 다른 값은 다 넣어줌 
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
     }

     // 다른 사람 풀이 베스트 1 
     public static int[] solution3(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int preNum = 10;
        for (int num : arr) {
            if (preNum != num) list.add(num);
            preNum = num;
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
     }



    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution1(arr));
    }
}
