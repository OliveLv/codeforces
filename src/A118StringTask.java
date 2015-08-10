import java.util.Scanner;

/**
 * Petya started to attend programming lessons. On the first lesson his task was
 * to write a simple program. The program was supposed to do the following: in
 * the given string, consisting if uppercase and lowercase Latin letters, it:
 * 
 * deletes all the vowels, 
 * inserts a character "." before each consonant,
 * replaces all uppercase consonants with corresponding lowercase ones.
 * Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The
 * program's input is exactly one string, it should return the output as a
 * single string, resulting after the program's processing the initial string.
 * 
 * Help Petya cope with this easy task.
 * 
 * Input 
 * The first line represents input string of Petya's program. This string
 * only consists of uppercase and lowercase Latin letters and its length is from
 * 1 to 100, inclusive.
 * 
 * Output 
 * Print the resulting string. It is guaranteed that this string is not
 * empty. 
 * Sample test(s) 
 * input 
 * tour 
 * output 
 * .t.r 
 * input 
 * Codeforces 
 * output
 * .c.d.f.r.c.s 
 * input 
 * aBAcAba 
 * output 
 * .b.c.b
 * 
 * 
 * 
 * filename:A118StringTask.java
 * 
 * @author olive create on 2015/8/10 21:23
 */
public class A118StringTask {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		int l=s.length();
		s=s.toLowerCase();
		//boolean flag=false;
		for(int i=0;i<l;i++){
			char val=s.charAt(i);
			if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u'||val=='y'){
				//flag=true;
				continue;
			}
			System.out.print("."+val);
		}
		System.out.println();
	}
}
