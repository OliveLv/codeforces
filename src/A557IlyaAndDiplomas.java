import java.util.Scanner;

/**
 * Soon a school Olympiad in Informatics will be held in Berland, n
 * schoolchildren will participate there.
 * 
 * At a meeting of the jury of the Olympiad it was decided that each of the n
 * participants, depending on the results, will get a diploma of the first,
 * second or third degree. Thus, each student will receive exactly one diploma.
 * 
 * They also decided that there must be given at least min1 and at most max1
 * diplomas of the first degree, at least min2 and at most max2 diplomas of the
 * second degree, and at least min3 and at most max3 diplomas of the third
 * degree.
 * 
 * After some discussion it was decided to choose from all the options of
 * distributing diplomas satisfying these limitations the one that maximizes the
 * number of participants who receive diplomas of the first degree. Of all these
 * options they select the one which maximizes the number of the participants
 * who receive diplomas of the second degree. If there are multiple of these
 * options, they select the option that maximizes the number of diplomas of the
 * third degree.
 * 
 * Choosing the best option of distributing certificates was entrusted to Ilya,
 * one of the best programmers of Berland. However, he found more important
 * things to do, so it is your task now to choose the best option of
 * distributing of diplomas, based on the described limitations.
 * 
 * It is guaranteed that the described limitations are such that there is a way
 * to choose such an option of distributing diplomas that all n participants of
 * the Olympiad will receive a diploma of some degree.
 * 
 * Input 
 * The first line of the input contains a single integer n (3 ≤ n ≤ 3·106)
 * — the number of schoolchildren who will participate in the Olympiad.
 * 
 * The next line of the input contains two integers min1 and max1
 * (1 ≤ min1 ≤ max1 ≤ 106) — the minimum and maximum limits on the number of
 * diplomas of the first degree that can be distributed.
 * 
 * The third line of the input contains two integers min2 and max2
 * (1 ≤ min2 ≤ max2 ≤ 106) — the minimum and maximum limits on the number of
 * diplomas of the second degree that can be distributed.
 * 
 * The next line of the input contains two integers min3 and max3
 * (1 ≤ min3 ≤ max3 ≤ 106) — the minimum and maximum limits on the number of
 * diplomas of the third degree that can be distributed.
 * 
 * It is guaranteed that min1 + min2 + min3 ≤ n ≤ max1 + max2 + max3.
 * 
 * Output 
 * In the first line of the output print three numbers, showing how many
 * diplomas of the first, second and third degree will be given to students in
 * the optimal variant of distributing diplomas.
 * 
 * The optimal variant of distributing diplomas is the one that maximizes the
 * number of students who receive diplomas of the first degree. Of all the
 * suitable options, the best one is the one which maximizes the number of
 * participants who receive diplomas of the second degree. If there are several
 * of these options, the best one is the one that maximizes the number of
 * diplomas of the third degree.
 * 
 * Sample test(s) input 6 1 5 2 6 3 7 output 1 2 3 input 10 1 2 1 3 1 5 output 2
 * 3 5 input 6 1 3 2 2 2 2 output 2 2 2
 * 
 * @Title: A557IlyaAndDiplomas.java
 * @author lxh
 * @date Oct 27, 2015 8:14:36 AM
 * 
 */

public class A557IlyaAndDiplomas {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int min1=cin.nextInt();
		int max1=cin.nextInt();
		int min2=cin.nextInt();
		int max2=cin.nextInt();
		int min3=cin.nextInt();
		int max3=cin.nextInt();
		int tmp=n-min1-min2-min3;
		if(tmp<=max1-min1){
			System.out.println((min1+tmp)+" "+min2+" "+min3);
		}else{
			tmp-=max1-min1;
			if(tmp<=max2-min2){
				System.out.println(max1+" "+(min2+tmp)+" "+min3);
			}else{
				tmp-=max2-min2;
				System.out.println(max1+" "+max2+" "+(min3+tmp));
			}
		}
	}
}
