import java.util.Scanner;

public class lcm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		System.out.println(a*b/GCD(a,b));
		
	}
	
	public static long GCD(long a,long b) {
		if(a==0) {
			return b;
		}
		else {
			return GCD(b%a,a);
		}
	}

}
