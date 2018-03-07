import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {		
	
		//Testing arrays
				int [] test1 = {5,4,4,7,2,6,34,324,2,1,5,5357,2,54};
				String [] test3 = {"zebra" , "tortilla" , "abba" , "foo", "bar", "aba"};
				Random rand = new Random();
				int count = 50;
				int[] One = new int[count];
				for (int i = 0; i < count; i++) {
					One[i] = rand.nextInt(count);
				}
				int[] Two = One;
				int[] Three = One;
				int[] Four = One;
				Team7 sh = new Team7();

				//Selection Sort Test
				long start = System.nanoTime();
				Team7.selectionSort(One);
				long end = System.nanoTime();
				long time = end -start; 
				long avgTime = time/100 ; 
				System.out.println("Test1 took: " + avgTime + "nanoseconds");
				System.out.println(Arrays.toString(One));
				
				//Insertion Sort Test
				 start = System.nanoTime();
				Team7.challengeThree(Three);
				 end = System.nanoTime();
				 time = end -start; 
				System.out.println("Insertion took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(Three));
				
				
				//Bubble Sort Test
				start = System.nanoTime();
				ArrayMethods1.bubbleSort(Four);
				end = System.nanoTime();
				time = end - start ; 
				System.out.println("Test3 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(Four));
				

				Team7.selectionSort2(test3);
				

				

				

	}
				public static void newList()
				{
					Random rand1 = new Random();
					int[] One1 = new int[10000];
				}


	
	
	
	
	
	//selection 40790111
	//insertion 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


