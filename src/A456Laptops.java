import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * One day Dima and Alex had an argument about the price and quality of laptops.
 * Dima thinks that the more expensive a laptop is, the better it is. Alex
 * disagrees. Alex thinks that there are two laptops, such that the price of the
 * first laptop is less (strictly smaller) than the price of the second laptop
 * but the quality of the first laptop is higher (strictly greater) than the
 * quality of the second laptop.
 * 
 * Please, check the guess of Alex. You are given descriptions of n laptops.
 * Determine whether two described above laptops exist.
 * 
 * Input 
 * The first line contains an integer n (1 ≤ n ≤ 105) — the number of
 * laptops.
 * 
 * Next n lines contain two integers each, ai and bi (1 ≤ ai, bi ≤ n), where ai
 * is the price of the i-th laptop, and bi is the number that represents the
 * quality of the i-th laptop (the larger the number is, the higher is the
 * quality).
 * 
 * All ai are distinct. All bi are distinct.
 * 
 * Output 
 * If Alex is correct, print "Happy Alex", otherwise print "Poor Alex"
 * (without the quotes).
 * 
 * Sample test(s) 
 * input 
 * 2 
 * 1 2 
 * 2 1 
 * output 
 * Happy Alex
 * 
 * @Title: A456Laptops.java
 * @author lxh
 * @date Oct 15, 2015 7:47:47 AM
 * 
 */

public class A456Laptops {

	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		Laptop []laps=new Laptop[n];
		for(int i=0;i<n;i++){
			int a=cin.nextInt();
			int b=cin.nextInt();
			Laptop tmp=new Laptop(a,b);
			laps[i]=tmp;
		}
		Arrays.sort(laps, new comparePrice());
		int max=laps[0].quality;
		for(int i=1;i<n;i++)
			if(laps[i].quality<laps[i-1].quality){
				System.out.println("Happy Alex");
				return ;
			}
		System.out.println("Poor Alex");
	}
}
class Laptop{
	int price;
	int quality;
	public Laptop(int a,int b){
		this.price=a;
		this.quality=b;
	}
	public void print(){
		System.out.println(price+" "+quality);
	}
}
class comparePrice implements Comparator{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		
		return l1.price-l2.price;
	}
	
}
