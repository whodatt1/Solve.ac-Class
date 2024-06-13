/*

FizzBuzz (28702번)

문제
FizzBuzz 문제는 
$i = 1, 2, \cdots$ 에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다.

 
$i$가 
$3$의 배수이면서 
$5$의 배수이면 “FizzBuzz”를 출력합니다.
 
$i$가 
$3$의 배수이지만 
$5$의 배수가 아니면 “Fizz”를 출력합니다.
 
$i$가 
$3$의 배수가 아니지만 
$5$의 배수이면 “Buzz”를 출력합니다.
 
$i$가 
$3$의 배수도 아니고 
$5$의 배수도 아닌 경우 
$i$를 그대로 출력합니다.
FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다. 이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?

입력
FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 한 줄에 하나씩 주어집니다. 각 문자열의 길이는 
$8$ 이하입니다. 입력이 항상 FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열에 대응됨이 보장됩니다.

출력
연속으로 출력된 세 개의 문자열 다음에 올 문자열을 출력하세요. 여러 문자열이 올 수 있는 경우, 아무거나 하나 출력하세요.

예제 입력 1 
Fizz
Buzz
11
예제 출력 1 
Fizz
예제 입력 2 
980803
980804
FizzBuzz
예제 출력 2 
980806
힌트
FizzBuzz 문제의 
$i=1, \cdots, 20$에 대한 출력은 다음과 같습니다.

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[3];

        for (int i = 0; i < 3; i++) {
            String param = br.readLine();

            arr[i] = param;
        }

        int index = 0;
        int value = 0;
        int nextVal = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (!arr[i].equals("Fizz") && !arr[i].equals("Buzz") && !arr[i].equals("FizzBuzz")) {
                index = i;
                value = Integer.parseInt(arr[i]);
                break;
            }
        }

        if (index < 2) {
            nextVal = (value + (2 - index)) + 1;
        } else {
            nextVal = value + 1;
        }

        if (nextVal % 3 == 0 && nextVal % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextVal % 3 == 0 && nextVal % 5 != 0) {
            System.out.println("Fizz");
        } else if (nextVal % 3 != 0 && nextVal % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextVal);
        }
    }

}