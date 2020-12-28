import java.util.*;

public class different_summands {
	private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        
        int sum=0,current=1;
        while(true) {
        	int remain=n-sum;
        	int remainafterappend=remain-current;
        	if(remainafterappend >current) {
        		sum+=current;
        		summands.add(current);
        		current++;
        		continue;
        	}
        	else {
        		summands.add(remain);
        		break;
        	}
        	
        }
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }

}