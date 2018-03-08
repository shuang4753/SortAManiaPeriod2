import java.util.Arrays;

/**
 * SortAMania
 * @author Lingli Zou, Alyssa Ma, Lily Li
 * Period 2
 * 2/26/18
 */

public class Team2 extends SortCompetition{

		public static void main(String [] args)
		{

			String [] test1 = {"apple", "cucum", "zorro", "zorro", "micro"};
			String [] test2 = {"any", "can", "this", "body", "do"};
			//Challenge 1 10000 Rand Int Test
				
			int[] randArr= randomInts(1000);
			long start = System.nanoTime();
			challengeOne(randArr);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("Challenge 1 took: "+ time + " nanoseconds");
			System.out.println(Arrays.toString(randArr));
				
				//Challenge 2 10000 Rand String Test
			start = System.nanoTime();
			int indexReturned = challengeTwo("mincro",test1);
			end = System.nanoTime();
			time = end - start;
			System.out.println("String Sort test took: "+ time + " nanoseconds");
			System.out.println(Arrays.toString(test1)); 
			System.out.println(indexReturned);	
				//Challenge 3 >75% Sorted Int Test
				
				//Challenge 4 int[1000][1000] Rand Test 
				
			//Challenge 5 1D Array Mystery Comparables
			start = System.nanoTime();
			indexReturned = challengeFive("can",test2);
			end = System.nanoTime();
			time = end - start;
			System.out.println("Comparable test took: "+ time + " nanoseconds");
			System.out.println(Arrays.toString(test2)); 
			System.out.println(indexReturned);
		}
		
		//challenge one
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
		
		//challenge two
		public static int challengeTwo (String given, String[] test1) {
			stringSort(test1);
			
			for(int i = 0; i < test1.length; i++) {
				if(test1[i].equals(given)) {
					return i;
				}
			}
			return -1;
		}
		
		//challenge three
		public static int challengeTree(int [] list1)
		{
			insort(list1);
			
			int median = list1.length/2;
			if(list1.length % 2 != 0)
			{
				median = (int) list1[median];
			}
			else
			{
				median = (int) list1[median] + (list1[median - 1]/2);
			}
			return median;
		}
		
		//challenge four
		public static int[] challengeFour() {
			//sort rows, for each sort, take the median value so u make a 1d array of medians (should be 100)
			//return median number in the median row//
			
			inso(list1);
		}
		
		//challenge five
		public static int challengeFive (Comparable given, Comparable[] mysArr) {
			cstringSort(mysArr);
			for(int i = 0; i < mysArr.length; i++) {
				if(mysArr[i].equals(given)) {
					return i;
				}
			}
			return -1;
		}
		
// _______________________________________________________________________Private challenge 1
		
	private static int[]randomInts(int len)
	{
		int[] list1 = new int[len];
		
		for (int i = 0; i<list1.length-1; i++)
		{
			list1[i]=(int)(Math.random()*10000);
		}
	
		return list1;
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
	// Challenge 2 and 5 helper method
	private static void cstringSort (Comparable[] test1) {
		int swapNum = 0;
		for(int i = 0; i<test1.length;i++) {
			swapNum = i; 
			for(int j=i-1; j>=0;j--) {
				if(test1[swapNum].compareTo(test1[j])<0) {
					cstringSwap(test1, swapNum, j);
					swapNum--;
				}
				else if(test1[swapNum].compareTo(test1[j])>0) {
					break;
				}
			}
		}
	}
	
	private static void cstringSwap(Comparable[]arr, int index1, int index2) {
		Comparable string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}
	
	private static void stringSort (String[] test1) {
		int swapNum = 0;
		for(int i = 0; i<test1.length;i++) {
			swapNum = i; 
			for(int j=i-1; j>=0;j--) {
				if(test1[swapNum].compareTo(test1[j])<0) {
					stringSwap(test1, swapNum, j);
					swapNum--;
				}
				else if(test1[swapNum].compareTo(test1[j])>0) {
					break;
				}
			}
		}
	}
	
	private static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}

// ____________________________Private challenge 3
	
	private static void insort(int [] list1)
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
	}
	
	public static int median(int [] list1)
	{
		int median = list1.length/2;
		
		if(list1.length % 2 == 1)
		{
			return list1[median]; 
		}
		else
		{
			return (list1[list1.length / 2] + ( list1[list1.length / 2 - 1])/2);
		}
	}
	
	//Challenge 4 insertion attempt -Alyssa
	
	public static void inso(int [][] x, int a, int b)
	{
		int c;
		int d;
		
		for(int i = 1; i < a; i++)
		{
			c = x[i][b];
			int[] xRow = x[i];
			d = i - 1;
			
			while((d >= 0) && (x[d][b] > c))
			{
				x[d + 1] = x[d];
				d = d - 1;
			}
			x[d + 1] = xRow;
		}
	}
	
	
}

