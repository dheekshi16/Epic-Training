Longest subarray

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n ; i++){
            for (int j = i ; j < n ; j++){
                int sum = 0;
                int l = 0;
                for (int k = i ; k <= j; k++){
                    sum += arr[k];
                }
                if(sum == target){
                    int len = j -i +1;
                    if (len > c){
                        c=len;
                    }
                    for(int k = i ; k <= j ; k++){
                        System.out.print(arr[k]);
                        if (k < j) {
                            System.out.print(",");
                        }
                    }
                }
            }
            System.out.println();
        }
        System.out.println("count : "+c);
    }
}
