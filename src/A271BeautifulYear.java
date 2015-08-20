import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * It seems like the year of 2013 came only yesterday. Do you know a curious
 * fact? The year of 2013 is the first year after the old 1987 with only
 * distinct digits.
 * 
 * Now you are suggested to solve the following problem: given a year number,
 * find the minimum year number which is strictly larger than the given one and
 * has only distinct digits.
 * 
 * Input 
 * The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.
 * 
 * Output 
 * Print a single integer — the minimum year number that is strictly
 * larger than y and all it's digits are distinct. It is guaranteed that the
 * answer exists.
 * 
 * Sample test(s) 
 * input 
 * 1987 
 * output 
 * 2013 
 * input 
 * 2013 
 * output
 * 2014
 * 
 * @Title: A271BeautifulYear.java
 * @author lxh
 * @date Aug 17, 2015 5:12:09 PM
 * 
 */

public class A271BeautifulYear {
	private static int[]years;
	private static int k=0;
	static{
		years=new int[9014];
		for(int i=1000;i<=9013;i++){
			Set<String>set=new HashSet<String>();
			String str=String.valueOf(i);
			for(int j=0;j<4;j++){
				set.add(String.valueOf(str.charAt(j)));
			}
			if(set.size()==4)years[i]=1;
		}
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int y=cin.nextInt();
		for(int i=y+1;i<=9013;i++)
			if(years[i]==1){
				System.out.println(i);
				return ;
			}
	}
}
