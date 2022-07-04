package Assignment8;

public class EvenOrNot8 {
	public static int even (int a[]) {
		int count =0;
		System.out.println("Even numbers");
		for (int i= 0; i<9; i++)
		{
	
		
		
			if (a[i] % 2== 0) {
				System.out.println((a[i]+""));
			    count++;
		}
		
		
		}
		System.out.println(count);
		return count;
	}
	
}