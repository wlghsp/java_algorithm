package ryuhoseok.parametric_search.boj2805_나무자르기;
/*
     N 나무의 갯수
     M 필요한 나무의 길이
     1<= N <= 100만
     1<= M <= 20억
     0 <= 각 나무 높이 <= 10억
     1. 정답의 범위 : 0~10억
     2. 잘린 나무의 길이 합 <= 나무높이의 총합 = 100만 * 10억 = 10^15 즉, 계산 과정 중의 변수 타입은 long으로!

      원래 문제: 원하는 길이 M 만큼을 얻을 수 있는 최대 높이는 얼마인가?

      → 뒤집은 문제: 어떤 높이(H)로 잘랐을 때, 원하는 길이 M만큼을 얻을 수 있는가? Yes/No

      M미터를 가져갈 수 있는 높이의 최댓값

      <핵심>
      1. 정답을 "매개 변수(Parameter)"로 만들고 Yes/No문제(결정문)로 바꿔보기
      2. 모든 값에 대해서 Yes/No를 채웠다고 생각했을 때, 정렬된 상태인가?
      3. Yes/No 결정하는 문제를 풀기

      원래 문제: 뒤집은 문제를 모든 H마다 (0~20억) 해보면 마지막 Yes가 정답
      시간복잡도 : O(뒤집은 문제 * log 20억) = O(N*logX) = N * 31

      1. H를 정해서 결정 문제 한 번 풀기 => O(N)
      2. 정답의 범위를 이분탐색하면서 풀기
       => O(logX)번 반복할 것
       3. 총 시간 복잡도: O(NlogX)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    }
}
