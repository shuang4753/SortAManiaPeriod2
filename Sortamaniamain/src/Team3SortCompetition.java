import java.util.Arrays;

public abstract class Team3SortCompetition extends SortCompetition {
	public String greeting() {
		return("We winning this lol");
	}
	public int challengeOne(int[] arr){
		private int FindMedian(int[]arr1)
		{
			int median = arr1[arr1.length/2];
			if(arr1.length%2 == 1)
			{
				return ((arr1[median]+arr1[median+1])/2);
			}
			else return (arr1[median]);
		}
		int Challenge_1(int[]arr)
		{
			return FindMedian(arr);	
			
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
	public int challengeTwo(String[] arr, String query) { 
        String[]  mergeResult=mergeSort(arr);
		long start = System.nanoTime();
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge Took :" + time + "nanoseconds");
		for(int i=0;i<mergeResult.length;i++)	
		{
			if(query.equals(mergeResult[i]))
			{
				return i;
			}			
		}
		
		return -1;
	}
	
	public int challengeThree(int[][] arr){

	}
	public int challengeFour(int[][] arr){
		int key, j, big; 
		for(int z = 0; z < arr.length; z++) {
			for(int i = 0; i < arr[0].length; i++) {
				key = arr[z][i]; 
				j = i - 1; 
				while((j>=0)&&(arr[z][j] > key)) {
					SwapInt(arr[z], j+1, j);
					
					j = j - 1; 
				}
				arr[z][j+1] = key;
			}
		}
		
		// if arr length is odd
		if(arr[0].length%2==1){
		    // create new array
		    big = (arr[0].length-1)/2;
		    int[] newarr = new int[arr.length];
		    for(int z = 0; z < newarr.length; z++) {
		        newarr[z] = arr[z][big];
		    }
            // sorts newarr
            for(int i = 1; i < newarr.length; i++) {
		    	key = newarr[i];
			    j = i - 1;
			    while((j>=0)&&(newarr[j] > key)) {
				    SwapInt(newarr, j+1, j);
				    j = j - 1;
			    }
			newarr[j+1] = key;
		    }
		    int what = (newarr.length+1)/2;
            if(newarr.length%2==1){ // if length of newarr is odd
		        return(newarr[(newarr.length-1)/2]);
		    }else{
		        return((((newarr[what]+newarr[what-1])/2)));
		    }
		}else{ // if array length is even
		    // create new array
		    big = (arr[0].length+1)/2;
		    int[] newarr = new int[arr.length];
		    for(int z = 0; z < newarr.length; z++) {
		        newarr[z] = (arr[z][big]+arr[z][big-1])/2;
		    }
            // sorts newarr
		    for(int i = 1; i <newarr.length; i++) {
		    	key = newarr[i];
			    j = i - 1;
			    while((j>=0)&&(newarr[j] > key)) {
				    SwapInt(newarr, j+1, j);
				    j = j - 1;
			    }
			newarr[j+1] = key;
		    }
            int what = (newarr.length+1)/2;
            if(newarr.length%2==1){ // if length of newarr is odd
		        return(newarr[(newarr.length-1)/2]);
		    }else{
		        return((((newarr[what]+newarr[what-1])/2)));
		    }
		}
	}
	public static int challengeFive(Comparable[] arr, Comparable query){

	}
	public static String[] mergeSort(String[] list1)
	{
		//base case
		if(list1.length==1) {
			return list1;
		}
		
		//recursive
		String [] left = Arrays.copyOfRange(list1, 0, list1.length/2);
		String [] right = Arrays.copyOfRange(list1, list1.length/2, list1.length);
		return(merge(mergeSort(left),mergeSort(right)));
	}
	
	public static String[] merge(String[]list1,String[]list2)
	{
		
		String empty[] = new String[list1.length + list2.length];
		int i=0;
		int li=0;
		int ri=0;
		while((li<list1.length)&&(ri<list2.length))
		{
			if(list1[li].compareTo(list2[ri])>0)
			{
				empty[i]=list2[ri];
				ri++;
				i++;
			}
			else if(list1[li].compareTo(list2[ri])<0) 
			{
				empty[i]=list1[li];
				li++;
				i++;
			}
		}
		while(li<list1.length)
		{
			empty[i]=list1[li];
			li++;
			i++;
			
		}
		while(ri<list2.length)
		{
			empty[i]=list2[ri];
			ri++;
			i++;
		}
		return empty;
	}
	
	public static void SwapInt(int[] arr, int index, int index2) {
		int x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
}
