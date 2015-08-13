import java.util.Scanner;

/**
 * Capitalization is writing a word with its first letter as a capital letter.
 * Your task is to capitalize the given word.
 * 
 * Note, that during capitalization all the letters except the first one remains
 * unchanged.
 * 
 * Input 
 * A single line contains a non-empty word. This word consists of
 * lowercase and uppercase English letters. The length of the word will not
 * exceed 103.
 * 
 * Output 
 * Output the given word after capitalization.
 * 
 * Sample test(s) 
 * input 
 * ApPLe 
 * output 
 * ApPLe 
 * input 
 * konjac 
 * output 
 * Konjac
 * 
 * @Title: A281WordCapitalization.java
 * @author olive
 * @date Aug 13, 2015 10:41:21 AM
 * 
 */

public class A281WordCapitalization {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str=cin.next();
		if(str.length()==0){
			System.out.println(str);
			return ;
		}
		char fst=str.charAt(0);
		if(fst>='A'&&fst<='Z')System.out.println(str);
		else{
			fst=(char)(fst-32);
			str=fst+str.substring(1);
			System.out.println(str);
		}
	}
}
