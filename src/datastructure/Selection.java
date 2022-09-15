package datastructure;

public class Selection {
public static void selectionSort(int[] arr)
{
	for (int i=0;i<arr.length-1;i++)
	{
		int index=i;
		for(int j=i;j<arr.length;j++)
		{
			if(arr[j]<arr[index]) {
				index = j;
				
			}
		}
		int smallerNumber = arr[index];
		arr[index]=arr[i];
		arr[i]=smallerNumber;
	}
	
}
public static void main(String args[])
{
	int[] arr1 = {10, 14, 4, 3, 45, 12, 59, 29};
	System.out.println("Before sorting");
	for(int i:arr1)
	{
		System.out.print(i+ " ");
	}
	System.out.println();
	selectionSort(arr1);
	System.out.println("After sorting");
	for(int i:arr1)
	{
		System.out.print(i+ " ");
	}
}
}

		
	