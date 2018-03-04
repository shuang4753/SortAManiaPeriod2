//Lingli's class
import java.util.Arrays;

public abstract class One {
	public static void main(String[] args)
	{
		int[] randArr= randomInts(1000);
		long start = System.nanoTime();
		int Medium= challengeOne(randArr);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Challenge 1 took: "+ time + " nanoseconds");
		System.out.println(Arrays.toString(randArr));

	}
	
	public static int[]randomInts(int len)
	{
		int[] list1 = new int[len];
		
		for (int i = 0; i<list1.length-1; i++)
		{
			list1[i]=(int)(Math.random()*10000);
		}
	
		return list1;
	}
	//challengeOne: Standard sort and process
	@Override
	public abstract int challengeOne(int[] arr) 
	{
		//random number generator 
		//data set: an array of 10,000 random integers between 0-1000
		insertionSort(arr);
		return (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
	}
	
	//challengeFour: Multidimensional sorting
	
	public abstract int challengeFour(int[][] arr)
	{
		//data set: a multidimensional array int[1000][1000] all elements are random int between 0-1000
		//sort each sub-array and sort the arrays by their medium value
		
		for (int x= 0; x=arr.length; x++) 
		{
			for (int y=0; y<arr.length; y++) 
			{
		         = arr[x][y];
			}
			
		//return median of median array
	}	
	
		public static void insertionSort(int[] arr)
		{
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
		}
		
	public static String[][] merge(int[] list1, int[] list2)
	{
		//precondition: both list1 and list2 contains Strings in alphabetical order from a to z 
		int left=0; 
		int right=0; 
		int t=0;
		int[] total= new int[list1.length+list2.length];
		
		while(left<list1.length && right<list2.length)
		{
			if(list1[left].compareTo(list2[right])>=0)
			{
				total[t]=list2[right];
				right++;
				t++;
			}
		
			else if(list1[left].compareTo(list2[right])<0)
			{
				total[t]=list1[left];
				left++;
				t++;
			}
		}		
			
		while(left<list1.length)
		{
			total[t]=list1[left];
			left++;
			t++;
		}

		while(right<list2.length)
		{
			total[t]=list2[right];
			right++;
			t++;
		}
			
		//returns an array of the two lists merged together
		return total;	
		}	
	}
	
	public static int median(int[] mid) 
	{
	    int middle = (mid.length/2);
	    
	    if (mid.length % 2 == 1) 
	    {
	    	return mid[middle];
	    } 
	    
	    else 
	    {
	    	return (mid[middle - 1] + mid[middle])/2;	
	    }
		
	}
}
