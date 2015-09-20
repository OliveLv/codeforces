import java.util.Scanner;

/**
 * The country of Byalechinsk is running elections involving n candidates. The
 * country consists of m cities. We know how many people in each city voted for
 * each candidate.
 * 
 * The electoral system in the country is pretty unusual. At the first stage of
 * elections the votes are counted for each city: it is assumed that in each
 * city won the candidate who got the highest number of votes in this city, and
 * if several candidates got the maximum number of votes, then the winner is the
 * one with a smaller index.
 * 
 * At the second stage of elections the winner is determined by the same
 * principle over the cities: the winner of the elections is the candidate who
 * won in the maximum number of cities, and among those who got the maximum
 * number of cities the winner is the one with a smaller index.
 * 
 * Determine who will win the elections.
 * 
 * Input 
 * The first line of the input contains two integers n, m (1 ≤ n, m ≤ 100)
 * — the number of candidates and of cities, respectively.
 * 
 * Each of the next m lines contains n non-negative integers, the j-th number in
 * the i-th line aij (1 ≤ j ≤ n, 1 ≤ i ≤ m, 0 ≤ aij ≤ 109) denotes the number of
 * votes for candidate j in city i.
 * 
 * It is guaranteed that the total number of people in all the cities does not
 * exceed 109.
 * 
 * Output 
 * Print a single number — the index of the candidate who won the
 * elections. The candidates are indexed starting from one.
 * 
 * Sample test(s) 
 * input 
 * 3 3 
 * 1 2 3 
 * 2 3 1 
 * 1 2 1 
 * output 
 * 2 
 * input 
 * 3 4 
 * 10 10 3 
 * 5 1 6 
 * 2 2 2 
 * 1 5 7 
 * output 
 * 1 
 * Note 
 * Note to the first sample test. At the first stage city 1 chosen candidate 3, city 2 chosen candidate 2, city 3 chosen candidate
 * 2. The winner is candidate 2, he gained 2 votes.
 * 
 * Note to the second sample test. At the first stage in city 1 candidates 1 and
 * 2 got the same maximum number of votes, but candidate 1 has a smaller index,
 * so the city chose candidate 1. City 2 chosen candidate 3. City 3 chosen
 * candidate 1, due to the fact that everyone has the same number of votes, and
 * 1 has the smallest index. City 4 chosen the candidate 3. On the second stage
 * the same number of cities chose candidates 1 and 3. The winner is candidate
 * 1, the one with the smaller index.
 * 
 * @Title: A570Elections.java
 * @author lxh
 * @date Sep 18, 2015 3:26:21 PM
 * 
 */

public class A570Elections {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		long [][]a=new long[m][n];
		int []b=new int[n];
		for(int i=0;i<m;i++){
			long max=Long.MIN_VALUE;
			int idx=0;
			for(int j=0;j<n;j++){
				a[i][j]=cin.nextLong();
				if(max<a[i][j]){
					max=a[i][j];
					idx=j;
				}
			}
			b[idx]++;
		}
		int max=Integer.MIN_VALUE;
		int idx=0;
		for(int i=0;i<n;i++)
			if(max<b[i]){
				max=b[i];
				idx=i+1;
			}
		System.out.println(idx);
		
	}
}
