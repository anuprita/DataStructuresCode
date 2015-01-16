package Strings;

public class CompressString {

	public String compress(StringBuffer s)
	{
		char c[]=new char[s.length()];
		int count=0;
		char prev='\0';
		s.getChars(0, s.length(), c, 0);
		for(int i=0;i<s.length();i++)
		{
			
			if(prev!=c[i])
			{
				count++;
			}
			prev=c[i];
		}
		char characterArray[]=new char[count];
		int counter[]=new int[count];
		for(int i=0;i<count;i++)
			counter[i]=0;
		prev='\0';
		int j=-1;
		for(int i=0;i<s.length();i++)
		{
			if(prev!=c[i])
			{
				characterArray[++j]=c[i];
				counter[j]++;
			}
			else
				counter[j]++;
			
			prev=c[i];
		}
		
		String compressed=new String();
		for(int i=0;i<count;i++)
		{
			System.out.println(characterArray[i]);
			String temp="";
			temp = temp + characterArray[i];
			temp = temp + counter[i];
			compressed = compressed.concat(temp);
			
		}
		if(count==s.length())
		{
			return s.toString();
		}
		else
			return compressed;
	}
	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer("aabccccccaa");
		CompressString c=new CompressString();
		String compressed=c.compress(sb);
		System.out.println("The compressed string is : "+compressed);
	}
	
}
