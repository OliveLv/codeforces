import java.util.Scanner;

/**
 * 
 Xenia lives in a city that has n houses built along the main ringroad. The
 * ringroad houses are numbered 1 through n in the clockwise order. The ringroad
 * traffic is one way and also is clockwise.
 * 
 * Xenia has recently moved into the ringroad house number 1. As a result, she's
 * got m things to do. In order to complete the i-th task, she needs to be in
 * the house number ai and complete all tasks with numbers less than i.
 * Initially, Xenia is in the house number 1, find the minimum time she needs to
 * complete all her tasks if moving from a house to a neighboring one along the
 * ringroad takes one unit of time.
 * 
 * 
 * Input
 * 
 * The first line contains two integers n and m (2 ≤ n ≤ 105, 1 ≤ m ≤ 105). The
 * second line contains m integers a1, a2, ..., am (1 ≤ ai ≤ n). Note that Xenia
 * can have multiple consecutive tasks in one house.
 * 
 * 
 * Output
 * 
 * Print a single integer — the time Xenia needs to complete all tasks.
 * 
 * Please, do not use the %lld specifier to read or write 64-bit integers in
 * С++. It is preferred to use the cin, cout streams or the %I64d specifier.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 
 * 4 3 
 * 3 2 3
 * 
 * 
 * 
 * Output 
 * 6
 * 
 * 
 * 
 * Input 
 * 4 3 
 * 2 3 3
 * 
 * 
 * 
 * Output 
 * 2
 * 
 * 
 * 
 * Note
 * 
 * In the first test example the sequence of Xenia's moves along the ringroad
 * looks as follows: 1 → 2 → 3 → 4 → 1 → 2 → 3. This is optimal sequence. So,
 * she needs 6 time units.
 * 
 * B339XeniaAndRingroad.java
 * 
 * @author olivelv
 * @version time: Sep 8, 2015 8:53:09 PM
 */
public class B339XeniaAndRingroad {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		long n=cin.nextLong();
		long m=cin.nextLong();
		long pre=1;
		long s=0;
		for(long i=0;i<m;i++){
			long val=cin.nextLong();
			if(val>=pre)s+=val-pre;
			else
				s+=n-(pre-val);
			//int tmp=Math.abs(val-pre);
			//s+=Math.min(tmp, n-tmp);
			pre=val;
		}
		System.out.println(s);
	}
}
