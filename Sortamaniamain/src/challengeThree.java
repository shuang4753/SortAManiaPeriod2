import java.util.Arrays;
/**
 * 
 * 
 * @author Alyssa Ma
 *
 */
public abstract class challengeThree 
{
	//mostly sorted arr, sort and return median
	public static void main(String [] args)
	{
		int[]test1 = {3,4,9,8,5,10,7,5};
		
		long start = System.nanoTime();
		challengeTree(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Insertion sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(test1));

	}
	public static void challengeTree(int [] list1)
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
		int median;
		
		if(list1.length % 2 == 0)
		{
			median = ((int) list1[list1.length / 2] + ((int) list1[list1.length / 2 - 1])/2);
		
		}
		else
		{
			median = (int) list1[list1.length / 2]; 
		}
		System.out.println(median);
	}
}
