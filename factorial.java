import java.io.*;
import java.util.*;
public class Main {
       public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0 ;
		int fact = 1;
		while (num > 0){
		    for (int i = num%10; i >= 1 ; i-- ){
		        fact = fact * i ;
		    }
		 sum = sum + fact;
		 num = num / 10;
		}
		System.out.println(fact);
	}
}
