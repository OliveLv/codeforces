import java.math.BigInteger;
import java.util.Scanner;

/**
 * n participants of the competition were split into m teams in some manner so
 * that each team has at least one participant. After the competition each pair
 * of participants from the same team became friends.
 * 
 * Your task is to write a program that will find the minimum and the maximum
 * number of pairs of friends that could have formed by the end of the
 * competition.
 * 
 * Input 
 * The only line of input contains two integers n and m, separated by a
 * single space (1 ≤ m ≤ n ≤ 109) — the number of participants and the number of
 * teams respectively.
 * 
 * Output 
 * The only line of the output should contain two integers kmin and kmax
 * — the minimum possible number of pairs of friends and the maximum possible
 * number of pairs of friends respectively.
 * 
 * Sample test(s) 
 * input 
 * 5 1 
 * output 
 * 10 10 
 * input 
 * 3 2 
 * output 
 * 1 1 
 * input 
 * 6 3 
 * output 
 * 3
 * 6 
 * Note 
 * In the first sample all the participants get into one team, so there
 * will be exactly ten pairs of friends.
 * 
 * In the second sample at any possible arrangement one team will always have
 * two participants and the other team will always have one participant. Thus,
 * the number of pairs of friends will always be equal to one.
 * 
 * In the third sample minimum number of newly formed friendships can be
 * achieved if participants were split on teams consisting of 2 people, maximum
 * number can be achieved if participants were split on teams of 1, 1 and 4
 * people.
 * 
 * @Title: B478RandomTeams.java
 * @author lxh
 * @date Oct 22, 2015 7:57:56 AM
 * 
 */

public class B478RandomTeams {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		BigInteger n=new BigInteger(s);
		s=cin.next();
		BigInteger m=new BigInteger(s);
		BigInteger a=n.divide(m);
		BigInteger b=n.mod(m);
		BigInteger min=a.multiply(a.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2)).multiply(m.subtract(b));
		min=min.add(a.multiply(a.add(BigInteger.ONE)).divide(BigInteger.valueOf(2)).multiply(b));
		a=n.subtract(m.subtract(BigInteger.ONE));
		BigInteger max=a.multiply(a.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2));
		System.out.println(min+" "+max);
	}
}
