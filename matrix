import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int r1 = in.nextInt();
	    int c1 = in.nextInt();
		int[][] arr = new int[r1][c1];
        for (int i = 0 ; i < r1 ; i++) {
            for(int j = 0 ; j < c1 ; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        System.out.println();
        int[][] arr1 = new int[r2][c2];
        for (int i = 0 ; i < r2 ; i++) {
            for(int j = 0 ; j < c2 ; j++){
                arr1[i][j] = in.nextInt();
            }
        }
        if (c1 == r2 ){
        int[][] result = new int[r1][c2];
		for (int i = 0; i < r1;i++){
		    for(int j = 0 ; j < c2; j++){
		        for (int k = 0 ; k < c1 ; k++){
		            result[i][j] += arr[i][k] * arr1[k][j];
		        }
		    }
		}
		for (int i = 0 ; i < r1 ; i++) {
            for(int j = 0 ; j < c2 ; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
	}
	else{
	    System.out.println("Matrix multiplication not possible");
	}
	}
}
