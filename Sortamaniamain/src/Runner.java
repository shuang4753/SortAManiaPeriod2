import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Runner 
{
	
	public static void main(String[] args) {
        //int[] test1 = randomInts(10000);
        //System.out.println(Arrays.toString(test1));
        //challengeOne(test1);
        //String[] test2 = {"dick","canal","butt","poop","fat"};
        //System.out.println(challengeTwo(test2,"dick"));

        int[][] test4 = multiInts(10);
        System.out.println("Unsorted Array for Challenge Four: \n" + Arrays.deepToString(test4));


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
	
	public static String[] randStrings(int lim) {
		String set = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder testString = new StringBuilder();
		ArrayList <String> randArray = new ArrayList <String> (lim);
		Random a = new Random();
		String[] randArr = new String[lim];
		int levin =  testString.length();
		for(int x = 0; x < lim; x++) {
		 while(levin < 5) {
			 int index = a.nextInt(set.length());
			 testString.append(set.charAt(index));
			 }
		 String result = testString.toString();
		 randArray.add(result);
		 levin = 0;
		}
		return randArray.toArray(randArr);
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
		long start = System.nanoTime();
		bubbleSortString(x);
		long end = System.nanoTime();
		long time = end - start;
		return Arrays.asList(x).indexOf(y);
		
		
	}
	
	public static int challengeFive(Comparable<Object>[] arr, Comparable<Object> query) {
		Arrays.sort(arr);
		for(int x = 0; x < arr.length; x++) {
			if(query.compareTo(x) == 0) {
				return x;

			}
		}
		return -1;
	}
}
                      
  
