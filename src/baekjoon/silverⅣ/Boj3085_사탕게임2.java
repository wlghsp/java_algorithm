package baekjoon.silverⅣ;

import java.util.Scanner;

/*
최대보드의 크기가 50*50 이고 한 줄 점검시 경우의 수가 50*49, 50줄을 점검해도 50*50*49 이다.

완전탐색으로 풀었다.

1. 사탕 자리를 바꿔서 최대 개수를 구한 후에는 사탕 자리를 원래대로 되돌려 놓는다.

*/


public class Boj3085_사탕게임2 {
	
        static int n;
        static char c[][];
        static int max;
        
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            n = sc.nextInt();
            c = new char[n][n];
            
            for(int i=0;i<n;i++){
                c[i] = sc.next().toCharArray();
            }
            
            max = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    char tmp = c[i][j];
                    c[i][j] = c[i][j+1];
                    c[i][j+1] = tmp;
                    
                    arrayCheck();
                    
                    tmp = c[i][j];
                    c[i][j] = c[i][j+1];
                    c[i][j+1] = tmp;
                }
            }
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    char tmp = c[j][i];
                    c[j][i] = c[j+1][i];
                    c[j+1][i] = tmp;
                    
                    arrayCheck();
                    
                    tmp = c[j][i];
                    c[j][i] = c[j+1][i];
                    c[j+1][i] = tmp;
                }
            }
            
            System.out.println(max);
        }
        
        public static void arrayCheck() {
            
            for(int k=0; k<n; k++){
                int cnt = 1;
                for(int l=0; l<n-1; l++){
                    if(c[k][l] == c[k][l+1])
                        cnt++;
                    else cnt=1;
                    if(max < cnt)
                        max = cnt;
                }
            }
            
            for(int k=0; k<n; k++){
                int cnt = 1;
                for(int l=0; l<n-1; l++){
                    if(c[l][k] == c[l+1][k])
                        cnt++;
                    else cnt=1;
                    if(max < cnt)
                        max = cnt;
                }
            }
        }
    }
