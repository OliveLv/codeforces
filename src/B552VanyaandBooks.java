import java.math.BigInteger;
import java.util.Scanner;

/**
 * Vanya got an important task — he should enumerate books in the library and
 * label each book with its number. Each of the n books should be assigned with
 * a number from 1 to n. Naturally, distinct books should be assigned distinct
 * numbers.
 * 
 * Vanya wants to know how many digits he will have to write down as he labels
 * the books.
 * 
 * Input 
 * The first line contains integer n (1 ≤ n ≤ 109) — the number of books
 * in the library.
 * 
 * Output 
 * Print the number of digits needed to number all the books.
 * 
 * Sample test(s) 
 * input 
 * 13 
 * output 
 * 17 
 * input 
 * 4 
 * output 
 * 4 
 * Note 
 * Note to the first test. The books get numbers 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, which
 * totals to 17 digits.
 * 
 * Note to the second sample. The books get numbers 1, 2, 3, 4, which totals to
 * 4 digits.
 * 
 * @Title: B552VanyaandBooks.java
 * @author lxh
 * @date Oct 19, 2015 7:35:41 AM
 * 
 */

public class B552VanyaandBooks {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int l=Integer.toString(n).length();
		//int s=0,base=1;
		int base=1;
		BigInteger res=new BigInteger(Integer.toString(0));
		for(int i=1;i<l;i++,base*=10){
			//s+=base*9*i;
			BigInteger tmp=new BigInteger(Integer.toString(9*i));
			res=res.add(tmp.multiply(new BigInteger(Integer.toString(base)) ));
		}
		
		BigInteger tmp=new BigInteger(Integer.toString(n-base+1));
		res=res.add(tmp.multiply(new BigInteger(Integer.toString(l))));
		//s+=l*(n-base+1);
		System.out.println(res.toString());
		
		
	}
}
