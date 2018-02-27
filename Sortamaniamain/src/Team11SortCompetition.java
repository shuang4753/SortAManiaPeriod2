import java.util.Arrays;

public class Team11SortCompetition extends SortCompetition {

	@Override
	public int challengeOne(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		return ( arr[arr.length/2] + arr[(arr.length/2)-1]) / 2;
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
		
		return 0;
	}

	@Override
	public int challengeThree(int[] arr) {
		
		return 0;
	}

	@Override
	public int challengeFour(int[][] arr) {
		
		return 0;
	}

	@Override
	public int challengeFive(Comparable[] arr, Comparable query) {
		
		return 0;
	}

	@Override
	public String greeting() {
		
		return "hi";
	}

	//Sorting Methods
		public static void insertionSort(int[] list1)
		{
			for (int x=1; x<list1.length; x++)
			{
				for(int y=x; y>0; y-- )
				{
					if (list1[y] < list1[y-1])
					{
						swap(list1, y, y-1);
					}
					else 
					{
						break;
					}
				}
			}
		}
		

		public static void selectionSort(double[] list1)
		{
			for (int x = 0; x<list1.length-1; x++)
			{
				int indexOfMin=x;
				for (int y = x +1; y<list1.length; y++)
				{
					if(list1[indexOfMin]>list1[y])
					{
						 indexOfMin=y;
					}
				}
				swap(list1, indexOfMin, x);
			}
			
		}
		
		
		public static void bubbleSort(int[] list1)
		{
			
			int swapCount = 1;
			while (swapCount !=0)
			{
				swapCount = 0;
				
				for (int i = 0; i<list1.length-1; i++)
				{
					if (list1[i] > (list1[i+1]) )
					{
						swap(list1, i, i+1);
						swapCount++;
					}
				}
			}
		}
		
		
		public static String[] mergeSort(String[] list)
		{
			if (list.length==1)
			{
				return list;
			}
			
			String left[] = Arrays.copyOfRange(list,0,list.length/2); 
			String right[] = Arrays.copyOfRange(list,list.length/2,list.length);
					
			return merge(mergeSort(left), mergeSort(right));
		}

		public static void quickSort(int[] list1, int front, int back)
		{
			if (back > front)
			{
				
				int pivotIndex = partition(list1, front, back);
				quickSort(list1, front, pivotIndex-1);
				quickSort(list1, pivotIndex+1, back);
			}	
		}
		







	//Helper Methods
	public static int partition(int[] list1, int front, int back)
	{
		int pivotIndex = front;
		int pivotValue = list1[pivotIndex];
		int checkIndex = back;

		while (pivotIndex != checkIndex)
		{	
			int checkValue = list1[checkIndex];
			if (pivotIndex < checkIndex)
			{
				if (pivotValue < checkValue)		
				{
					checkIndex--;
				}
				
				if (pivotValue >= checkValue)
				{
					swap(list1, pivotIndex, checkIndex);
					int temp = pivotIndex;
					pivotIndex=checkIndex;
					checkIndex=temp;
					checkIndex++;
				}
			}
			
			else 
			{
				if (pivotValue > checkValue)		
				{
					
					checkIndex++;
				}
				
				if (pivotValue <= checkValue)
				{
					swap(list1, pivotIndex, checkIndex);
					int temp = pivotIndex;
					pivotIndex=checkIndex;
					checkIndex=temp;
					checkIndex--;
				}
			}
		}
		return pivotIndex;
	}

	public static String[] merge(String[] list1, String[] list2)
	{
		int bigLength=list1.length+list2.length;
		String[] list3 = new String[bigLength]; 
		int index1 = 0;
		int index2 = 0;
		
		for (int index3=0; index3<(list3.length); index3++)
		{
			if (index1<list1.length && index2<list2.length) 
			{
				if (list1[index1].compareTo(list2[index2])<0)
				{
					list3[index3]=list1[index1];
					index1++;
				}
			
				else 
				{
					list3[index3] = list2[index2];
					index2++;
				}
			}
			
			else
			{
				if (index2<list2.length)
				{
					list3[index3]=list2[index2];
					index2++;
				}
				
				if (index1<list1.length)
				{
					list3[index3]=list1[index1];
					index1++;
				}
			}
		}
		return list3;
	}






	//Swap Methods
	public static void swap(int[] elements, int index1, int index2)
	{
		 int temp=elements[index1];
		 elements[index1]= elements[index2];
		 elements[index2]=temp;
	}

	public static void swap(double[] elements, int index1, int index2)
	{
		 double temp=elements[index1];
		 elements[index1]= elements[index2];
		 elements[index2]=temp;
	}

	public static void swap(String[] elements, int index1, int index2)
	{
		 String temp=elements[index1];
		 elements[index1]=elements[index2];
		 elements[index2]=temp;
	}
	

}
