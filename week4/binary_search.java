import java.io.BufferedReader;
import java.io.InputStreamReader;

class binary_search {
	static long binarySearch(long arr[], long l, long r, long x) { 
        if (r >= l) { 
            int mid =(int)(l + (r - l) / 2);  
            if (arr[mid] == x) 
                return mid; 
  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    }  

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		String[] str1=br.readLine().split(" ");
		String[] str2=br.readLine().split(" ");
		int n=Integer.parseInt(str1[0]);
		long k=Integer.parseInt(str2[0]);
		long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(str1[i+1]);
		}
		for(int i=1;i<=k;i++) {
			long x=Integer.parseInt(str2[i]);
			long res=binarySearch(arr, 0, n-1, x);
			sb.append(res+" ");
		}
		System.out.println(sb);
	}

}
