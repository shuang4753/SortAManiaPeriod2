public class challengeThree 
{

	public static void insertionSort(int[] list1)
	{
		for(int x = 1; x < list1.length; x++)
		{
			int z = list1[x];
			int y = x - 1;
			while(y >= 0 && list1[y] > z) 
			{
				list1[y+1] = list1[y];
				y = y - 1;
			}
			list1[y+1] = z;
		}
	}
	
	
	
}
