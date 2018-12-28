package strings;

import java.util.Scanner;

public class charcount {
	void chrr(String S) {	
	int count =0;
	for(int i=0;i<S.length();i++)
	{
		if(S.charAt(i)=='a')
		{
			count++;
		}
	}
	System.out.println(count);
	//return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*String s = "Ravi";
		Srtring s1 = "chandra"*/
		int count =0;
		String s = sc.nextLine();
		/*for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}*/
		
	charcount c = new charcount();
		c.chrr(s);
		//System.out.println(c.chrr(count));		
}
}



