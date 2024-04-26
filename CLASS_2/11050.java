/*
    
이항계수 (11050번)

문제
자연수 
\(N\)과 정수 
\(K\)가 주어졌을 때 이항 계수 
\(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 
\(N\)과 
\(K\)가 주어진다. (1 ≤ 
\(N\) ≤ 10, 0 ≤ 
\(K\) ≤ 
\(N\))

출력
 
\(\binom{N}{K}\)를 출력한다.

예제 입력 1 
5 2
예제 출력 1 
10

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];

        System.out.println(pascal(N, K));
    }

    private static int pascal(int N, int K) {

        if (dp[N][K] > 0) {
            return dp[N][K];
        }

        if (N == K || K == 0) {
            return dp[N][K] = 1;
        }

        return dp[N][K] = pascal(N - 1, K - 1) + pascal(N - 1, K);
    }
}