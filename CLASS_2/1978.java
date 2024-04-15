/*
    
소수 찾기 (1978번)

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 1 
4
1 3 5 7
예제 출력 1 
3

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] notDecimal = new boolean[1001];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        notDecimal[0] = true;
        notDecimal[1] = true;
        decimal();

        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (!notDecimal[tmp]) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static void decimal() {
        for (int i = 2; i < Math.sqrt(notDecimal.length - 1); i++) {
            for (int j = i * i; j < notDecimal.length; j=j+i) {
                if (notDecimal[j]) {
                    continue;
                }

                notDecimal[j] = true;
            }
        }
    }
}


