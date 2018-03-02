import java.util.Random;
import java.util.Arrays;

public class challengeOne 
{

	public static void bubbleSort(int[] list1)
	{
		int o = list1.length;
		for(int i = 0; i < o - 1; i++) 		//swap counter
		{
			for(int j = 0; j < o - 1; j++)	//the one being checked
			{
				if(list1[j] > (list1[j + 1]))
				{
					swap(list1, j, j + 1);
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
