import java.util.Scanner;

/**
 * 
 Valera is a collector. Once he wanted to expand his collection with exactly
 * one antique item.
 * 
 * Valera knows n sellers of antiques, the i-th of them auctioned ki items.
 * Currently the auction price of the j-th object of the i-th seller is sij.
 * Valera gets on well with each of the n sellers. He is perfectly sure that if
 * he outbids the current price of one of the items in the auction (in other
 * words, offers the seller the money that is strictly greater than the current
 * price of the item at the auction), the seller of the object will immediately
 * sign a contract with him.
 * 
 * Unfortunately, Valera has only v units of money. Help him to determine which
 * of the n sellers he can make a deal with.
 * 
 * 
 * Input
 * 
 * The first line contains two space-separated integers n, v (1 ≤ n ≤ 50;
 * 104 ≤ v ≤ 106) — the number of sellers and the units of money the Valera has.
 * 
 * Then n lines follow. The i-th line first contains integer ki (1 ≤ ki ≤ 50)
 * the number of items of the i-th seller. Then go ki space-separated integers
 * si1, si2, ..., siki (104 ≤ sij ≤ 106) — the current prices of the items of
 * the i-th seller.
 * 
 * 
 * Output
 * 
 * In the first line, print integer p — the number of sellers with who Valera
 * can make a deal.
 * 
 * In the second line print p space-separated integers q1, q2, ..., qp
 * (1 ≤ qi ≤ n) — the numbers of the sellers with who Valera can make a deal.
 * Print the numbers of the sellers in the increasing order.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 3 50000 1 40000 2 20000 60000 3 10000 70000 190000
 * 
 * 
 * 
 * Output 3 1 2 3
 * 
 * 
 * 
 * Input 3 50000 1 50000 3 100000 120000 110000 3 120000 110000 120000
 * 
 * 
 * 
 * Output 0
 * 
 * 
 * 
 * 
 * Note
 * 
 * In the first sample Valera can bargain with each of the sellers. He can
 * outbid the following items: a 40000 item from the first seller, a 20000 item
 * from the second seller, and a 10000 item from the third seller.
 * 
 * In the second sample Valera can not make a deal with any of the sellers, as
 * the prices of all items in the auction too big for him.
 * 
 * A41ValeraAndAntiqueItems.java
 * 
 * @author olivelv
 * @version time: Oct 2, 2015 7:35:19 PM
 */
public class A41ValeraAndAntiqueItems {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int v=cin.nextInt();
		int []res=new int[n];
		int t=0;
		for(int i=0;i<n;i++){
			int k=cin.nextInt();
			boolean flag=false;
			for(int j=0;j<k;j++){
				int val=cin.nextInt();
				if(val<v)flag=true;
			}
			if(flag)res[t++]=i+1;
		}
		System.out.println(t);
		for(int i=0;i<t;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(res[i]);
		}
	}
}
