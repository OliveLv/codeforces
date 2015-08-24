import java.util.Scanner;

/**
 * During the break the schoolchildren, boys and girls, formed a queue of n
 * people in the canteen. Initially the children stood in the order they entered
 * the canteen. However, after a while the boys started feeling awkward for
 * standing in front of the girls in the queue and they started letting the
 * girls move forward each second.
 * 
 * Let's describe the process more precisely. Let's say that the positions in
 * the queue are sequentially numbered by integers from 1 to n, at that the
 * person in the position number 1 is served first. Then, if at time x a boy
 * stands on the i-th position and a girl stands on the (i鈥�鈥�)-th position,
 * then at time x鈥�鈥� the i-th position will have a girl and the (i鈥�鈥�)-th
 * position will have a boy. The time is given in seconds.
 * 
 * You've got the initial position of the children, at the initial moment of
 * time. Determine the way the queue is going to look after t seconds.
 * 
 * Input 
 * The first line contains two integers n and t (1鈥夆墹鈥塶,鈥塼鈥夆墹鈥�0), which
 * represent the number of children in the queue and the time after which the
 * queue will transform into the arrangement you need to find.
 * 
 * The next line contains string s, which represents the schoolchildren's
 * initial arrangement. If the i-th position in the queue contains a boy, then
 * the i-th character of string s equals "B", otherwise the i-th character
 * equals "G".
 * 
 * Output 
 * Print string a, which describes the arrangement after t seconds. If
 * the i-th position has a boy after the needed time, then the i-th character a
 * must equal "B", otherwise it must equal "G".
 * 
 * Sample test(s) 
 * input 
 * 5 1 
 * BGGBG 
 * output 
 * GBGGB 
 * input 
 * 5 2 
 * BGGBG 
 * output 
 * GGBGB
 * input 
 * 4 1 
 * GGGB 
 * output 
 * GGGB
 * 
 * @Title: A266QueueAtTheSchool.java
 * @author lxh
 * @date Aug 18, 2015 9:42:45 AM
 * 
 */

public class B266QueueAtTheSchool {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int t=cin.nextInt();
		String str=cin.next();
		char []s=new char[n];
		for(int i=0;i<n;i++)
			s[i]=str.charAt(i);
		for(int j=0;j<t;j++){
			for(int i=1;i<n;i++){
				if(s[i-1]=='B'&&s[i]=='G'){
					char tmp=s[i];
					s[i]=s[i-1];
					s[i-1]=tmp;
					i++;
				}
				
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(s[i]);
		System.out.println();
	}
}
