import java.util.Scanner;

/**
 * 
 You are a lover of bacteria. You want to raise some bacteria in a box.
 * 
 * Initially, the box is empty. Each morning, you can put any number of bacteria
 * into the box. And each night, every bacterium in the box will split into two
 * bacteria. You hope to see exactly x bacteria in the box at some moment.
 * 
 * What is the minimum number of bacteria you need to put into the box across
 * those days?
 * 
 * 
 * Input
 * 
 * The only line containing one integer x (1 ≤ x ≤ 109).
 * 
 * 
 * Output
 * 
 * The only line containing one integer: the answer.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 5
 * 
 * 
 * 
 * Output 2
 * 
 * 
 * 
 * Input 8
 * 
 * 
 * 
 * Output 1
 * 
 * 
 * 
 * Note
 * 
 * For the first sample, we can add one bacterium in the box in the first day
 * morning and at the third morning there will be 4 bacteria in the box. Now we
 * put one more resulting 5 in the box. We added 2 bacteria in the process so
 * the answer is 2.
 * 
 * For the second sample, we can put one in the first morning and in the 4-th
 * morning there will be 8 in the box. So the answer is 1.
 * 
 * A579RaisingBacteria.java
 * 
 * @author olivelv
 * @version time: Oct 1, 2015 7:32:22 PM
 */
public class A579RaisingBacteria {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		long n=cin.nextLong();
		int s=0;
		while(n!=0){
			if((n&1)==1)s++;
			n>>=1;
		}
		System.out.println(s);
	}
}
