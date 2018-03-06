import java.util.Arrays;
import java.util.Random;

public class challengeFour 
{
	//sort each arrray
	//you find the middle
	//sort by the middle
	public static void main(String[] args)
	{	int[][] test4 = multiInts(10000);
		System.out.println("Unsorted Array for Challenge Four: " + Arrays.toString(test4));
		long start = System.nanoTime();
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
		
	//above delete later, stolen from runner?
	public static void bubbleSortAll(int[][] list4)
	{
		for(int i = 0; i < )
	}
	
	public static void bubbleSort(int[] list4)
	{
		int o = list4.length;
		for(int i = 0; i < o - 1; i++) 		//swap counter
		{
			for(int j = 0; j < o - 1; j++)	//the one being checked
			{
				if(list4[j] > (list4[j + 1]))
				{
					swap(list4, j, j + 1);
				}
			}
		}
	}
		
		public static void swap(int[]arr, int index1, int index2)
		{
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
}
