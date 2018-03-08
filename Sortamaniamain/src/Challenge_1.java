//Mamadou Temp
public abstract class Challenge_1 extends SortCompetition {
	public static int Challenge_1(int[]arr)
	{
		return FindMedian(arr);	
		
	}
	
	
	public static int FindMedian(int[]arr)
	{
		int median = arr[arr.length/2];
		if(arr.length%2 == 1)
		{
			return ((arr[median]+arr[median+1])/2);
		}
		else return (arr[median]);
	}
	
	int partition(int arr[], int start, int end)
    {
        int partivot = arr[end]; 
        int x = (start-1);
        for (int y=start; y<end; y++)
        {
            if (arr[y] <= partivot)
            {
                x++;
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
        }
 
  
        int temp = arr[x+1];
        arr[x+1] = arr[end];
        arr[end] = temp;
 
        return x+1;
    }
 
    void sort(int arr[], int start, int end)
    {
        if (start < end)
        {
            int parti = partition(arr, start, end);
 
 
            sort(arr, start, parti-1);
            sort(arr, parti+1, end);
        }
    }
}


