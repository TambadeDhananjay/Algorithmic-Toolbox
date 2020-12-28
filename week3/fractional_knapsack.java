import java.util.Scanner;

public class fractional_knapsack {
	private static double getOptimalValue(int capacity, int[] values, int[] weights) {
		
		double value=0;
		for (int i =0; i< weights.length; i++) {
	    	if (capacity <=0) {
	    		return value;
	    	}

	    	int index = getMaxFract(values, weights);    //Get index of maximum fraction value by iterating every time in this function
	    	int a = Math.min(capacity, weights[index]);
	    	value += a * (double) values[index] / weights[index];								
	    	weights[index] -= a;																
	    	capacity -= a;																		
	    }
		
		return value;
	}
	
	// Array of values and weight need to be sorted first wrt fraction value.This function get max index of sorted array
	private static int getMaxFract(int [] values, int [] weights) {
		int maxIndex = 0;
		double maxValue = 0;
		for (int i = 0; i<values.length; i++ ) {
			if (weights[i] != 0 && ((double) values[i]) / weights[i]  > maxValue) {
					maxIndex = i;
					maxValue = ((double) values[i]) / weights[i];
			}
		}
		return maxIndex;	
 	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int values[]=new int[n];
		int wg[]=new int[n];
		
		for(int i=0;i<n;i++) {
			values[i]=sc.nextInt();
			wg[i]=sc.nextInt();
		}
		System.out.println(getOptimalValue(w,values,wg));
	}

}
