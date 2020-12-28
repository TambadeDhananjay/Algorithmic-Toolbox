import java.util.Scanner;

public class fibonacci_last_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n+1;i++) {
			arr[i]=(arr[i-1]+arr[i-2])%10;
		}
		System.out.println(arr[n]);
	}

}