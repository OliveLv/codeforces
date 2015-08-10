import java.util.Scanner;

/**
 * 
 "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..."
 * — an excerpt from contest rules.
 * 
 * A total of n participants took part in the contest (n ≥ k), and you already
 * know their scores. Calculate how many participants will advance to the next
 * round.
 * 
 * 
 * Input
 * 
 * The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50)
 * separated by a single space.
 * 
 * The second line contains n space-separated integers a1, a2, ..., an
 * (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the
 * i-th place. The given sequence is non-increasing (that is, for all i from 1
 * to n - 1 the following condition is fulfilled: ai ≥ ai + 1).
 * 
 * 
 * Output
 * 
 * Output the number of participants who advance to the next round.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 
 * 8 5 
 * 10 9 8 7 7 7 5 5
 * 
 * 
 * 
 * Output 
 * 6
 * 
 * 
 * 
 * Input 
 * 4 2
 * 0 0 0 0
 * 
 * 
 * 
 * Output 
 * 0
 * 
 * 
 * 
 * Note
 * 
 * In the first example the participant on the 5th place earned 7 points. As the
 * participant on the 6th place also earned 7 points, there are 6 advancers.
 * 
 * In the second example nobody got a positive score.
 * 
 * A158NextRound.java
 * 
 * @author olivelv
 * @version time: Aug 6, 2015 2:48:53 PM
 */
public class A158NextRound {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		int k=cin.nextInt();
		int []a=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=cin.nextInt();
		if(a[k]==0){
			int i=1;
			for(i=1;i<=n;i++)
				if(a[i]==0)break;
			
			System.out.println(i-1);
		}
		else{
			int i=k;
			while(i<=n){
				if(a[i]<a[k])break;
				i++;
			}
			System.out.println(i-1);
		}
	}
}
