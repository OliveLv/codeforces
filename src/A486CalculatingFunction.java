import java.math.BigInteger;
import java.util.Scanner;

/**
 * For a positive integer n let's define a function f:
 * 
 * f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn
 * 
 * Your task is to calculate f(n) for a given integer n.
 * 
 * Input 
 * The single line contains the positive integer n (1 ≤ n ≤ 1015).
 * 
 * Output 
 * Print f(n) in a single line.
 * 
 * Sample test(s) 
 * input 
 * 4 
 * output 
 * 2 
 * input 
 * 5 
 * output 
 * -3 
 * Note
 * f(4) =  - 1 + 2 - 3 + 4 = 2
 * 
 * f(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3
 * 
 * @Title: A486CalculatingFunction.java
 * @author lxh
 * @date Aug 18, 2015 11:19:43 AM
 * 
 */

public class A486CalculatingFunction {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String str=cin.next();
		BigInteger n=new BigInteger(str);
		BigInteger a=n.divide(new BigInteger("2"));
		if(!n.mod(new BigInteger("2")).equals(new BigInteger("0")))a=a.add(n.negate());
		System.out.println(a.toString());
	}
}
