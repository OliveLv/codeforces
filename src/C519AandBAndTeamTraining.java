import java.util.Scanner;

/**
 * A and B are preparing themselves for programming contests.
 * 
 * An important part of preparing for a competition is sharing programming
 * knowledge from the experienced members to those who are just beginning to
 * deal with the contests. Therefore, during the next team training A decided to
 * make teams so that newbies are solving problems together with experienced
 * participants.
 * 
 * A believes that the optimal team of three people should consist of one
 * experienced participant and two newbies. Thus, each experienced participant
 * can share the experience with a large number of people.
 * 
 * However, B believes that the optimal team should have two experienced members
 * plus one newbie. Thus, each newbie can gain more knowledge and experience.
 * 
 * As a result, A and B have decided that all the teams during the training
 * session should belong to one of the two types described above. Furthermore,
 * they agree that the total number of teams should be as much as possible.
 * 
 * There are n experienced members and m newbies on the training session. Can
 * you calculate what maximum number of teams can be formed?
 * 
 * Input The first line contains two integers n and m (0 ≤ n, m ≤ 5·105) — the
 * number of experienced participants and newbies that are present at the
 * training session.
 * 
 * Output Print the maximum number of teams that can be formed.
 * 
 * Sample test(s) input 2 6 output 2 input 4 5 output 3 Note Let's represent the
 * experienced players as XP and newbies as NB.
 * 
 * In the first test the teams look as follows: (XP, NB, NB), (XP, NB, NB).
 * 
 * In the second test sample the teams look as follows: (XP, NB, NB), (XP, NB,
 * NB), (XP, XP, NB).
 * 
 * @Title: C519AandBAndTeamTraining.java
 * @author lxh
 * @date Oct 16, 2015 7:50:34 AM
 * 
 */
public class C519AandBAndTeamTraining {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);	
		int n=cin.nextInt();
		int m=cin.nextInt();
		int max=0;
		if(m==0||n==0){
			System.out.println(0);
			return ;
		}
		for(int a=n/2;a>=0;a--){
			if(m<a)continue;
			int b=Math.min(n-2*a, (m-a)/2);
			if(max<a+b)max=a+b;
	
		}
		System.out.println(max);
	}
}
