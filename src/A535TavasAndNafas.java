import java.util.Scanner;

/**
 * Today Tavas got his test result as an integer score and he wants to share it
 * with his girlfriend, Nafas.
 * 
 * His phone operating system is Tavdroid, and its keyboard doesn't have any
 * digits! He wants to share his score with Nafas via text, so he has no choice
 * but to send this number using words.
 * 
 * 
 * He ate coffee mix without water again, so right now he's really messed up and
 * can't think.
 * 
 * Your task is to help him by telling him what to type.
 * 
 * Input 
 * The first and only line of input contains an integer s (0 ≤ s ≤ 99),
 * Tavas's score.
 * 
 * Output 
 * In the first and only line of output, print a single string consisting
 * only from English lowercase letters and hyphens ('-'). Do not use spaces.
 * 
 * Sample test(s) 
 * input 
 * 6 
 * output 
 * six 
 * input 
 * 99 
 * output 
 * ninety-nine 
 * input 
 * 20 
 * output
 * twenty 
 * Note 
 * You can find all you need to know about English numerals in
 * http://en.wikipedia.org/wiki/English_numerals .
 * 
 * @Title: A535TavasAndNafas.java
 * @author lxh
 * @date Oct 14, 2015 7:53:46 AM
 * 
 */

public class A535TavasAndNafas {
	public static void  main(String []args){
		Scanner cin=new Scanner(System.in);
		String []digits={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		String []decimal={"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		int s=cin.nextInt();
		if(s<=20)System.out.println(digits[s]);
		else{
			if(s%10==0)System.out.println(decimal[s/10]);
			else
				System.out.println(decimal[s/10]+"-"+digits[s%10]);
		}
	}
}
