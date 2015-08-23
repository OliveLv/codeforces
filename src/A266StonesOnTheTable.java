import java.util.*;
/*/**
**There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.

Input
The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.

Output
Print a single integer — the answer to the problem.

Sample test(s)
input
3
RRG
output
1
input
5
RRRRR
output
4
input
4
BRBG
output
0
** author:olive
**
**/
public class A266StonesOnTheTable{
	static int min=100;
	public static boolean isValid(String s){
		int n=s.length();
		char pre=s.charAt(0);
		for(int i=1;i<n;i++){
			char val=s.charAt(i);
			if(val==pre)return false;
			pre=val;
		}
		return true;
	}
	public static void dfs(String s,int idx,int cnt){
		int n=s.length();
		if(isValid(s)){
			if(min>cnt)min=cnt;
			return ;
		}
		if(idx==n)return ;
		char val1=s.charAt(idx-1);
		char val2=s.charAt(idx);
		if(val1!=val2)dfs(s,idx+1,cnt);
		else{
			s=s.substring(0,idx)+s.substring(idx+1,n);
			dfs(s,idx,cnt+1);
		}
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		String s=cin.next();
		//int n=3;
		//String s="RGB";
		dfs(s,1,0);
		System.out.println(min);

	}
}

