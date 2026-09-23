import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        int temp;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int n = sc.nextInt();
        int count = 1;
        int current = arr[0];
        if (n == 1) {
            System.out.println("1st largest no : " + arr[0]);
            return;
        }
        for (int i = 1; i < size; i++) {
            if (arr[i] != current) {
                count++;
                current = arr[i];

                if (count == n) {
                    System.out.println(n + "th largest no : " + current);
                    return;
                }
            }
        }
        System.out.println("no "+n+"th largest number.");
    }
}
