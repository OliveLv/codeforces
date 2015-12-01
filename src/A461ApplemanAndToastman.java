import java.math.BigInteger;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 Appleman and Toastman play a game. Initially Appleman gives one group of n
 * numbers to the Toastman, then they start to complete the following tasks: •
 * Each time Toastman gets a group of numbers, he sums up all the numbers and
 * adds this sum to the score. Then he gives the group to the Appleman. • Each
 * time Appleman gets a group consisting of a single number, he throws this
 * group out. Each time Appleman gets a group consisting of more than one
 * number, he splits the group into two non-empty groups (he can do it in any
 * way) and gives each of them to Toastman.
 * 
 * After guys complete all the tasks they look at the score value. What is the
 * maximum possible value of score they can get?
 * 
 * 
 * Input
 * 
 * The first line contains a single integer n (1 ≤ n ≤ 3·105). The second line
 * contains n integers a1, a2, ..., an (1 ≤ ai ≤ 106) — the initial group that
 * is given to Toastman.
 * 
 * 
 * Output
 * 
 * Print a single integer — the largest possible score.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 3 3 1 5
 * 
 * 
 * 
 * Output 26
 * 
 * 
 * 
 * Input 1 10
 * 
 * 
 * 
 * Output 10
 * 
 * 
 * 
 * Note
 * 
 * Consider the following situation in the first example. Initially Toastman
 * gets group [3, 1, 5] and adds 9 to the score, then he give the group to
 * Appleman. Appleman splits group [3, 1, 5] into two groups: [3, 5] and [1].
 * Both of them should be given to Toastman. When Toastman receives group [1],
 * he adds 1 to score and gives the group to Appleman (he will throw it out).
 * When Toastman receives group [3, 5], he adds 8 to the score and gives the
 * group to Appleman. Appleman splits [3, 5] in the only possible way: [5] and
 * [3]. Then he gives both groups to Toastman. When Toastman receives [5], he
 * adds 5 to the score and gives the group to Appleman (he will throws it out).
 * When Toastman receives [3], he adds 3 to the score and gives the group to
 * Appleman (he will throws it out). Finally Toastman have added 9 + 1 + 8 + 5 +
 * 3 = 26 to the score. This is the optimal sequence of actions.
 * 
 * A461ApplemanAndToastman.java
 * 
 * @author olivelv
 * @version time: Dec 1, 2015 10:50:47 PM
 */
public class A461ApplemanAndToastman {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		PriorityQueue<BigInteger> queue=new PriorityQueue<BigInteger>(n,new Comparator<BigInteger>(){

		

			@Override
			public int compare(BigInteger o1, BigInteger o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		for(int i=0;i<n;i++){
			queue.add(new BigInteger(cin.next()));
		}
		BigInteger res=new BigInteger("0");
		while(!queue.isEmpty()){
			BigInteger a=queue.poll();
			res=res.add(a);
			if(queue.isEmpty()){
				break;
			}
			BigInteger b=queue.poll();
			res=res.add(b);
			queue.add(a.add(b));
		}
		System.out.println(res.toString());
	}
}
