import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Recently, Anton has found a set. The set consists of small English letters.
 * Anton carefully wrote out all the letters from the set in one line, separated
 * by a comma. He also added an opening curved bracket at the beginning of the
 * line and a closing curved bracket at the end of the line.
 * 
 * Unfortunately, from time to time Anton would forget writing some letter and
 * write it again. He asks you to count the total number of distinct letters in
 * his set.
 * 
 * Input 
 * The first and the single line contains the set of letters. The length
 * of the line doesn't exceed 1000. It is guaranteed that the line starts from
 * an opening curved bracket and ends with a closing curved bracket. Between
 * them, small English letters are listed, separated by a comma. Each comma is
 * followed by a space.
 * 
 * Output 
 * Print a single number ¡ª the number of distinct letters in Anton's set.
 * 
 * Sample test(s) 
 * input 
 * {a, b, c} 
 * output 
 * 3 
 * input 
 * {b, a, b, a} 
 * output 
 * 2 
 * input 
 * {}
 * output 
 * 0
 * 
 * @Title: A443AntonAndLetters.java
 * @author lxh
 * @date Aug 26, 2015 10:00:51 AM
 * 
 */

public class A443AntonAndLetters {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String str=cin.nextLine();
		Set<String>set=new HashSet<String>();
		int n=str.length();
		if(n==2){
			System.out.println("0");
			return ;
		}
		String s="";
		for(int i=1;i<n;i++){
			char val=str.charAt(i);
			if(val==','||val=='}'){
				set.add(s);
				s="";
				i++;
			}else{
				s+=String.valueOf(val);
			}
		}
		System.out.println(set.size());
	}
}
