import java.util.Scanner;

/** 
 * Little Petya very much likes gifts. Recently he has received a new laptop as a New Year gift from his mother. He immediately decided to give it to somebody else as what can be more pleasant than giving somebody gifts. And on this occasion he organized a New Year party at his place and invited n his friends there.

If there's one thing Petya likes more that receiving gifts, that's watching others giving gifts to somebody else. Thus, he safely hid the laptop until the next New Year and made up his mind to watch his friends exchanging gifts while he does not participate in the process. He numbered all his friends with integers from 1 to n. Petya remembered that a friend number i gave a gift to a friend number pi. He also remembered that each of his friends received exactly one gift.

Now Petya wants to know for each friend i the number of a friend who has given him a gift.

Input
The first line contains one integer n (1 ≤ n ≤ 100) — the quantity of friends Petya invited to the party. The second line contains n space-separated integers: the i-th number is pi — the number of a friend who gave a gift to friend number i. It is guaranteed that each friend received exactly one gift. It is possible that some friends do not share Petya's ideas of giving gifts to somebody else. Those friends gave the gifts to themselves.

Output
Print n space-separated integers: the i-th number should equal the number of the friend who gave a gift to friend number i.

Sample test(s)
input
4
2 3 4 1
output
4 1 2 3
input
3
1 3 2
output
1 3 2
input
2
1 2
output
1 2  
 * @Title: A136Presents.java 
 * @author lxh  
 * @date Aug 17, 2015 8:57:49 PM  
 * 
 */

public class A136Presents {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		for(int j=1;j<=n;j++){
			int i=0;
			for(;i<n;i++)
				if(a[i]==j)break;
			System.out.print((i+1)+" ");
		}
		System.out.println();
	}
}
