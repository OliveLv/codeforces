import java.util.Scanner;

/**
 * Manao works on a sports TV. He's spent much time watching the football games
 * of some country. After a while he began to notice different patterns. For
 * example, each team has two sets of uniforms: home uniform and guest uniform.
 * When a team plays a game at home, the players put on the home uniform. When a
 * team plays as a guest on somebody else's stadium, the players put on the
 * guest uniform. The only exception to that rule is: when the home uniform
 * color of the host team matches the guests' uniform, the host team puts on its
 * guest uniform as well. For each team the color of the home and guest uniform
 * is different.
 * 
 * There are n teams taking part in the national championship. The championship
 * consists of n·(n - 1) games: each team invites each other team to its
 * stadium. At this point Manao wondered: how many times during the championship
 * is a host team going to put on the guest uniform? Note that the order of the
 * games does not affect this number.
 * 
 * You know the colors of the home and guest uniform for each team. For
 * simplicity, the colors are numbered by integers in such a way that no two
 * distinct colors have the same number. Help Manao find the answer to his
 * question.
 * 
 * Input 
 * The first line contains an integer n (2 ≤ n ≤ 30). Each of the
 * following n lines contains a pair of distinct space-separated integers hi, ai
 * (1 ≤ hi, ai ≤ 100) — the colors of the i-th team's home and guest uniforms,
 * respectively.
 * 
 * Output 
 * In a single line print the number of games where the host team is
 * going to play in the guest uniform.
 * 
 * Sample test(s) 
 * input 
 * 3 
 * 1 2 
 * 2 4 
 * 3 4 
 * output 
 * 1 
 * input 
 * 4 
 * 100 42 
 * 42 100 
 * 5 42 
 * 100 5
 * output 
 * 5
 * input 
 * 2 
 * 1 2 
 * 1 2 
 * output 
 * 0 
 * Note 
 * In the first test case the championship consists of 6 games. The only game with the event in question is
 * the game between teams 2 and 1 on the stadium of team 2.
 * 
 * In the second test sample the host team will have to wear guest uniform in
 * the games between teams: 1 and 2, 2 and 1, 2 and 3, 3 and 4, 4 and 2 (the
 * host team is written first).
 * 
 * @Title: A268Games.java
 * @author lxh
 * @date Aug 26, 2015 9:18:01 AM
 * 
 */

public class A268Games {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int []h=new int [n];
		int []a=new int[n];
		int s=0;
		for(int i=0;i<n;i++){
			h[i]=cin.nextInt();
			a[i]=cin.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(h[i]==a[j])s++;
				if(a[i]==h[j])s++;
			}
		}
		System.out.println(s);
	}
}
