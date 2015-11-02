import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Sergey is testing a next-generation processor. Instead of bytes the processor
 * works with memory cells consisting of n bits. These bits are numbered from 1
 * to n. An integer is stored in the cell in the following way: the least
 * significant bit is stored in the first bit of the cell, the next significant
 * bit is stored in the second bit, and so on; the most significant bit is
 * stored in the n-th bit.
 * 
 * Now Sergey wants to test the following instruction:
 * "add 1 to the value of the cell". As a result of the instruction, the integer
 * that is written in the cell must be increased by one; if some of the most
 * significant bits of the resulting number do not fit into the cell, they must
 * be discarded.
 * 
 * Sergey wrote certain values ​​of the bits in the cell and is going to add one
 * to its value. How many bits of the cell will change after the operation?
 * 
 * Input The first line contains a single integer n (1 ≤ n ≤ 100) — the number
 * of bits in the cell.
 * 
 * The second line contains a string consisting of n characters — the initial
 * state of the cell. The first character denotes the state of the first bit of
 * the cell. The second character denotes the second least significant bit and
 * so on. The last character denotes the state of the most significant bit.
 * 
 * Output Print a single integer — the number of bits in the cell which change
 * their state after we add 1 to the cell.
 * 
 * Sample test(s) input 4 1100 output 3 input 4 1111 output 4 Note In the first
 * sample the cell ends up with value 0010, in the second sample — with 0000.
 * 
 * @Title: A465incARG.java
 * @author lxh
 * @date Nov 2, 2015 8:06:38 AM
 * 
 */

public class A465incARG {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		String s=cin.next();
		int base=1;
		for(;base<=n;base++)
			if(s.charAt(base-1)!='1')break;
		System.out.println(Math.min(base, n));
	}
}
