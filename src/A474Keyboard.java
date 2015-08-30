import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Our good friend Mole is trying to code a big message. He is typing on an
 * unusual keyboard with characters arranged in following way:
 * 
 * 
 * qwertyuiop asdfghjkl; zxcvbnm,./ Unfortunately Mole is blind, so sometimes it
 * is problem for him to put his hands accurately. He accidentally moved both
 * his hands with one position to the left or to the right. That means that now
 * he presses not a button he wants, but one neighboring button (left or right,
 * as specified in input).
 * 
 * We have a sequence of characters he has typed and we want to find the
 * original message.
 * 
 * Input 
 * First line of the input contains one letter describing direction of
 * shifting ('L' or 'R' respectively for left or right).
 * 
 * Second line contains a sequence of characters written by Mole. The size of
 * this sequence will be no more than 100. Sequence contains only symbols that
 * appear on Mole's keyboard. It doesn't contain spaces as there is no space on
 * Mole's keyboard.
 * 
 * It is guaranteed that even though Mole hands are moved, he is still pressing
 * buttons on keyboard and not hitting outside it.
 * 
 * Output 
 * Print a line that contains the original message.
 * 
 * Sample test(s) 
 * input 
 * R 
 * s;;upimrrfod;pbr 
 * output 
 * allyouneedislove
 * 
 * @Title: A474Keyboard.java
 * @author lxh
 * @date Aug 30, 2015 6:57:03 PM
 * 
 */

public class A474Keyboard {
	public static void main(String []args){
		String s="qwertyuiop asdfghjkl; zxcvbnm,./";
		Map<String,String>lmap=new HashMap<String,String>();
		Map<String,String>rmap=new HashMap<String,String>();
		for(int i=0;i<s.length();i++){
			String val=String.valueOf(s.charAt(i));
			String l="";
			String r="";
			if(i==0){
				r=String.valueOf(s.charAt(i+1));
				rmap.put(val, r);
			}else if(i==s.length()-1){
				l=String.valueOf(s.charAt(i-1));
				lmap.put(val, l);
			}else{
				r=String.valueOf(s.charAt(i+1));
				rmap.put(val, r);
				l=String.valueOf(s.charAt(i-1));
				lmap.put(val, l);
			}
		}
		Scanner cin=new Scanner(System.in);
		String op=cin.next();
		String str=cin.next();
		if(op.equals("L")){
			for(int i=0;i<str.length();i++)
				System.out.print(rmap.get(String.valueOf(str.charAt(i))));
		}else{
			for(int i=0;i<str.length();i++)
				System.out.print(lmap.get(String.valueOf(str.charAt(i))));
		}
		System.out.println();
		
	}
}
