import java.util.Scanner;

/**
 * 
 In the popular spreadsheets systems (for example, in Excel) the following
 * numeration of columns is used. The first column has number A, the second —
 * number B, etc. till column 26 that is marked by Z. Then there are two-letter
 * numbers: column 27 has number AA, 28 — AB, column 52 is marked by AZ. After
 * ZZ there follow three-letter numbers, etc.
 * 
 * The rows are marked by integer numbers starting with 1. The cell name is the
 * concatenation of the column and the row numbers. For example, BC23 is the
 * name for the cell that is in column 55, row 23.
 * 
 * Sometimes another numeration system is used: RXCY, where X and Y are integer
 * numbers, showing the column and the row numbers respectfully. For instance,
 * R23C55 is the cell from the previous example.
 * 
 * Your task is to write a program that reads the given sequence of cell
 * coordinates and produce each item written according to the rules of another
 * numeration system.
 * 
 * 
 * Input
 * 
 * The first line of the input contains integer number n (1 ≤ n ≤ 105), the
 * number of coordinates in the test. Then there follow n lines, each of them
 * contains coordinates. All the coordinates are correct, there are no cells
 * with the column and/or the row numbers larger than 106 .
 * 
 * 
 * Output
 * 
 * Write n lines, each line should contain a cell coordinates in the other
 * numeration system.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 2 R23C55 BC23
 * 
 * 
 * 
 * Output BC23 R23C55
 * 
 * B1Spreadsheets.java
 * 
 * @author olivelv
 * @version time: Oct 4, 2015 9:30:36 PM
 */
public class B1Spreadsheets {
	public static boolean isSame(char a,char b){
		if(a>='A'&&a<='Z'&&b>='A'&&b<='Z')return true;
		if(a>='0'&&a<='9'&&b>='0'&&b<='9')return true;
		return false;
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int t=0;t<n;t++){
			String str=cin.next();
			String []s=new String[4];
			int k=0;
			s[k]="";
			char pre=str.charAt(0);
			s[k]+=pre;
			for(int i=1;i<str.length();i++){
				char val=str.charAt(i);
				if(isSame(val,pre))s[k]+=val;
				else{
					k++;
					s[k]=""+val;
				}
				pre=val;
			}
			k++;
			if(k==2){
				int c=0;
				for(int i=0;i<s[0].length();i++){
					char val=str.charAt(i);
					c=c*26+val-'A'+1;
				}
				System.out.println("R"+s[1]+"C"+c);
			}else if(k==4){
				int val=Integer.parseInt(s[3]);
				String res="";
				while(val!=0){
					int tmp=val%26;
					if(tmp==0)res+='Z';
					else
						res+=(char)(tmp+'A'-1);
					val/=26;
					if(tmp==0)val-=1;
				}
				for(int i=res.length()-1;i>=0;i--)System.out.print(res.charAt(i));
				System.out.println(s[1]);
			}
		}
	}
}
