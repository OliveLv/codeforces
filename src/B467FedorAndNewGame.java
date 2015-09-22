import java.util.Scanner;

/**
 * 
 After you had helped George and Alex to move in the dorm, they went to help
 * their friend Fedor play a new computer game «Call of Soldiers 3».
 * 
 * The game has (m + 1) players and n types of soldiers in total. Players «Call
 * of Soldiers 3» are numbered form 1 to (m + 1). Types of soldiers are numbered
 * from 0 to n - 1. Each player has an army. Army of the i-th player can be
 * described by non-negative integer xi. Consider binary representation of xi:
 * if the j-th bit of number xi equal to one, then the army of the i-th player
 * has soldiers of the j-th type.
 * 
 * Fedor is the (m + 1)-th player of the game. He assume that two players can
 * become friends if their armies differ in at most k types of soldiers (in
 * other words, binary representations of the corresponding numbers differ in at
 * most k bits). Help Fedor and count how many players can become his friends.
 * 
 * 
 * Input
 * 
 * The first line contains three integers n, m, k (1 ≤ k ≤ n ≤ 20;
 * 1 ≤ m ≤ 1000).
 * 
 * The i-th of the next (m + 1) lines contains a single integer xi
 * (1 ≤ xi ≤ 2n - 1), that describes the i-th player's army. We remind you that
 * Fedor is the (m + 1)-th player.
 * 
 * 
 * Output
 * 
 * Print a single integer — the number of Fedor's potential friends.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 7 3 1 8 5 111 17
 * 
 * 
 * 
 * Output 0
 * 
 * 
 * 
 * Input 3 3 3 1 2 3 4
 * 
 * 
 * 
 * Output 3
 * 
 * B467FedorAndNewGame.java
 * 
 * @author olivelv
 * @version time: Sep 22, 2015 11:09:33 PM
 */
public class B467FedorAndNewGame {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		int k=cin.nextInt();
		int []p=new int[m];
		for(int i=0;i<m;i++)p[i]=cin.nextInt();
		int f=cin.nextInt();
		int num=0;
		for(int i=0;i<m;i++){
			int val=p[i]^f;
			int s=0;
			while(val!=0){
				s+=val&1;
				val>>=1;
			}
			if(s<=k)num++;
		}
		System.out.println(num);
	}
}
