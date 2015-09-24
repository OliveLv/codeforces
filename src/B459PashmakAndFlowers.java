import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 Pashmak decided to give Parmida a pair of flowers from the garden. There are
 * n flowers in the garden and the i-th of them has a beauty number bi. Parmida
 * is a very strange girl so she doesn't want to have the two most beautiful
 * flowers necessarily. She wants to have those pairs of flowers that their
 * beauty difference is maximal possible!
 * 
 * Your task is to write a program which calculates two things: 1. The maximum
 * beauty difference of flowers that Pashmak can give to Parmida. 2. The number
 * of ways that Pashmak can pick the flowers. Two ways are considered different
 * if and only if there is at least one flower that is chosen in the first way
 * and not chosen in the second way.
 * 
 * 
 * Input
 * 
 * The first line of the input contains n (2 ≤ n ≤ 2·105). In the next line
 * there are n space-separated Longs b1, b2, ..., bn (1 ≤ bi ≤ 109).
 * 
 * 
 * Output
 * 
 * The only line of output should contain two Longs. The maximum beauty
 * difference and the number of ways this may happen, respectively.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 2 1 2
 * 
 * 
 * 
 * Output 1 1
 * 
 * 
 * Input 3 1 4 5
 * 
 * 
 * 
 * Output 4 1
 * 
 * 
 * Input 5 3 1 2 3 1
 * 
 * 
 * 
 * Output 2 4
 * 
 * 
 * Note
 * 
 * In the third sample the maximum beauty difference is 2 and there are 4 ways
 * to do this: 1. choosing the first and the second flowers; 2. choosing the
 * first and the fifth flowers; 3. choosing the fourth and the second flowers;
 * 4. choosing the fourth and the fifth flowers.
 * 
 * B459PashmakAndFlowers.java
 * 
 * @author olivelv
 * @version time: Sep 24, 2015 10:23:05 PM
 */
public class B459PashmakAndFlowers {
	public static int find(long []a,long val){
		int len=a.length;
		int l=0,r=len-1;
    	while(l<=r){
    		int mid=(l+r)/2;
    		if(a[mid]==val)return mid;
    		if(a[mid]>val)r=mid-1;
    		else if(a[mid]<val)l=mid+1;
    	}
    	return -1;
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		
		Map<Long,Long>map=new HashMap<Long,Long>();
		for(int i=0;i<n;i++){
			//a[i]=cin.nextInt();
			long val=cin.nextLong();
			long cnt=0;
			if(map.containsKey(val))cnt=map.get(val);
			map.put(val, cnt+1);
		}
		Object []obj=map.keySet().toArray();
		int len=obj.length;
		long []a=new long[len];
		for(int i=0;i<len;i++)a[i]=(long) obj[i];
		Arrays.sort(a);
	    long max=a[len-1]-a[0];
	    long num=0;
	    if(max==0){
	    	long val=map.get(a[0]);
	    	System.out.println(max+" "+(val*(val-1)/2));
	    	return ;
	    }
	    for(int i=0;i<len;i++){
	    	long val=a[i]+max;
	    	if(find(a,val)!=-1)num+=map.get(a[i])*map.get(val);
	    }
		System.out.println(max+" "+num);
	}
}
