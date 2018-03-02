import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {		
	
		//Testing arrays
				int [] test1 = {5,4,4,7,2,6,34,324,2,1,5,5357,2,54};
				Random rand = new Random();
				int[] One = new int[10000];
				for (int i = 0; i < 10000; i++) {
					One[i] = rand.nextInt(10000);
				}
				Team7 sh = new Team7();
				
				//Insertion Sort Test
				long start = System.nanoTime();
				sh.challengeOne(test1);
				System.out.println(sh.challengeOne(One));
				long end = System.nanoTime();
				long time = end -start; 
				System.out.println("Test1 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(One));
				
				


	
	}
	
	
	
	//selection 40790111
	//insertion 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


