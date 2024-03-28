/*
    
개 (10172번)

문제
아래 예제와 같이 개를 출력하시오.

입력
없음.

출력
개를 출력한다.

예제 입력 1 
예제 출력 1 
|\_/|
|q p|   /}
( 0 )"""\
|"^"`    |
||_/=\\__|

*/

public class Main {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        sb.append("|\\_/|").append("\n")
          .append("|q p|   /}").append("\n")
          .append("( 0 )\"\"\"\\").append("\n")
          .append("|\"^\"`    |").append("\n")
          .append("||_/=\\\\__|");

        System.out.println(sb);
    }
}
