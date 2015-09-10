import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Kirito is stuck on a level of the MMORPG he is playing now. To move on in the
 * game, he's got to defeat all n dragons that live on this level. Kirito and
 * the dragons have strength, which is represented by an integer. In the duel
 * between two opponents the duel's outcome is determined by their strength.
 * Initially, Kirito's strength equals s.
 * 
 * If Kirito starts duelling with the i-th (1 ≤ i ≤ n) dragon and Kirito's
 * strength is not greater than the dragon's strength xi, then Kirito loses the
 * duel and dies. But if Kirito's strength is greater than the dragon's
 * strength, then he defeats the dragon and gets a bonus strength increase by
 * yi.
 * 
 * Kirito can fight the dragons in any order. Determine whether he can move on
 * to the next level of the game, that is, defeat all dragons without a single
 * loss.
 * 
 * Input 
 * The first line contains two space-separated integers s and n
 * (1 ≤ s ≤ 104, 1 ≤ n ≤ 103). Then n lines follow: the i-th line contains
 * space-separated integers xi and yi (1 ≤ xi ≤ 104, 0 ≤ yi ≤ 104) — the i-th
 * dragon's strength and the bonus for defeating it.
 * 
 * Output 
 * On a single line print "YES" (without the quotes), if Kirito can move
 * on to the next level and print "NO" (without the quotes), if he can't.
 * 
 * Sample test(s) 
 * input 
 * 2 2 
 * 1 99 
 * 100 0 
 * output 
 * YES 
 * input 
 * 10 1 
 * 100 100 
 * output 
 * NO
 * Note 
 * In the first sample Kirito's strength initially equals 2. As the first
 * dragon's strength is less than 2, Kirito can fight it and defeat it. After
 * that he gets the bonus and his strength increases to 2 + 99 = 101. Now he can
 * defeat the second dragon and move on to the next level.
 * 
 * In the second sample Kirito's strength is too small to defeat the only dragon
 * and win.
 * 
 * @Title: A230Dragons.java
 * @author lxh
 * @date Sep 10, 2015 2:35:10 PM
 * 
 */

public class A230Dragons {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int s=cin.nextInt();
		int n=cin.nextInt();
		Dragon []dragons=new Dragon[n];
		for(int i=0;i<n;i++){
			dragons[i]=new Dragon();
			dragons[i].x=cin.nextInt();
			dragons[i].y=cin.nextInt();
		}
		Arrays.sort(dragons);
		for(int i=0;i<n;i++){
			if(dragons[i].x>=s){
				System.out.println("NO");
				return ;
			}else{
				s+=dragons[i].y;
			}
		}
		System.out.println("YES");
	}
}
class Dragon implements Comparable{
	int x;
	int y;
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o1) {
		// TODO Auto-generated method stub
		Dragon obj=(Dragon)o1;
		if(obj.x!=x)return x-obj.x;
		return y-obj.y;
	}
}
