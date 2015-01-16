package Sort;

public class QuickSort {
   public void quicksort(int[] a,int first, int last )
   {
	   int pivotIndex=last;
	   for(int i=0;i<a.length;i++)
	   {
		if(first>=last)
			return;
		else{
	   if(i<pivotIndex && a[i]>a[pivotIndex])
	   	{
		   
		   int temp = a[i];
		   a[i]=a[pivotIndex];
		   a[pivotIndex]=temp;
		   pivotIndex=i;
	   	}
	   else if(i>pivotIndex && a[i]<a[pivotIndex])
	   {
		   int temp = a[i];
		   a[i]=a[pivotIndex];
		   a[pivotIndex]=temp;
		   pivotIndex=i;
	   }
		}
	   for (int j=0;j<a.length;j++)
	   {
		   System.out.print(a[j]+" ");
	   }   
	   System.out.println();
	   }
	   System.out.println("----------------");
	   quicksort(a,first,pivotIndex-1);
	   quicksort(a,pivotIndex+1,last);
	   
   }
	public static void main(String[] args) {
		int array[]={9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
		
		QuickSort quick=new QuickSort();
		quick.quicksort(array,0,array.length-1);
		

	}

}
