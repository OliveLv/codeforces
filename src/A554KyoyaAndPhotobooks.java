import java.util.Scanner;

/**
 * Kyoya Ootori is selling photobooks of the Ouran High School Host Club. He has
 * 26 photos, labeled "a" to "z", and he has compiled them into a photo booklet
 * with some photos in some order (possibly with some photos being duplicated).
 * A photo booklet can be described as a string of lowercase letters, consisting
 * of the photos in the booklet in order. He now wants to sell some
 * "special edition" photobooks, each with one extra photo inserted anywhere in
 * the book. He wants to make as many distinct photobooks as possible, so he can
 * make more money. He asks Haruhi, how many distinct photobooks can he make by
 * inserting one extra photo into the photobook he already has?
 * 
 * Please help Haruhi solve this problem.
 * 
 * Input 
 * The first line of input will be a single string s (1 ≤ |s| ≤ 20).
 * String s consists only of lowercase English letters.
 * 
 * Output 
 * Output a single integer equal to the number of distinct photobooks
 * Kyoya Ootori can make.
 * 
 * Sample test(s) 
 * input 
 * a 
 * output 
 * 51 
 * input 
 * hi 
 * output 
 * 76 
 * Note 
 * In the first case,we can make 'ab','ac',...,'az','ba','ca',...,'za', and 'aa', producing a
 * total of 51 distinct photo booklets.
 * 
 * @Title: A554KyoyaAndPhotobooks.java
 * @author lxh
 * @date Oct 28, 2015 8:34:07 AM
 * 
 */

public class A554KyoyaAndPhotobooks {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);	
		String s=cin.next();
		int n=s.length();
		System.out.println(26*(n+1)-n);
	}
}
