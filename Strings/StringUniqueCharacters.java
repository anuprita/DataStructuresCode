package Strings;

public class StringUniqueCharacters {

	public boolean checkIfUnique(String s)
	{
		//time complexity O(n*2) space complexity O(1)
	/* char a[]=s.toCharArray();
	 for(int i=0;i<a.length;i++)
	  {
		 char temp=a[i];
		 for(int j=0;j<a.length;j++)
		 {
			 if(temp==a[j] && i!=j)
			 {
				 return false;
				 
			 }
			
		 }
	  }
	 return true;
	 */
		
		
		//without using any data structure like character array
		//time complexity O(n*2) space complexity O(1)
		for(int i=0;i<s.length();i++)
		{
			char a= s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(a==s.charAt(j) && i!=j)
				{
					return false;
				}
			}
		}
		return true;
		
		
	}
	
	public static void main(String args[])
	{
		String s="Anupa";
		StringUniqueCharacters su=new StringUniqueCharacters();
		boolean b=su.checkIfUnique(s);
		if(b)
			System.out.println(s+" has unique characters!");
		else
			System.out.println(s+" doesnt have unique characters!");
	}
}
