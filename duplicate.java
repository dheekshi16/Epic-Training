//Remove Duplicates in Array list

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		Scanner in = new Scanner (System.in);
		int n = in.nextInt(); //6
		for (int i = 0 ; i <n ; i++){
		    li.add(in.nextInt());//10 20 10 10 30 20
		}
		for (int i = 0 ; i < n ;){
		    if (li.contains(li.get(i)) && li.indexOf(li.get(i)) != i){
		        li.remove(i);
		        n--;
		    }
		    else{
		        i++;
		    }
		}
		System.out.println(li);
	}
}
