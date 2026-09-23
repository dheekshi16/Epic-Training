1. Sum of two matrices
   Sample Input: A = [[1,2],[3,4]], B = [[5,6],[7,8]]
   Sample Output: [[6,8],[10,12]]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int r = in.nextInt();
	    int c = in.nextInt();
		int[][] arr = new int[r][c];
        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println();
        int[][] arr1 = new int[r][c];
        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++){
                arr1[i][j] = in.nextInt();
            }
        }
		for (int i = 0; i < r;i++){
		    System.out.println();
		    for(int j = 0 ; j < c; j++){
		        arr[i][j] = arr[i][j]+ arr1[i][j];
		        System.out.print(arr[i][j]+" ");
		    }
		}
	}
}
