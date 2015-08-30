import java.util.Scanner;

/**
 * Ann has recently started commuting by subway. We know that a one ride subway
 * ticket costs a rubles. Besides, Ann found out that she can buy a special
 * ticket for m rides (she can buy it several times). It costs b rubles. Ann did
 * the math; she will need to use subway n times. Help Ann, tell her what is the
 * minimum sum of money she will have to spend to make n rides?
 * 
 * Input 
 * The single line contains four space-separated integers n, m, a, b
 * (1 ≤ n, m, a, b ≤ 1000) — the number of rides Ann has planned, the number of
 * rides covered by the m ride ticket, the price of a one ride ticket and the
 * price of an m ride ticket.
 * 
 * Output 
 * Print a single integer — the minimum sum in rubles that Ann will need
 * to spend.
 * 
 * Sample test(s) 
 * input 
 * 6 2 1 2 
 * output 
 * 6 
 * input 
 * 5 2 2 3 
 * output 
 * 8 
 * Note 
 * In the first sample one of the optimal solutions is: each time buy a one ride
 * ticket. There are other optimal solutions. For example, buy three m ride
 * tickets
 * 
 * @Title: A466CheapTravel.java
 * @author lxh
 * @date Aug 30, 2015 6:36:35 PM
 * 
 */

public class A466CheapTravel {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		int a=cin.nextInt();
		int b=cin.nextInt();
		int s=0;
		if(n%m==0){
			int s1=n/m*b;
			int s2=n*a;
			s=Math.min(s1, s2);
		}else{
			int s1=n/m*b+(n%m)*a;
			int s2=n*a;
			int s3=(n/m+1)*b;
			s=Math.min(s1, Math.min(s2, s3));
		}

		System.out.println(s);
	}
}
