package datastructure;

public class Linearstring {

	public static void main(String[] args) {
		String [] arr= {"chandni","pooja","priya","vasavi"};
		String item ="pooja";
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
			
				
			