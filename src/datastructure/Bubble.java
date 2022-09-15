package datastructure;

public class Bubble
{
	static void print(int a[])
	{
		int n=a.length;
		int i;
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
	static void bubbleSort(int a[])
	{
		int n = a.length;
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j] < a[i])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
				
				
		public static void main(String[] args)
		{
			int a[]= {36,11,32,12,27};
			Bubble b1 = new Bubble();
			System.out.println("Before sorting");
			b1.print(a);
			b1.bubbleSort(a);
			System.out.println();
			System.out.println("after sorting");
			b1.print(a);
		}
	}
	