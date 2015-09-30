import java.util.Scanner;

/**   
 * @Title: A560CurrencySystemInGeraldion.java 
 * @author lxh  
 * @date Sep 30, 2015 9:35:09 AM  
 * 
 */

public class A560CurrencySystemInGeraldion {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			if(val==1)flag=true;
		}
		if(flag)System.out.println(-1);
		else
			System.out.println(1);
	}
}
