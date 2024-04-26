/*
    
수 정렬하기 3 (10989번)

문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1 
10
5
2
3
1
4
2
3
5
1
7
예제 출력 1 
1
1
2
2
3
3
4
5
5
7

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }

    private static void quickSort(int[] arr, int low, int hi) {

        if (low >= hi) {
            return;
        }

        int pivot = partition(arr, low, hi);

        quickSort(arr, low, pivot);
        quickSort(arr, pivot + 1, hi);
    }

    private static int partition(int[] arr, int low, int hi) {
        int l = low - 1;
        int r = hi + 1;
        int pivot = arr[(low + hi)/2];
        
        while(true) {
            do {
                l++;
            } while(arr[l] < pivot);
    
            do {
                r--;
            } while(arr[r] > pivot && l <= r);
    
            if (l >= r) {
                return r;
            }

            swap(arr, l, r);
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

}
