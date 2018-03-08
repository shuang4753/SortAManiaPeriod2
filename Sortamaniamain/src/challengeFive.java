import java.util.*;
public class challengeFive implements Comparator<Object>
{

	public static void bubbleSort(Object[] list1)	
	{
		int o = list1.length;
		for(int i = 0; i < o - 1; i++) 
		{
			for(int j = 0; j < o - 1; j++)
			{
				compare(list1[j], list1[j+1]); //how would i use compare?
				if(1)
				{
					swap(list1, j, j + 1);
				}
			}
		}
	
	}
	
	
	
	@Override
	public static int compare(Object arg0, Object arg1) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void swap(Object[]arr, int index1, int index2)
	{
		Object temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
}
	
	
//help
	//https://www.tutorialspoint.com/java/java_using_comparator.htm
	//https://stackoverflow.com/questions/2839137/how-to-use-comparator-in-java-to-sort
	//https://www.geeksforgeeks.org/comparator-interface-java/
