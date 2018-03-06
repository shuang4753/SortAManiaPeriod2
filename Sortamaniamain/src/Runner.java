import java.util.Random;
import java.util.Arrays;

public class Runner 
{
	
	public static void main(String[] args)
	{
		int[] test1 = randomInts(10000);
		System.out.println("Unsorted Array for Challenge One: " + Arrays.toString(test1));
		long start = System.nanoTime();
		challengeOne.bubbleSort(test1);
		int med = test1.length/2;
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Sorted Array: " + Arrays.toString(test1));
		System.out.println("The median of this array is " + test1[med] + ".");
		System.out.println("Challenge One took: " + time + " nanoseconds.");		
		System.out.println();
		
		int[][] test4 = multiInts(10000);
		System.out.println("Unsorted Array for Challenge Four: " + Arrays.toString(test4));
		start = System.nanoTime();
		//challengdsgn
		
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
