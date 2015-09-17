import java.math.BigInteger;
import java.util.Scanner;

/**
 * One day Vasya was sitting on a not so interesting Maths lesson and making an
 * origami from a rectangular a mm  ×  b mm sheet of paper (a > b). Usually the
 * first step in making an origami is making a square piece of paper from the
 * rectangular sheet by folding the sheet along the bisector of the right angle,
 * and cutting the excess part.
 * 
 * 
 * After making a paper ship from the square piece, Vasya looked on the
 * remaining (a - b) mm  ×  b mm strip of paper. He got the idea to use this
 * strip of paper in the same way to make an origami, and then use the remainder
 * (if it exists) and so on. At the moment when he is left with a square piece
 * of paper, he will make the last ship from it and stop.
 * 
 * Can you determine how many ships Vasya will make during the lesson?
 * 
 * Input 
 * The first line of the input contains two integers a, b
 * (1 ≤ b < a ≤ 1012) — the sizes of the original sheet of paper.
 * 
 * Output 
 * Print a single integer — the number of ships that Vasya will make.
 * 
 * Sample test(s) 
 * input 
 * 2 1 
 * output 
 * 2 
 * input 
 * 10 7 
 * output 
 * 6 
 * input 
 * 1000000000000 1
 * output 
 * 1000000000000 
 * Note P
 * ictures to the first and second sample test.
 * 
 * @Title: A527PlayingWithPaper.java
 * @author lxh
 * @date Sep 17, 2015 11:06:43 AM
 * 
 */

public class A527PlayingWithPaper {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String str1=cin.next();
		String str2=cin.next();
		BigInteger a=new BigInteger(str1);
		BigInteger b=new BigInteger(str2);
		//System.out.println(a.mod(b).compareTo(new BigInteger("0")));
		BigInteger c=new BigInteger("0");
		while(!b.equals(new BigInteger("0"))){
			c=c.add(a.divide(b));
			BigInteger tmp=a.mod(b);
			a=b;
			b=tmp;
		}
		System.out.println(c.toString());
	}
}
