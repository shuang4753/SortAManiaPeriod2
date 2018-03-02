import java.util.Arrays;
import java.util.Random;
public class Team1SortCompetition extends SortCompetition {
	
	public String greeting()
	{return "This is Team 1,Tyson Lawrence and Amy Chen. We are ready to compete!";
		
	}
	public int challengeOne(int[]baseList)
	{ long start=System.nanoTime();
	  insertionSort(baseList);
	  long end=System.nanoTime();
	  long time=end-start;
	  System.out.println(time);
	  
	 int x=baseList.length-1;
	 if(baseList.length%2==0)
	 {return ((baseList[x/2+1]+baseList[(x/2)])/2);	 
	 }
	 else
	 {return (baseList[(baseList.length-1)/2]);
		 
	 }
	
	}
	
	public int challengeTwo(String[]baseList1,String query)
	{
	for(int y=0;y<baseList1.length;y++)
	{if (baseList1[y].equals(query))
	  {return y;}
		
	}
	return -1;
	}
	
	public int challengeThree(int[]baseList)
	{insertionSort(baseList);
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
	public static void quickSort(int[]list1,int front, int back)
    {if(back>front)
     {
    	int pivotPos=partition(list1,front,back);
    	quickSort(list1,front,pivotPos-1);
    	quickSort(list1,pivotPos+1,back);
     }
    	
    }
	public static int partition(int[]list1,int front,int back)
	{ int pivotPos=front;
	int temp=0;
	//Checks to see values that are less than when partitionIndex is 0
	  for(int x=front+1;x<=back;x++)
	  {if(list1[x]<list1[pivotPos])
	   {temp=list1[pivotPos];
	   list1[pivotPos]=list1[x];
	   list1[x]=temp;
	   pivotPos= x;
	   //checks for values less than partition when partitionIndex is swapped
	   for(int y=pivotPos-1;y>=0;y--)
	    {if (list1[y]>list1[pivotPos])
	     {temp=list1[pivotPos];
	      list1[pivotPos]=list1[y];
	      list1[y]=temp;
	      pivotPos=y;
	    	
	     }
		   
	    }
	   }
	  
	  }
	  return pivotPos;
	}
}
