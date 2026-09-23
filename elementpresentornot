3. Check whether element is present
    Sample Input: [1, 4, 7], Search: 4
   Sample Output: Present

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int target = sc.nextInt();
        for (int i=0 ; i < size ; i++ ){
            arr[i]=sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.print("Present");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid");
        }
	    
    }
}
