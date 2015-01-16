package Sort;
// ascending order(non-decresing order)
public class InsertionSort {

	public static void main(String args[])
	{
		int a[]={5,2,4,6,1,3};
		System.out.println("Before insertion sort , array is :");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("after insertion sort , array is :");
		int key;
		int j;
		for(int i=1;i<a.length;i++)
		{
			key=a[i];
			for(j=i-1;j>=0;j--)
			{
				if(a[j]>key)
				{
					a[j+1]=a[j]; //shift elements by one position to the right
			     }
				else
				 break; // once you know that the key is not smaller break the loop as the elements
				       //in the left array are sorted
			}
			a[j+1]=key;
			
			
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		//descending order
		int b[]={34,45,67,1,23};
		System.out.println("Before insertion sort , array is :");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println("after insertion sort , array is :");
		int key2;
		int j2;
		for(int i=1;i<b.length;i++)
		{
			key2=b[i];
			for(j2=i-1;j2>=0;j2--)
			{
				if(b[j2]<key2)
				{
					b[j2+1]=b[j2]; //shift elements by one position to the right
			     }
				else
				 break; // once you know that the key is not smaller break the loop as the elements
				       //in the left array are sorted
			}
			b[j2+1]=key2;
			
			
		}
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		
	}
	
}
