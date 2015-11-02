import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You have a new professor of graph theory and he speaks very quickly. You come
 * up with the following plan to keep up with his lecture and make notes.
 * 
 * You know two languages, and the professor is giving the lecture in the first
 * one. The words in both languages consist of lowercase English characters,
 * each language consists of several words. For each language, all words are
 * distinct, i.e. they are spelled differently. Moreover, the words of these
 * languages have a one-to-one correspondence, that is, for each word in each
 * language, there exists exactly one word in the other language having has the
 * same meaning.
 * 
 * You can write down every word the professor says in either the first language
 * or the second language. Of course, during the lecture you write down each
 * word in the language in which the word is shorter. In case of equal lengths
 * of the corresponding words you prefer the word of the first language.
 * 
 * You are given the text of the lecture the professor is going to read. Find
 * out how the lecture will be recorded in your notes.
 * 
 * Input 
 * The first line contains two integers, n and m (1 ≤ n ≤ 3000,
 * 1 ≤ m ≤ 3000) — the number of words in the professor's lecture and the number
 * of words in each of these languages.
 * 
 * The following m lines contain the words. The i-th line contains two strings
 * ai, bi meaning that the word ai belongs to the first language, the word bi
 * belongs to the second language, and these two words have the same meaning. It
 * is guaranteed that no word occurs in both languages, and each word occurs in
 * its language exactly once.
 * 
 * The next line contains n space-separated strings c1, c2, ..., cn — the text
 * of the lecture. It is guaranteed that each of the strings ci belongs to the
 * set of strings {a1, a2, ... am}.
 * 
 * All the strings in the input are non-empty, each consisting of no more than
 * 10 lowercase English letters.
 * 
 * Output 
 * Output exactly n words: how you will record the lecture in your
 * notebook. Output the words of the lecture in the same order as in the input.
 * 
 * Sample test(s) 
 * input 
 * 4 3 
 * codeforces codesecrof 
 * contest round 
 * letter message
 * codeforces contest letter contest 
 * output 
 * codeforces round letter round 
 * input
 * 5 3 
 * joll wuqrd 
 * euzf un 
 * hbnyiyc rsoqqveh 
 * hbnyiyc joll joll euzf joll 
 * output
 * hbnyiyc joll joll un joll
 * 
 * @Title: B499Lecture.java
 * @author lxh
 * @date Nov 2, 2015 7:54:34 AM
 * 
 */

public class B499Lecture {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		Map<String,String>map=new HashMap<String,String>();
		for(int i=0;i<m;i++){
			String a=cin.next();
			String b=cin.next();
			if(a.length()>b.length())map.put(a, b);
			else
				map.put(a, a);
		}
		String []s=new String[n];
		for(int i=0;i<n;i++){
			s[i]=cin.next();
			
		}
		for(int i=0;i<n;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(map.get(s[i]));
			
		}
		System.out.println();
	}
}
