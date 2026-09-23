Anagram

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 97;
            arr[val]++;
        }

    for (int i = 0; i < str2.length(); i++) {
            int val = str2.charAt(i) - 97;
            arr[val]--;   
        }
        boolean ana = true;
        for(int i = 0 ; i < 26 ; i++){
            if (arr[i] != 0){
                ana = false;
                break;
            }
        }
        if(ana){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}






INPUT 12345-+*/ OUTPUT 1

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int out = str.charAt(0) - '0';
        int len = (str.length() / 2) ;
        for (int i = len +1; i < str.length(); i++) {
            int val = str.charAt(i- len)- '0';
            switch (str.charAt(i)) {
                case '-':
                    out -= val;
                    break;
                case '+':
                    out += val;
                    break;
                case '*':
                    out *= val;
                    break;
                case '/':
                    out /= val;
                    break;
                case '%':
                    out %= val;
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println(out);
        }
        System.out.println(out);
    }
}




