import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 Theatre Square in the capital city of Berland has a rectangular shape with
 * the size n × m meters. On the occasion of the city's anniversary, a decision
 * was taken to pave the Square with square granite flagstones. Each flagstone
 * is of the size a × a.
 * 
 * What is the least number of flagstones needed to pave the Square? It's
 * allowed to cover the surface larger than the Theatre Square, but the Square
 * has to be covered. It's not allowed to break the flagstones. The sides of
 * flagstones should be parallel to the sides of the Square.
 * 
 * 
 * Input
 * 
 * The input contains three positive integer numbers in the first line: n,  m
 * and a (1 ≤  n, m, a ≤ 109).
 * 
 * 
 * Output
 * 
 * Write the needed number of flagstones.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 6 6 4
 * 
 * 
 * 
 * Output 4
 * 
 * A1TheatreSquare.java
 * 
 * @author olivelv
 * @version time: Aug 6, 2015 8:51:05 AM
 */
public class A1TheatreSquare {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		BigInteger n=new BigInteger(cin.next());
		BigInteger m=new BigInteger(cin.next());
		BigInteger a=new BigInteger(cin.next());
		BigInteger x=n.mod(a).equals(new BigInteger("0"))?n.divide(a):n.divide(a).add(new BigInteger("1"));
		BigInteger y=m.mod(a).equals(new BigInteger("0"))?m.divide(a):m.divide(a).add(new BigInteger("1"));
		
		System.out.println(x.multiply(y));
	}
}
