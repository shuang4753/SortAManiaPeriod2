
public class Team2 {

	
	//challengeOne: Standard sort and process
	public static int challengeOne(int[] list1) 
	{
		//random number generator 
		//an array of 10,000 random integers between 0-1000
		int temp=0;
		for(int outside=1; outside<list1.length; outside++)
		{
			for(int inside=outside; inside>0; inside--)
			{
				if(list1[inside]<list1[inside-1])
				{
					temp=list1[inside-1];
					list1[inside-1]=list1[inside];
					list1[inside]=temp;
				}
				else
				{
					break;
				}
			}
		}	
		
		return (list1.length/2)+1;
	}
}
