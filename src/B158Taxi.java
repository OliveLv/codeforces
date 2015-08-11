import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**  
 * After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?

Input
The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.

Output
Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.

Sample test(s)
input
5
1 2 4 3 3
output
4
input
8
2 3 4 4 2 1 3 1
output
5
Note
In the first test we can sort the children into four cars like this:

the third group (consisting of four children),
the fourth group (consisting of three children),
the fifth group (consisting of three children),
the first and the second group (consisting of one and two children, correspondingly).
There are other ways to sort the groups into four cars. 
 * @Title: B158Taxi.java 
 * @author olive  
 * @date Aug 11, 2015 2:38:30 PM  
 * 
 */

public class B158Taxi {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		//Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		int []a=new int[5];
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			a[val]++;
		}
		int s=0;
		if(a[4]!=0)s=a[4];
		if(a[3]!=0)s+=a[3];
		if(a[2]!=0){
			int val=a[2];
			s+=val/2;
			if(val%2!=0)s++;
		}
		if(a[1]!=0){
			int val=a[1];
			if(val>a[3]){
				val-=a[3];
				if(a[2]%2!=0)val-=2;
				if(val>0){
					s+=val/4;
					if(val%4!=0)s++;
				}
			}
			
		}
		System.out.println(s);
		
	}
}
