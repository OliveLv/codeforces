import java.util.Scanner;

/**
 * 
 Two polar bears Menshykov and Uslada from the St.Petersburg zoo and elephant
 * Horace from the Kiev zoo got six sticks to play with and assess the animals'
 * creativity. Menshykov, Uslada and Horace decided to make either an elephant
 * or a bear from those sticks. They can make an animal from sticks in the
 * following way: • Four sticks represent the animal's legs, these sticks should
 * have the same length. • Two remaining sticks represent the animal's head and
 * body. The bear's head stick must be shorter than the body stick. The
 * elephant, however, has a long trunk, so his head stick must be as long as the
 * body stick. Note that there are no limits on the relations between the leg
 * sticks and the head and body sticks.
 * 
 * Your task is to find out which animal can be made from the given stick set.
 * The zoo keeper wants the sticks back after the game, so they must never be
 * broken, even bears understand it.
 * 
 * 
 * Input
 * 
 * The single line contains six space-separated integers li (1 ≤ li ≤ 9) — the
 * lengths of the six sticks. It is guaranteed that the input is such that you
 * cannot make both animals from the sticks.
 * 
 * 
 * Output
 * 
 * If you can make a bear from the given set, print string "Bear" (without the
 * quotes). If you can make an elephant, print string "Elephant" (wıthout the
 * quotes). If you can make neither a bear nor an elephant, print string "Alien"
 * (without the quotes).
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 
 * 4 2 5 4 4 4
 * 
 * 
 * 
 * Output 
 * Bear
 * 
 * 
 * Input 
 * 4 4 5 4 4 5
 * 
 * 
 * 
 * Output 
 * Elephant
 * 
 * 
 * Input 
 * 1 2 3 4 5 6
 * 
 * 
 * 
 * Output 
 * Alien
 * 
 * 
 * Note
 * 
 * If you're out of creative ideas, see instructions below which show how to
 * make a bear and an elephant in the first two samples. The stick of length 2
 * is in red, the sticks of length 4 are in green, the sticks of length 5 are in
 * blue.
 * 
 * A471MUHAndSticks.java
 * 
 * @author olivelv
 * @version time: Sep 8, 2015 9:18:23 PM
 */
public class A471MUHAndSticks {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int []a=new int[10];
		for(int i=0;i<6;i++){
			int val=cin.nextInt();
			a[val]++;
		}
		int i;
		for(i=1;i<=9;i++)
			if(a[i]>=4)break;
		if(i>9)System.out.println("Alien");
		else{
			a[i]-=4;
			for(i=1;i<=9;i++)
				if(a[i]==2)break;
			if(i<=9)System.out.println("Elephant");
			else
				System.out.println("Bear");
		}
	}
}
