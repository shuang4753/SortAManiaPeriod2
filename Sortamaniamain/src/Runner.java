import java.util.Random;
import java.util.Arrays;

public class Runner 
{
	
	public static void main(String[] args)
	{
		int[] test = randomInts(10000);
		System.out.println("Unsorted Array: " + Arrays.toString(test));
		long start = System.nanoTime();
		challengeOne.bubbleSort(test);
		int med = test.length/2;
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Sorted Array: " + Arrays.toString(test));
		System.out.println("The median of this array is " + test[med] + ".");
		System.out.println("Challenge One took: " + time + " nanoseconds.");		
	}
	
	public static int[] randomInts (int lim)
	{
		int[] randArr = new int[lim];
		Random a = new Random();
		for(int x = 0; x<lim; x++)
		{
			randArr[x] =a.nextInt(lim);
		}
		return randArr;
	}
	
	public static int[][] multiInts (int lim)
	{
		int[][] randArr = new int[lim][lim];
		Random a = new Random();
		for(int x = 0; x < randArr.length; x++)
		{
			for (int y = 0; y < randArr[x].length; y++)
			{
				randArr[x][y] = a.nextInt(lim);
			}
		}
		return randArr;
	}
	
	
	
	
	
}
