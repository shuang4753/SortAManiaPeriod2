//Lingli's class
import java.util.Arrays;

public class Challenge4 {
	public static void main(String[] args)
	{
		int[] randArr= randomInts(1000);
		long start = System.nanoTime();
		challengeFour(randArr);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Challenge 4 took: "+ time + " nanoseconds");
		System.out.println(Arrays.toString(randArr));

	}
	
}
