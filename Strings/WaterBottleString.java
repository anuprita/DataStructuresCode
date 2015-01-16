package Strings;

public class WaterBottleString {

public static void main(String args[])
{
	
	String a="waterbottle";
	String b="erbottlewatjjj";
	boolean bool = false;
	
	if(a.length()==b.length() && a.length()>0)
	{
	String longString=a+a;
	if(longString.contains(b))
	{
		bool=true;
	}
	if(bool)
	System.out.println("Yes");
	else
		System.out.println("No");
	}
	else
	{
		System.out.println("Strings are not of equal length therefore not rotation of each other");
	}
}
}
