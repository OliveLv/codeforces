import java.util.Scanner;

/**   
 * @Title: A611NewYearandDays.java 
 * @author olive 
 * @date Apr 25, 2016 8:48:09 PM  
 * 
 */

public class A611NewYearandDays {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int[]days={31,29,31,30,31,30,31,31,30,31,30,31};
		while(cin.hasNext()){
			int x=cin.nextInt();
			String str=cin.nextLine();
			int res=0;
			if(str.equals(" of week")){
				res=(366-3)/7;
				int tmp=366-res*7-3;
				if(x>=5)res++;
				if(x<=tmp)res++;
			}else{
				for(int i=0;i<days.length;i++){
					if(x<=days[i])res++;
				}
			}
			
			System.out.println(res);
		}
	}
}
