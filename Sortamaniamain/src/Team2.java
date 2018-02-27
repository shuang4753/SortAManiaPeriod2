/**
 * SortAMania
 * @author Lingli Zou, Alyssa Ma, Lily Li
 * Period 2
 * 2/26/18
 */

public class Team2 {

	public class Team2 extends SortCompetition
	{
		public class Team2 extends SortCompetition
		{
			//Testing Code
			public static void main(String [] args)
			{
				
				//Challenge 1 10000 Rand Int Test
				int int1000 = Math.random()*10001;
				long start = System.nanoTime();
				challengeOne();
				long end = System.nanoTime();
				long time = end - start;
				
				//Challenge 2 10000 Rand String Test
				
				//Challenge 3 >75% Sorted Int Test
				
				//Challenge 4 int[1000][1000] Rand Test 
				
				//Challenge 5 1D Array Mystery Comparables
			}
		//challengeOne: Standard sort and process
		public abstract int challengeOne(int[] arr) 
		{
			//random number generator 
			//data set: an array of 10,000 random integers between 0-1000
			int temp=0;
			for(int outside=1; outside<list1.length; outside++)
			{
				for(int inside=outside; inside>0; inside--)
				{
					if(list1[inside]<list1[inside-1])
					{
						temp=list1[inside-1];
						list1[inside-1]=list1[inside];
						list1[inside]=temp;
					}
					else
					{
						break;
					}
				}
			}	
			
			return (arr.length/2)+1;
		}
		
		//challengeFour: Multidimensional sorting
		public abstract int challengeFour(int[][] arr)
		{
			//data set: a multidimensional array int[1000][1000] all elements are random int between 0-1000
			//sort each sub-array and sort the arrays by their medium value
			//return median of median array
			
			
		}
	}
	
}
