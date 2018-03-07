//Lingli's class
import java.util.Arrays;

public class Challenge4 {
	public static void main(String[] args)
	{
		
        double[][] array = new double[1000][1000];
		long start = System.nanoTime();
		challengeFour();
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Challenge 4 took: "+ time + " nanoseconds");

	}

	private static int[]randomInts(int len)
	{
		int[] list1 = new int[len];
		
		for (int i = 0; i<list1.length-1; i++)
		{
			list1[i]=(int)(Math.random()*10000);
		}
	
		return list1;
	}
	
	
	public static int challengeFour(double[][])
	{
		
	}
}
