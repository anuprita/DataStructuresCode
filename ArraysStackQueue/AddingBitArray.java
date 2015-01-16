package ArraysStackQueue;

public class AddingBitArray {
	public static void main(String args[])
	{
		int a[]={1,0,1,0};
		int b[]={1,0,1,0};
		int c[]=new int[b.length+1];
		int temp;
		int carry=0;
		int i;
		for( i=a.length-1;i>=0;i--)
		{
			temp=a[i]+b[i]+carry;//0
			carry=0;
			if(temp==2)
			{
				temp=0;
				carry=1;
				
			}
			else if(temp==3)
			{
				temp=carry=1;
			}
			System.out.println((i+1)+":"+temp);
			c[i+1]=temp;//   10100
		}
		c[0]=carry;
		System.out.println("The addition array  c:");
		for(int j:c)
			System.out.print(j);
			
	}
}
