//Mamadou Temp
public abstract class Challenge_1 extends SortCompetition {
	public static int Challenge_1(int[]numba)
	{
		return FindMedian(numba);	
		System.out.println(x);
	}
	
	
	public static int FindMedian(int[]numba)
	{
		int median = numba[numba.length/2];
		if(numba.length%2 == 1)
		{
			return ((numba[median]+numba[median+1])/2);
		}
		else return (numba[median]);
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


