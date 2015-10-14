import java.util.Scanner;

/**
 * Vanya has a table consisting of 100 rows, each row contains 100 cells. The
 * rows are numbered by integers from 1 to 100 from bottom to top, the columns
 * are numbered from 1 to 100 from left to right.
 * 
 * In this table, Vanya chose n rectangles with sides that go along borders of
 * squares (some rectangles probably occur multiple times). After that for each
 * cell of the table he counted the number of rectangles it belongs to and wrote
 * this number into it. Now he wants to find the sum of values in all cells of
 * the table and as the table is too large, he asks you to help him find the
 * result.
 * 
 * Input 
 * The first line contains integer n (1 ≤ n ≤ 100) — the number of
 * rectangles.
 * 
 * Each of the following n lines contains four integers x1, y1, x2, y2
 * (1 ≤ x1 ≤ x2 ≤ 100, 1 ≤ y1 ≤ y2 ≤ 100), where x1 and y1 are the number of the
 * column and row of the lower left cell and x2 and y2 are the number of the
 * column and row of the upper right cell of a rectangle.
 * 
 * Output 
 * In a single line print the sum of all values in the cells of the
 * table.
 * 
 * Sample test(s) 
 * input 
 * 2 
 * 1 1 2 3 
 * 2 2 3 3 
 * output 
 * 10 
 * input 
 * 2 
 * 1 1 3 3 
 * 1 1 3 3
 * output 
 * 18 
 * Note 
 * Note to the first sample test:
 * 
 * Values of the table in the first three rows and columns will be as follows:
 * 
 * 121
 * 
 * 121
 * 
 * 110
 * 
 * So, the sum of values will be equal to 10.
 * 
 * Note to the second sample test:
 * 
 * Values of the table in the first three rows and columns will be as follows:
 * 
 * 222
 * 
 * 222
 * 
 * 222
 * 
 * So, the sum of values will be equal to 18.
 * 
 * @Title: A552VanyaAndTable.java
 * @author lxh
 * @date Oct 14, 2015 8:07:33 AM
 * 
 */

public class A552VanyaAndTable {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);	
		int n=cin.nextInt();
		int s=0;
		for(int i=0;i<n;i++){
			int x1=cin.nextInt();
			int y1=cin.nextInt();
			int x2=cin.nextInt();
			int y2=cin.nextInt();
			s+=(Math.abs(x1-x2)+1)*(Math.abs(y1-y2)+1);
		}
		System.out.println(s);
	}
}
