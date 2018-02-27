import java.util.Random;
public class Team1SortCompetition extends SortCompetition {
	
	public String greeting()
	{return "This is Team 1,Tyson Lawrence and Amy Chen. We are ready to compete!";
		
	}
	public int challengeOne(int[]baseList)
	{baseList=new int[10000];
	Random a=new Random();
	for(int x=0;x<10000;x++)
	{baseList[x]=a.nextInt(10000);	
	}
	insertionSort(baseList);
	return ((baseList[4998]+baseList[4999])/2);
	}
	
	public int challengeTwo(String[]baseList1,String query)
	{baseList1=new String[10000];
	
	for(int x=0;x<10000;x++)
	{    int l=baseList1[x].length();
		l=5;	
	}
	for(int y=0;y<baseList1.length;y++)
	{if (baseList1[y].equals(query))
	  {return y;}
		
	}
	return -1;
	}

	public int challengeThree(int[]baseList)
	{selectionSort(baseList);
	return ((baseList[4998]+baseList[4999])/2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void insertionSort(int[]list1)
	
	{ for(int n=1;n<=list1.length-1;n++)	   
	    {for (int j=n;j>0;j--)
		   if (list1[j]<list1[j-1])
	       {swap(list1,j,j-1); }	
		   else {break;}
	    }	
	}
	public static void selectionSort(int[]list1)
	{
	 double curmin=0;
	 int minIndex=0;
	  for(int n=0;n<list1.length;n++)
		  {curmin=list1[n];
	       minIndex=n;
	        for(int p=n+1;p<list1.length;p++)
		    {if (curmin>list1[p])
		     {curmin=list1[p];
		     minIndex=p;}
		    }
		 swap(list1,minIndex,n);
	     }
	 
	 
	}
	public static void swap(int[] arr,int index1,int index2)
	{int y=arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=y;
		
	}
	public static void swap(double[] arr,int index1,int index2)
	{double y=arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=y;
		
	}
	public static void swap(String[] arr,int index1,int index2)
	{String y=arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=y;
		
	}
}
