
public class ArrayMethods2 {
	
	public static int[] merge(int[] list1 , int[] list2) {
		int[] list3 = new int[list1.length+list2.length];
		int index1 = 0 ; int index2 = 0 ;
		

			
			for ( int i =0 ; i < list3.length ; i++)
			{
				if ( index1 > list1.length-1) {
					list3[i] = list2[index2] ; 
					index2++ ; 
					
					 continue ; }
				if ( index2 > list2.length-1) {
					list3[i] = list1[index1] ; 
					index1++ ;
				
					
					 continue ; }
				else if ((list1[index1]) <= (list2[index2])) 
					{
					list3[i] = list1[index1] ; 
					index1++ ;
					
					}
				 
				 
				 else if ((list1[index1]) >= (list2[index2])) 
					{
					list3[i] = list2[index2] ; 
					index2++ ;
					
					}
				
			} 
			return list3;  
	}
			
	public static String[] merge2(String[] list1 , String[] list2) {
		String[] list3 = new String[list1.length+list2.length];
		int index1 = 0 ; int index2 = 0 ;
		

			
			for ( int i =0 ; i < list3.length ; i++)
			{
				if ( index1 > list1.length-1) {
					list3[i] = list2[index2] ; 
					index2++ ; 
					
					 continue ; }
				if ( index2 > list2.length-1) {
					list3[i] = list1[index1] ; 
					index1++ ;
				
					
					 continue ; }
				else if (list1[index1].compareTo(list2[index2]) < 0  || list1[index1].compareTo(list2[index2])==0  )
					{
					list3[i] = list1[index1] ; 
					index1++ ;
					
					}
				 
				 
				 else if (list1[index1].compareTo(list2[index2]) > 0  )
					{
					list3[i] = list2[index2] ; 
					index2++ ;
					
					}
				
			} 
			
		
		


		return list3;  
	}
	

	
	public static int partition(int[] list) {
		int pivot = 0;
		for (int i = list.length-1; i > pivot; i--) {
			if (list[i] < list[pivot]) {
				Swap(list,pivot,pivot+1);
				Swap(list,pivot,i);
				pivot++;
			}
		}
		return pivot;
	}
	

	public static void Swap(int[] arr, int index1, int index2) {
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
}
