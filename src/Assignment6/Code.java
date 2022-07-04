package Assignment6;

public class Code {
	public static int count (String name) {
		int count = 0;
		
		
		for (int q =0; q<name.length();q++)
		{
			if (name.charAt(q)=='a'|| name.charAt(q)=='e'|| name.charAt(q)=='i'||name.charAt(q)=='o'|| name.charAt(q)=='u')
			{
				count++;
			
			}
			
		}
		
		return count;
	}

}
