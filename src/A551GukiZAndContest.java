import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Professor GukiZ likes programming contests. He especially likes to rate his
 * students on the contests he prepares. Now, he has decided to prepare a new
 * contest.
 * 
 * In total, n students will attend, and before the start, every one of them has
 * some positive integer rating. Students are indexed from 1 to n. Let's denote
 * the rating of i-th student as ai. After the contest ends, every student will
 * end up with some positive integer position. GukiZ expects that his students
 * will take places according to their ratings.
 * 
 * He thinks that each student will take place equal to . In particular, if
 * student A has rating strictly lower then student B, A will get the strictly
 * better position than B, and if two students have equal ratings, they will
 * share the same position.
 * 
 * GukiZ would like you to reconstruct the results by following his
 * expectations. Help him and determine the position after the end of the
 * contest for each of his students if everything goes as expected.
 * 
 * Input 
 * The first line contains integer n (1 ≤ n ≤ 2000), number of GukiZ's
 * students.
 * 
 * The second line contains n numbers a1, a2, ... an (1 ≤ ai ≤ 2000) where ai is
 * the rating of i-th student (1 ≤ i ≤ n).
 * 
 * Output 
 * In a single line, print the position after the end of the contest for
 * each of n students in the same order as they appear in the input.
 * 
 * Sample test(s) 
 * input 
 * 3 
 * 1 3 3 
 * output 
 * 3 1 1 
 * input 
 * 1 
 * 1 
 * output 
 * 1 
 * input 
 * 5 
 * 3 5 3 4 5 
 * output 
 * 4 1 4 3 1 
 * Note 
 * In the first sample, students 2 and 3 are positioned
 * first (there is no other student with higher rating), and student 1 is
 * positioned third since there are two students with higher rating.
 * 
 * In the second sample, first student is the only one on the contest.
 * 
 * In the third sample, students 2 and 5 share the first position with highest
 * rating, student 4 is next with third position, and students 1 and 3 are the
 * last sharing fourth position.
 * 
 * @Title: A551GukiZAndContest.java
 * @author lxh
 * @date Sep 15, 2015 9:37:06 AM
 * 
 */

public class A551GukiZAndContest {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		Student []student=new Student[n];
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			student[i]=new Student(val,i+1);
		}
		Arrays.sort(student,new Comparator1());
		int pre=student[0].val;
		student[0].rank=1;
		int ans=1;
		for(int i=0;i<n;i++){
			if(student[i].val==pre)student[i].rank=ans;
			else{
				pre=student[i].val;
				student[i].rank=i+1;
				ans=i+1;
			}
		}
		Arrays.sort(student, new Comparator2());
		for(int i=0;i<n;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(student[i].rank);
		}
		System.out.println();
	}
}
class Comparator1 implements Comparator<Student>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.val-s1.val;
	}
	
}
class Comparator2 implements Comparator<Student>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.idx-s2.idx;
	}
	
}
class Student{
	int val;
	int idx;
	int rank;
	public Student(int val,int idx){
		this.val=val;
		this.idx=idx;
		rank=0;
	}
	public String toString(){
		return val+" "+idx+" "+rank;
	}
}