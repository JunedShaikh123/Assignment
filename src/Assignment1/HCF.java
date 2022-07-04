package Assignment1;


public class HCF
{ 
	public static int Code (int a,int b)
	  {
	    int num1 = a, num2 = b, hcf=0;

	    for (int i = 1; i <= num1 || i <= num2; i++)
	      {
	     if (num1 % i == 0 && num2 % i == 0)
	        hcf = i;
	      }

	   
		return hcf;
	  }
	}
