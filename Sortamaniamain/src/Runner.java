import java.util.Random;
import java.util.Arrays;

public class Runner 
{
	
	public static void main(String[] args)
	{
		int[] test = randomInts(20);
		System.out.println(Arrays.toString(test));
		challengeOne.bubbleSort(test);
		System.out.println(Arrays.toString(test));
		int med = test.length/2;
		System.out.println(test[med]);
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
