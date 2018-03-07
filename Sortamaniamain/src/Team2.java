import java.util.Arrays;

/**
 * SortAMania
 * @author Lingli Zou, Alyssa Ma, Lily Li
 * Period 2
 * 2/26/18
 */

public class Team2 {

	public class Team2 extends SortCompetition
	{
		public static void main(String [] args)
		{
			
			//Challenge 1 10000 Rand Int Test
				
			int[] randArr= randomInts(1000);
			long start = System.nanoTime();
			challengeOne(randArr);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("Challenge 1 took: "+ time + " nanoseconds");
			System.out.println(Arrays.toString(randArr));
				
				//Challenge 2 10000 Rand String Test
				
				//Challenge 3 >75% Sorted Int Test
				
				//Challenge 4 int[1000][1000] Rand Test 
				
				//Challenge 5 1D Array Mystery Comparables
		}
			
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
	//challengeOne: Standard sort and process
	public static int challengeOne(int[] arr) 
	{
		//random number generator 
		//data set: an array of 10,000 random integers between 0-1000
		insertionSort(arr);
		
		int middle = (arr.length/2);

	    if (arr.length%2==1) 
	    {
	    	return arr[middle];
	    } 
	    
	    else 
	    {
	    	return (arr[middle-1] + arr[middle])/2;	
	    }
	}
	
	private static void insertionSort(int[] arr)
	{
		int temp=0;
		for(int outside=1; outside<arr.length; outside++)
		{
				for(int inside=outside; inside>0; inside--)
				{
					if(arr[inside]<arr[inside-1])
					{
						temp=arr[inside-1];
						arr[inside-1]=arr[inside];
						arr[inside]=temp;
					}
					else
					{
						break;
					}
				}
			}
		}

}

