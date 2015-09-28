import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Little Vasya has received a young builder’s kit. The kit consists of several
 * wooden bars, the lengths of all of them are known. The bars can be put one on
 * the top of the other if their lengths are the same.
 * 
 * Vasya wants to construct the minimal number of towers from the bars. Help
 * Vasya to use the bars in the best way possible.
 * 
 * Input 
 * The first line contains an integer N (1 ≤ N ≤ 1000) — the number of
 * bars at Vasya’s disposal. The second line contains N space-separated integers
 * li — the lengths of the bars. All the lengths are natural numbers not
 * exceeding 1000.
 * 
 * Output 
 * In one line output two numbers — the height of the largest tower and
 * their total number. Remember that Vasya should use all the bars.
 * 
 * Sample test(s) 
 * input 
 * 3 
 * 1 2 3 
 * output 
 * 1 3 
 * input 
 * 4 
 * 6 5 6 7 
 * output 
 * 2 3
 * 
 * @Title: A37Towers.java
 * @author lxh
 * @date Sep 28, 2015 1:33:32 PM
 * 
 */

public class A37Towers {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int max=0;
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			int cnt=0;
			if(map.containsKey(val))cnt=map.get(val);
			map.put(val, cnt+1);
			if(max<cnt+1)max=cnt+1;
		}
		System.out.println(max+" "+map.keySet().size());
		
	}
}
