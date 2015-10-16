import java.util.Scanner;

/**
 * Toastman came up with a very easy task. He gives it to Appleman, but Appleman
 * doesn't know how to solve it. Can you help him?
 * 
 * Given a n × n checkerboard. Each cell of the board has either character 'x',
 * or character 'o'. Is it true that each cell of the board has even number of
 * adjacent cells with 'o'? Two cells of the board are adjacent if they share a
 * side.
 * 
 * Input 
 * The first line contains an integer n (1 ≤ n ≤ 100). Then n lines follow
 * containing the description of the checkerboard. Each of them contains n
 * characters (either 'x' or 'o') without spaces.
 * 
 * Output 
 * Print "YES" or "NO" (without the quotes) depending on the answer to
 * the problem.
 * 
 * Sample test(s) 
 * input 
 * 3 
 * xxo 
 * xox 
 * oxx 
 * output 
 * YES 
 * input 
 * 4 
 * xxxo 
 * xoxo 
 * oxox 
 * xxxx
 * output 
 * NO
 * 
 * @Title: A462ApplemanAndEasyTask.java
 * @author lxh
 * @date Oct 16, 2015 7:33:04 AM
 * 
 */

public class A462ApplemanAndEasyTask {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		char [][]a=new char[n][n];
		for(int i=0;i<n;i++){
			String tmp=cin.next();
			a[i]=tmp.toCharArray();
		}
		int s=0;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				int tmp=0;
				if(i-1>=0&&a[i-1][j]=='o')tmp++;
				if(j-1>=0&&a[i][j-1]=='o')tmp++;
				if(i+1<n&&a[i+1][j]=='o')tmp++;
				if(j+1<n&&a[i][j+1]=='o')tmp++;
				if(tmp%2==0)s++;		
			}
			
		}
		if(s==n*n)System.out.println("YES");
		else
			System.out.println("NO");
	}
}
