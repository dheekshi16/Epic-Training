Reverse
import java.util.Scanner;
public class Main
{
    static String reverseString(String str){
        //write the code here
       String rev = "";
       for (int i = str.length() - 1; i >= 0; i--){
           rev = rev + str.charAt(i);
        }
        return rev;
        
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(Main.reverseString(str));
	}
}













Distinct 

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            val = val - 97;
            arr[val]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            val = val - 97;
            if (arr[val] == 1) {
                System.out.println(str.charAt(i) + " - " + arr[val]);
                arr[val] = 0;
            }
        }
    }
}











Duplicate

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            val = val - 97;
            arr[val]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int val = str.cha>t(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            val = val - 97;
            if (arr[val] > 1) {
                System.out.println(str.charAt(i) + " - " + arr[val]);
                arr[val] = 0;
            }
        }
    }
}






String-num-Length

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String word = "";
        for (int i =0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            int c = 0;
            if (ch < '0' || ch > '9'){
                word +=ch;
            }else{
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    c = c * 10 +(str.charAt(i) - '0');
                    i++;
                }
                for (int j = 0 ; j < c ; j++){
                    System.out.print(word);
                }
                word = "";
                i--;
            }
        }
    }
}











String Pattern print 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        for (int i = 0; i < n ; i++){
            for (int j = i ; j < n ; j++){
                System.out.print("");
                for (int k = i ; k <= j; k++){
                    System.out.print(str.charAt(k));
                    if (k < j) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }
            System.out.println();
        }
    }
}
