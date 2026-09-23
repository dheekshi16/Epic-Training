Rearrange Alphanumeric String 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> num = new ArrayList<>();
        List<Character> alp = new ArrayList<>();
        int lc = 0;
        int dc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                //Character.isDigit(str.charAt(i) or ch)
                num.add(ch);
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                //Character.isLetter(str.charAt(i) or ch)
                alp.add(ch);
            }
        }
        Collections.sort(num);
        Collections.reverse(alp);
        String emp = "";
        int dI = 0; 
        int lI = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                emp += num.get(dI++);
            }
            else if (Character.isLetter(ch)){
                emp+= alp.get(lI++);
            }
            else
                emp+=ch;
        }
        System.out.println(emp);
    }
}
