package datastructure;

public class Binarystring {

	public static void main(String[] args) {
		String a[]= {"chandni","pooja","vasavi","priya"};
		String b = "vasavi";
	    int li=0;
		int hi = a.length-1;
		int mi=(li+hi)/2;
		
		while(li<=hi)
		{
			if(a[mi]==b)
			{
				System.out.println("element is present in the list " +mi+ " index position");
				break;
			}
			else if(b.compareTo(a[mi])>0)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
			}
		if(li>hi) 
		{
			System.out.println("element is not found");
		}
	}
}

			
			
		