/*
    
단어정렬 (1181번)

문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
단, 중복된 단어는 하나만 남기고 제거해야 한다.

입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다.

예제 입력 1 
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
예제 출력 1 
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();        

        int N = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(br.readLine());
        }

        // 자바 배열 형식으로 받아 Array.sort(arr, new Comparator<String>() {}) 로도 가능
        arr.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int res = o1.length() - o2.length();

                if (res == 0) {
                    res = o1.compareTo(o2);
                }

                return res;
            }
            
        });

        sb.append(arr.get(0)).append("\n");

        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                sb.append(arr.get(i)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
