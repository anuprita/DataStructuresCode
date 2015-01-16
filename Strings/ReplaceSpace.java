package Strings;

public class ReplaceSpace {
	
	public StringBuffer replace(StringBuffer sb)
	{
		
		for(int i=0;i<sb.length();i++)
		{
			char c[] = new char[sb.length()];
			sb.getChars(0, sb.length(), c, 0);
			
			if(c[i]==' ')
			{
				sb.replace(i,i+1,"0");
				sb.insert(i,"%2");
				i = i+2;	
			}
		}
		return sb;
	}
	
	
	
public static void main(String a[])
{
	StringBuffer s= new StringBuffer("Anu is an idiot woman!");
	ReplaceSpace rep=new ReplaceSpace();
	s=rep.replace(s);
	
	System.out.println("The new replaced string is "+s);
}
}
