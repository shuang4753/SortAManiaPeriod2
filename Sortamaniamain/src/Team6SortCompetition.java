import java.util.ArrayList;
import java.util.Random;

public class Team6SortCompetition extends SortCompetition
{

	@Override
	public int challengeOne(int[] x) 
	{
		int median;
		bubbleSortInt(x);
		if(x.length % 2 == 0) 
		{
			median = (((int)x[x.length/2] + (int)x[x.length-2/2])/2);
			//x.length returns set value in this case 10,000
			//We need the spots for the two numbers in the middle, in this case the 4,999 and 5,000
			//And we need the median of those 2 numbers thus the upper equation
			//-Andy
		} else 
		{
			median = (int)x[x.length+1/2];
			//On the contrary to find the median number of a odd number of arrays you would need the number in the midst of it all
			//For this purpose we could use the size of 5, where the middle number is the 3rd place thus we can get 3 with x.length+1/2
		}
		return median;
	}

	@Override
	public int challengeTwo(String[] arr, String query) 
	{
		
		return 0;
	}

	@Override
	public int challengeThree(int[] x) 
	{
		int median;
		insertionSort(x);
		if(x.length % 2 == 0)
		{
			median = (((int)x[x.length/2] + (int)x[x.length-2/2])/2);
		}
		else 
		{
			median = (int)x[x.length+1/2];	
		}
		return median;
	}

	@Override
	public int challengeFour(int[][] arr) 
	{
		return 0;
	}

	@Override
	public int challengeFive(Comparable[] arr, Comparable query) 
	{
		for(int x = 0; x < arr.length; x++) {
			if(query.compareTo(x) == 0) {
				return x;

			}
		}
		return -1;
	}


	@Override
	public String greeting() 
	{
		return "beep boop";
	}
	
	//helper methods
	public static void swap(int[]arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(String[]arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
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
	
	public static String[] randStrings(int lim, int size) 
	{
		String set = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder testString = new StringBuilder();
		Random a = new Random();
		ArrayList <String> randArr = new ArrayList <String> (lim);
		for(int x = 0; x < size; x++) 
		{
			while(testString.length() < size) 
			{
				int index = a.nextInt(set.length());
				testString.append(set.charAt(index));
			}
			String result = testString.toString();
			randArr.add(result);
		}
		return (String[]) randArr.toArray();
	}
	
	public static void bubbleSortInt(int[] list1)	
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
	
	public static void bubbleSortString(String[] list2) 
	{
		int x = list2.length;
		for(int i = 0; i < x; i++)
		{
            for(int y = 1; y < (x - i); y++)
            {
            	if(list2[y - 1].compareTo(list2[y]) > 0) 
            	{
                    swap(list2, y - 1, y);
                }
            }
		}
	}
	
	public static void insertionSort(int[] list3)
	{
		for(int x = 1; x < list3.length; x++)
		{
			int z = list3[x];
			int y = x - 1;
			while(y >= 0 && list3[y] > z) 
			{
				list3[y+1] = list3[y];
				y = y - 1;
			}
			list3[y+1] = z;
		}
	}

}
