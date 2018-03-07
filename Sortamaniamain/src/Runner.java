import java.util.Random;
import java.util.Arrays;

public class Runner 
{
	
	public static void main(String[] args) {
		int[] test1 = randomInts(10000);
		System.out.println(Arrays.binarySearch(test1, 1000 ));
		//challengeOne(test1);
		
		int[][] test4 = multiInts(10000);
		System.out.println("Unsorted Array for Challenge Four: " + Arrays.toString(test4));
		//challengdsgn
		
	}
	
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
	
	public static void bubbleSortString(String[] list1) {
		int x = list1.length;
		for(int i=0; i < x; i++){
            for(int y=1; y < (x-i); y++){
            	if(list1[y-1].compareTo(list1[y]) > 0) {
                    swap(list1,y-1,y);
                    }
            }
		}
	}

	
	public static void challengeOne(int[] x) {
		System.out.println("Unsorted Array for Challenge One: " + Arrays.toString(x));
		long start = System.nanoTime();
		bubbleSortInt(x);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Sorted Array: " + Arrays.toString(x));
		if(x.length % 2 == 0) {
			System.out.println("The median of this array is " + (((double)x[x.length/2]+(double)x[x.length-2/2])/2));
			//x.length returns set value in this case 10,000
			//We need the spots for the two numbers in the middle, in this case the 4,999 and 5,000
			//And we need the median of those 2 numbers thus the upper equation
			//-Andy
		} else {
			System.out.println("The median of this array is " + (double)x[x.length+1/2]);
			//On the contrary to find the median number of a odd number of arrays you would need the number in the midst of it all
			//For this purpose we could use the size of 5, where the middle number is the 3rd place thus we can get 3 with x.length+1/2
	}
		System.out.println("The time spent to sort the array is " + time);
}
	
	public static int challengeTwo(String[] x, String y) {
		System.out.println("Unsorted Array for Challenge One: " + Arrays.toString(x));
		long start = System.nanoTime();
		bubbleSortString(x);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Sorted Array: " + Arrays.toString(x));
		return Arrays.asList(x).indexOf(y);
		
		
	}
}
                      
    public static     
