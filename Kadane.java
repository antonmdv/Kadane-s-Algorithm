import java.util.*;

public class Kadane {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int T = sc.nextInt(); //Number of Test Cases - each Test Case is a separate Array
		
		if((T >= 1) && (T <= 200)){
			
			int[] MaxSum = new int[T];
			
			for(int i = 0; i<T; i++){ // For each test case
				
				int N = sc.nextInt(); // Length of the array
				
				if((N >=1 ) && (N <= 1000)){
					
					int[] TestCase = new int[N];
					
					for(int j = 0; j<TestCase.length; j++){ //Fill the test case
						TestCase[j] = sc.nextInt();
					}
					
					MaxSum[i] = KadaneAlgorithm(TestCase); //Find max subarray sum of the array 
					
					// Calculate the biggest sum
					
				}else{
					System.out.println("Case Description Error");
				}
			}
		
		for(int i = 0; i<T; i++){
			System.out.println(MaxSum[i]);
		}	
			
		}else{
			System.out.println("Number Of Test Cases Error");
		}
		

	}
	
	public static int KadaneAlgorithm(int[] TestCase){
		
		int max_current = TestCase[0];	//Current Maximum Subarray 
		int max_global = max_current;	//Maximum Subarray
		
		for(int i = 1; i<TestCase.length; i++){
			max_current = Max(TestCase[i],max_current + TestCase[i]);
			
			if(max_current > max_global){
				max_global = max_current;
			}
		}
		
		return max_global;	
	}
	
	public static int Max(int a, int b){
		int max = a;
		if(a<b){
			max = b;
		}
		return max;
	}

}
