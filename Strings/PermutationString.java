package Strings;
import java.util.*;
public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="anupa";
     String r="apuna";
     PermutationString p=new PermutationString();
     boolean b=p.checkPermutation(s,r);
     if(b)
			System.out.println(s+" and "+r+" are permutation strings" );
		else
			System.out.println(s+" and "+r+" are not permutation strings");
	}
	public String sort(String s)
	{
		char c[]=s.toCharArray();
		Arrays.sort(c);
		String newString= new String(c);
		return newString;
		
	}

	public boolean checkPermutation(String s, String r) {
		if(s.length()!=r.length())
		{
			return false;
		}
		return sort(s).equals(sort(r));
}
}