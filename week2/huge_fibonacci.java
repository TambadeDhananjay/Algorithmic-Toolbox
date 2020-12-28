import java.util.Scanner;

public class huge_fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int m=sc.nextInt();
		System.out.println(fibonacciModulo(n,m));
	}
	
	
	public static long pisano(long n,long m)
	{
	    long prev = 0;
	    long curr = 1;
	    long res = 0;
	     
	    for(int i = 0; i < m * m; i++)
	    {
	        long temp = 0;
	        temp = curr;
	        curr = (prev + curr) % m;
	        prev = temp;
	         
	        if (prev == 0 && curr == 1)
	            res= i + 1; 
	    }
	    return n%res;
	}
	 

	public static long fibonacciModulo(long n, 
	                                   long m)
	{
	     
	    // Getting the period 
	    n=pisano(n,m);
	   
	     
	    long prev = 0;
	    long curr = 1;
	     
	    if (n == 0) 
	        return 0;
	    else if (n == 1)
	        return 1;
	     
	    for(int i = 0; i < n - 1; i++)
	    {
	        long temp = 0;
	        temp = curr;
	        curr = (prev + curr) % m;
	        prev = temp;
	    }
	    return curr % m;
	}
}
