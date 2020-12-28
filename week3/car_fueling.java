import java.util.Arrays;
import java.util.Scanner;

public class car_fueling {
	
	static int computeMinRefills(int dist, int tank, int[] stops) {
		int numRefills=0;
		int currentRefills=0;
		int tot=0;
		while(currentRefills<stops.length-1) {
			int lastRefill=currentRefills;
			while(currentRefills<stops.length-1 && stops[currentRefills+1]-stops[lastRefill]<=tank) {
					currentRefills++;
			}
			if(currentRefills==lastRefill )
				return -1;
			if(currentRefills<stops.length) {
				numRefills++;
				tot=stops[currentRefills];
			}
			
		}
		if((dist-tot)>tank) {
			return -1;
		}
		return numRefills;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int dist = sc.nextInt();   		/// distance between cities
		int tank = sc.nextInt();	 	/// max distance car can travel on full tank
		int ns = sc.nextInt();	 		/// No of gas stations
		
		int stops[]=new int[ns];
		
		for(int i=0;i<ns;i++) {
			stops[i]=sc.nextInt();
		}
		Arrays.sort(stops);
		System.out.println(computeMinRefills(dist, tank, stops));
	}

}
