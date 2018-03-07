import java.util.Arrays;

public abstract class Team3SortCompetition extends SortCompetition {
	public Team3SortCompetition(){
		
	}
	public static int challengeOne(int[] arr){
		for()
	}
	public static int challengeTwo(String[] arr, String query) { 
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
	
	
	public static int challengeThree(int[][] arr){

	}
	public static int challengeFour(int[][] arr){

	}
	public static int challengeFive(Comparable[] arr, Comparable query){

	}
	
}
