import java.util.Scanner;

/**
 * Mad scientist Mike entertains himself by arranging rows of dominoes. He
 * doesn't need dominoes, though: he uses rectangular magnets instead. Each
 * magnet has two poles, positive (a "plus") and negative (a "minus"). If two
 * magnets are put together at a close distance, then the like poles will repel
 * each other and the opposite poles will attract each other.
 * 
 * Mike starts by laying one magnet horizontally on the table. During each
 * following step Mike adds one more magnet horizontally to the right end of the
 * row. Depending on how Mike puts the magnet on the table, it is either
 * attracted to the previous one (forming a group of multiple magnets linked
 * together) or repelled by it (then Mike lays this magnet at some distance to
 * the right from the previous one). We assume that a sole magnet not linked to
 * others forms a group of its own.
 * 
 * 
 * Mike arranged multiple magnets in a row. Determine the number of groups that
 * the magnets formed.
 * 
 * Input 
 * The first line of the input contains an integer n (1 ≤ n ≤ 100000) —
 * the number of magnets. Then n lines follow. The i-th line (1 ≤ i ≤ n)
 * contains either characters "01", if Mike put the i-th magnet in the
 * "plus-minus" position, or characters "10", if Mike put the magnet in the
 * "minus-plus" position.
 * 
 * Output 
 * On the single line of the output print the number of groups of
 * magnets.
 * 
 * Sample test(s) 
 * input 
 * 6 
 * 10 
 * 10 
 * 10 
 * 01 
 * 10 
 * 10 
 * output 
 * 3 
 * input 
 * 4 
 * 01 
 * 01 
 * 10 
 * 10 
 * output
 * 2 
 * Note 
 * The first testcase corresponds to the figure. The testcase has three
 * groups consisting of three, one and two magnets.
 * 
 * The second testcase has two groups, each consisting of two magnets.
 * 
 * @Title: A334Magnets.java
 * @author lxh
 * @date Aug 19, 2015 7:18:44 PM
 * 
 */

public class A334Magnets {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		String str=cin.next();
		int group=1;
		for(int i=1;i<n;i++){
			String s=cin.next();
			if(!s.equals(str)){
				str=new String(s);
				group++;
			}
		}
		System.out.println(group);
	}
}
