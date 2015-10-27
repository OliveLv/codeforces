import java.util.Scanner;

/**
 * An exam for n students will take place in a long and narrow room, so the
 * students will sit in a line in some order. The teacher suspects that students
 * with adjacent numbers (i and i + 1) always studied side by side and became
 * friends and if they take an exam sitting next to each other, they will help
 * each other for sure.
 * 
 * Your task is to choose the maximum number of students and make such an
 * arrangement of students in the room that no two students with adjacent
 * numbers sit side by side.
 * 
 * Input 
 * A single line contains integer n (1 ≤ n ≤ 5000) — the number of
 * students at an exam.
 * 
 * Output 
 * In the first line print integer k — the maximum number of students who
 * can be seated so that no two students with adjacent numbers sit next to each
 * other.
 * 
 * In the second line print k distinct integers a1, a2, ..., ak (1 ≤ ai ≤ n),
 * where ai is the number of the student on the i-th position. The students on
 * adjacent positions mustn't have adjacent numbers. Formally, the following
 * should be true: |ai - ai + 1| ≠ 1 for all i from 1 to k - 1.
 * 
 * If there are several possible answers, output any of them.
 * 
 * Sample test(s) input 6 output 6 1 5 3 6 2 4 input 3 output 2 1 3
 * 
 * @Title: A534Exam.java
 * @author lxh
 * @date Oct 27, 2015 7:55:35 AM
 * 
 */

public class A534Exam {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if(n<=4){
			if(n==1)System.out.println(n+"\n"+n);
			if(n==2)System.out.println(1+"\n"+1);
			if(n==3)System.out.println(2+"\n"+1+" "+3);
			if(n==4){
				System.out.println(4);
				System.out.println(3+" "+1+" "+4+" "+2);
			}
		}else{
			System.out.println(n);
			for(int i=1;i<=n;i+=2){
				if(i!=1)System.out.print(" ");
				System.out.print(i);
			}
			for(int i=2;i<=n;i+=2)
				System.out.print(" "+i);
		}
		System.out.println();
	}
}
