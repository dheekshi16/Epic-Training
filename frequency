count the frequency of every number 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}
 
                                                                  0R

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j != i) {
                continue;
            }
            int count = 1;
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}
