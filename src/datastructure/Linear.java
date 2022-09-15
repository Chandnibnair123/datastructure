package datastructure;

public class Linear {

	public static void main(String[] args) {
	int [] arr= {1,2,3,4,9,8,5};
	int item =9;
	int temp =0;
	for (int i=0; i<arr.length;i++)
	{
		if(arr[i]==item) {
			System.out.println("index position is "  +i);
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("index position is not found ");
	}
	}
}
		
			
		
	
	