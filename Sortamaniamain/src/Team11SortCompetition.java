import java.util.Arrays;

public class Team11SortCompetition extends SortCompetition {

	@Override
	public int challengeOne(int[] arr) {
		//quickSort(arr, 0, arr.length-1);
		//radixSort(arr);
		countSort(arr);
		return ( arr[arr.length/2] + arr[(arr.length/2)-1]) / 2;
	}

	@Override
	public int challengeTwo(String[] arr, String query) {

		int something = -1;
		String [] result = mergeSort(arr);
		for(int i = arr.length -1; i >= 0; i--)
		{
			arr[i] = result[i];
			if (arr[i].equals(query))
			{
				something = i;
			}
		}
		return something;
	}

	@Override
	public int challengeThree(int[] arr) {

		insertionSort(arr);

		return ((arr[arr.length/2] + arr[(arr.length/2)-1]) / 2);
	}

	@Override
	public int challengeFour(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
		{
			countSort(arr[i]);
		}
		quickSort(arr, 0, arr.length - 1);
		//countSort(arr);
		return 1;
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

	//STILL TESTING DO NOT USE YET!!!!!!
	public static void countSort(int[][] arr)
	{
		int n = arr.length;
		int[][] copy = new int[n][];
		
		for (int j = 0; j < n; j++)
		{
			copy[j] = arr[j].clone();
		}
		
		int[] temp = new int[n];
		int i;
		
		for (i = 0; i < n; i++)
		{
			temp[i] = (arr[i][n/2] + arr[i][(n/2)-1])/2;
		}
		
		int[] count = new int[getMax(temp) + 1];
		
		for (i = 0; i < n; i++)
		{
			count[temp[i]]++;
		}
		
		for (i = 1; i < count.length; i++)
		{
			count[i] += count[i-1];
		}
		
		for (i = n - 1; i >= 0; i--)
		{
			arr[count[temp[i]] - 1] = copy[i];
			count[temp[i]]--;
		}
	}

	public static int getMax(int[] arr)
	{
		int n = arr.length;
		int max = arr[0];
		for (int i = 1; i < n; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getmaxMedian(int[][] arr)
	{
		int n = arr.length;
		int max = (arr[0][n/2] + arr[0][(n/2)-1])/2;
		for (int i = 1; i < arr.length; i++)
		{
			int temp = (arr[i][n/2] + arr[i][(n/2)-1])/2;
			if (temp > max)
			{
				max = temp;
			}
		}
		return max;
	}

	public static void countSort(int[] arr)
	{
		int n = arr.length;
		int max = getMax(arr);
		int [] count = new int[max + 1];
		int [] result = new int[n];
		int i;

		for (i = 0; i < n; i++)
		{
			count [arr[i]]++;
		}

		for (i = 1; i < max + 1; i++)
		{
			count[i] += count[i-1];
		}

		for (i = n - 1; i >= 0; i--)
		{
			result[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		for (i = 0; i < n; i++)
		{
			arr[i] = result[i];
		}
	}

	public static void count(int[] arr, int place)
	{
		int n = arr.length;
		int [] count = new int[10];
		int [] result = new int[n];
		int i;

		for (i = 0; i < n; i++)
		{
			count [(arr[i]/place)%10]++;
		}

		for (i = 1; i < 10; i++)
		{
			count[i] += count[i-1];
		}

		for (i = n - 1; i >= 0; i--)
		{
			result[count[(arr[i]/place)%10] - 1] = arr[i];
			count[(arr[i]/place)%10]--;
		}

		for (i = 0; i < n; i++)
		{
			arr[i] = result[i];
		}
	}

	public static void radixSort(int [] arr)
	{
		int max = getMax(arr);

		for (int i = 1; i <= max; i*=10)
		{
			count(arr, i);
		}
	}

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

	public static int[] mergeSort(int[] list)
	{
		if (list.length==1)
		{
			return list;
		}

		int[] left = Arrays.copyOfRange(list,0,list.length/2); 
		int[] right = Arrays.copyOfRange(list,list.length/2,list.length);

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
	
	public static void quickSort(int[][] list1, int front, int back)
	{
		if (back > front)
		{	
			int pivotIndex = partition2d(list1, front, back);
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

	public static int[] merge(int[] list1, int[] list2)
	{
		int bigLength=list1.length+list2.length;
		int[] list3 = new int[bigLength]; 
		int index1 = 0;
		int index2 = 0;

		for (int index3=0; index3<(list3.length); index3++)
		{
			if (index1<list1.length && index2<list2.length) 
			{
				if (list1[index1]<(list2[index2]))
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

	public static void swap(int[][] elements, int index1, int index2)
	{
		int[] temp = elements[index1];
		elements[index1]= elements[index2];
		elements[index2]=temp;
	}

	//unfinished
	public static int partition2d(int[][] list1, int front, int back)
	{
		int pivotIndex = front;
		int pivotValue = (list1[pivotIndex][list1.length/2] + list1[pivotIndex][(list1.length/2)-1])/2;
		int checkIndex = back;

		while (pivotIndex != checkIndex)
		{	
			int checkValue = (list1[checkIndex][list1.length/2] + list1[checkIndex][(list1.length/2)-1])/2;
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
}
