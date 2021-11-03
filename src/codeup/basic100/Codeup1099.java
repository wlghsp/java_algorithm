package codeup.basic100;


/*
1099 : [기초-2차원배열] 성실한 개미

영일이는 생명과학에 관심이 생겨 왕개미를 연구하고 있었다.
왕개미를 유심히 살펴보던 중 특별히 성실해 보이는 개미가 있었는데,
그 개미는 개미굴에서 나와 먹이까지 가장 빠른 길로 이동하는 것이었다.

개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
(오른쪽에 길이 나타나면 다시 오른쪽으로 움직인다.)

이에 호기심이 생긴 영일이는 그 개미를 미로 상자에 넣고 살펴보기 시작하였다.

미로 상자에 넣은 개미는 먹이를 찾았거나, 더 이상 움직일 수 없을 때까지
오른쪽 또는 아래쪽으로만 움직였다.

미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.

단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우에는
더이상 이동하지 않고 그 곳에 머무른다고 가정한다.


미로 상자의 테두리는 모두 벽으로 되어 있으며,
개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.



입력
10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다. 

출력
성실한 개미가 이동한 경로를 9로 표시해 출력한다.

1 1 1 1 1 1 1 1 1 1
1 0 0 1 0 0 0 0 0 1
1 0 0 1 1 1 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 1 0 1 0 1
1 0 0 0 0 1 2 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1
1 9 9 1 0 0 0 0 0 1
1 0 9 1 1 1 0 0 0 1
1 0 9 9 9 9 9 1 0 1
1 0 0 0 0 0 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1
*/
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1099 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] arr = new int[11][11];
    int x =2;
    int y =2;
    StringTokenizer st;
    for (int i = 1; i < arr.length; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j < arr.length; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // 개미 출발위치는 (2,2)
    // 미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고, 먹이는 2이다.
    // 개미의 이동경로는 9로 바꾼다. 
    // 1. for문 풀이
    // loop1:for (int i = x; i < arr.length; i++) {
    //   loop2:for (int j = y; j < arr.length; j++) {
    //     if (arr[i][j] == 0) {// 갈 수 있음 
    //       arr[i][j] = 9;
    //     } else if (arr[i][j]==1) { // 장애물
    //       x++;
    //       y = j-1;
    //       break loop2; // j열 변화는 오른쪽 이동인데 안쪽 for문 탈출로 오른쪽 이동 중단
    //     } else if (arr[i][j] ==2) { // 먹이
    //       arr[i][j] = 9;
    //       break loop1; // 바깥쪽 for문 탈출로 반복 중단
    //     }
    //   }
    // }

    // 2. while문 풀이
    while (true) {
      if (arr[x][y]==2) {
        arr[x][y] = 9;
        break;
      }
      // 오른쪽에 장애물 여부 파악, 이동 진행 
      // 오른쪽에 벽이 존재하여 이동 불가능
      if (arr[x][y+1] ==1) {  
        if (arr[x+1][y] == 1) break;
        else x++;
      }
      else if (arr[x][y+1] != 1) y++; // 이동 가능한 경우는 오른쪽 이동  
      
      // 위의 이동 후 다시 한번 먹이 여부 파악, 위에서 오른쪽 아래쪽 확인후 이동하였기에 2인지만 확인하면 됨. 
      if (arr[x][y]==2) { // 먹이 찾았다. 
        arr[x][y] = 9;  // 9로 해놓고 
        break;          // 반복문 종료 
      }

      arr[x][y] = 9; //  2가 아닌 경우 0이므로 9로 해놓음  

    }
    arr[2][2] = 9; // 최초 시작한 자리도 9로 해놓기



    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {
        sb.append(arr[i][j]).append(" ");
      }
      sb.append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
