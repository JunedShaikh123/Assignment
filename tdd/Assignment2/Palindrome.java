package Assignment2;

public class Palindrome {
	 static boolean isPalind(String s1, String s2)
	    {
	 
	       
	        int i = 0;
	        char s[]= s1.toCharArray();
	        int j=s.length-1;
	        while (i < j) {
	        char temp=s[i];
	        s[j]= temp;
	        i++;
            j--;
	           
	          
	        }
	        
	        String str = new  String(s);
	        if (str.equals(s2)&&str.equals(s1))
	        {
	        	System.out.println(s1+"is palindrome");
	        	 return true;
	        }
	        else
	        {
	        	System.out.println(s2+"not palindrome");
	        	return false;
	        }
	 
	      
	    }
	 
}
