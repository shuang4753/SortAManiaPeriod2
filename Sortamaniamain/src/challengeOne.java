import java.util.Random;
import java.util.Arrays;

public class challengeOne 
{
	
	//testing code, delete later
	public static void main(String[] args)
	{
		int[] test = randomInts(20);
		System.out.println(Arrays.toString(test));
		bubbleSort(test);
		System.out.println(Arrays.toString(test));
		int med = test.length/2;
		System.out.println(test[med]);
	}
	public static int[] randomInts(int lim)
	{
		int[]randArr = new int[lim];
		Random a = new Random();
		for(int x = 0; x < lim; x++)
		{
			randArr[x] = a.nextInt(lim);
		}
		return randArr;
	}
	
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
