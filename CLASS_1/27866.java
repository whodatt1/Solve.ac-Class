/*
    
문자와 문자열 (27866번)

문제
단어 
$S$와 정수 
$i$가 주어졌을 때, 
$S$의 
$i$번째 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 
$S$가 주어진다. 단어의 길이는 최대 
$1\,000$이다.

둘째 줄에 정수 
$i$가 주어진다. (
$1 \le i \le \left|S\right|$)

출력
 
$S$의 
$i$번째 글자를 출력한다.

예제 입력 1 
Sprout
3
예제 출력 1 
r
예제 입력 2 
shiftpsh
6
예제 출력 2 
p
예제 입력 3 
Baekjoon
4
예제 출력 3 
k

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i - 1));
    }
}
