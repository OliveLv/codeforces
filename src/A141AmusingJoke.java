import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * So, the New Year holidays are over. Santa Claus and his colleagues can take a
 * rest and have guests at last. When two "New Year and Christmas Men" meet,
 * thear assistants cut out of cardboard the letters from the guest's name and
 * the host's name in honor of this event. Then the hung the letters above the
 * main entrance. One night, when everyone went to bed, someone took all the
 * letters of our characters' names. Then he may have shuffled the letters and
 * put them in one pile in front of the door.
 * 
 * The next morning it was impossible to find the culprit who had made the
 * disorder. But everybody wondered whether it is possible to restore the names
 * of the host and his guests from the letters lying at the door? That is, we
 * need to verify that there are no extra letters, and that nobody will need to
 * cut more letters.
 * 
 * Help the "New Year and Christmas Men" and their friends to cope with this
 * problem. You are given both inscriptions that hung over the front door the
 * previous night, and a pile of letters that were found at the front door next
 * morning.
 * 
 * Input 
 * The input file consists of three lines: the first line contains the
 * guest's name, the second line contains the name of the residence host and the
 * third line contains letters in a pile that were found at the door in the
 * morning. All lines are not empty and contain only uppercase Latin letters.
 * The length of each line does not exceed 100.
 * 
 * Output 
 * Print "YES" without the quotes, if the letters in the pile could be
 * permuted to make the names of the "New Year and Christmas Men". Otherwise,
 * print "NO" without the quotes.
 * 
 * Sample test(s) 
 * input 
 * SANTACLAUS 
 * DEDMOROZ 
 * SANTAMOROZDEDCLAUS 
 * output 
 * YES 
 * input
 * PAPAINOEL 
 * JOULUPUKKI 
 * JOULNAPAOILELUPUKKI 
 * output 
 * NO 
 * input 
 * BABBONATALE
 * FATHERCHRISTMAS 
 * BABCHRISTMASBONATALLEFATHER 
 * output 
 * NO 
 * Note 
 * In the first sample the letters written in the last line can be used to write the names
 * and there won't be any extra letters left.
 * 
 * In the second sample letter "P" is missing from the pile and there's an extra
 * letter "L".
 * 
 * In the third sample there's an extra letter "L".
 * 
 * @Title: A141AmusingJoke.java
 * @author lxh
 * @date Aug 29, 2015 7:04:50 PM
 * 
 */

public class A141AmusingJoke {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String str1=cin.next();
		String str2=cin.next();
		String str=cin.next();
		int n1=str1.length();
		int n2=str2.length();
		int n=str.length();
		if(n1+n2!=n){
			System.out.println("NO");
			return ;
		}
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(int i=0;i<n1;i++){
			String val=String.valueOf(str1.charAt(i));
			int cnt=0;
			if(map.containsKey(val))cnt=map.get(val);
			map.put(val, cnt+1);
		}
		for(int i=0;i<n2;i++){
			String val=String.valueOf(str2.charAt(i));
			int cnt=0;
			if(map.containsKey(val))cnt=map.get(val);
			map.put(val, cnt+1);
		}
		for(int i=0;i<n;i++){
			String val=String.valueOf(str.charAt(i));
			int cnt=0;
			if(map.containsKey(val))cnt=map.get(val);
			else{
				System.out.println("NO");
				return ;
			}
			map.put(val, cnt-1);
		}
		for(String ele:map.keySet()){
			int val=map.get(ele);
			if(val!=0){
				System.out.println("NO");
				return ;
			}
		}
		System.out.println("YES");
	}
}
