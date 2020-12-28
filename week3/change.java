//Money Change
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class change{
	 private static long getChange(long n) {
		 long count=0;
		 while(n>0) {
				if(n>=10) {
					n=n-10;
					count++;
				}
				else if(n>=5 && n<10) {
					n=n-5;
					count++;
				}
				else if(n>0 && n<5) {
					n=n-1;
					count++;
				}
			}
	        return count;
	    }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		long n = Integer.parseInt(st.nextToken()); 
		System.out.println(getChange(n));
	}

}