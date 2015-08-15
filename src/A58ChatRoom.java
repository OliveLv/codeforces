import java.util.Scanner;


/**
 * 
Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.


Input

The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.


Output

If Vasya managed to say hello, print "YES", otherwise print "NO".


Sample test(s)



Input
ahhellllloou



Output
YES



Input
hlelo



Output
NO

 * A58ChatRoom.java
 * @author olivelv
 * @version time: Aug 15, 2015 1:21:06 PM
 */
public class A58ChatRoom {
	public static boolean flag=false;
	public static void dfs(String s,int idx,char []str,int sdx){
		if(sdx==5||flag){
			flag=true;
			return ;
		}
		int n=s.length();
		for(int i=idx;i<n;i++){
			if(s.charAt(i)==str[sdx]){
				dfs(s,i+1,str,sdx+1);
			}
		}
		
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String str=cin.next();
		int n=str.length();
		char[]s={'h','e','l','l','o'};
		dfs(str,0,s,0);
		if(flag)System.out.println("YES");
		else
			System.out.println("NO");
	}
}
