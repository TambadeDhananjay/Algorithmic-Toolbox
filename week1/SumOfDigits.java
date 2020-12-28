import java.util.Scanner;

class SumOfDigits{
	static int SumOfDigits(int dig1,int dig2) {
		return dig1+dig2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(SumOfDigits(a,b));
	}
}