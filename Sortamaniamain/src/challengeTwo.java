public class challengeTwo 
{
	public static void joJoSort(String[] list1, int front, int back)
	{
		if(back > front)
		{
			int pivot = partition(list1, front, back);
					
			//left side
			joJoSort(list1, front, pivot - 1);
			
			//right side
			joJoSort(list1, pivot + 1, back);
		}
	}	
		public static int partition(String[] list1, int front, int back)
		{
			front = 0;
			back = list1.length;
			
			int pivot =list1[0];
			int i=0;
			int j=list1[list1.length-1];
			while(pivot>list1[i])
			{
				swapI(list1,pivot,i);
				i++;
			}
			while(pivot<list1[j])
			{
				swapI(list1,pivot,j);
				j--;
			}
			return pivot;
		}
		
		
		
		
		
	}
	
	public static void swap(String[]arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
