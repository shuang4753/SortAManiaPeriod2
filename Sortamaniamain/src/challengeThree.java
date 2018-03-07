import java.util.Arrays;
/**
 * 
 * 
 * @author Alyssa Ma
 * 1
 *
 */
public abstract class challengeThree 
{
	//mostly sorted arr, sort and return median
	public static void main(String [] args)
	{
		int[]test1 = {3,4,9,8,5,10,7,5,6,11};
		
		long start = System.nanoTime();
		challengeTree(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Insertion sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(test1));
	}
	public static int[] challengeTree(int [] list1)
	{
		int x = list1.length;
	
		for(int i = 1 ; i < x; i++)
		{
			int y = list1[i];
			int z = i - 1;
			
			while(z >= 0 && list1[z] > y)
			{
				list1[z + 1] = list1[z];
				z = z - 1;
			}
			list1[z + 1] = y;
		}
		return list1;
	}
	
	public static int median(int [] list1)
	{
		int median = list1.length/2;
		
		if(list1.length % 2 == 1)
		{
			return list1[median]; 
		}
		else
		{
			return (list1[list1.length / 2] + ( list1[list1.length / 2 - 1])/2);
		}
	}
	
}
