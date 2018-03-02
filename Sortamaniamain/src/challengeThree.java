/**
 * 
 * @author Alyssa Ma
 *
 */
public abstract class challengeThree 
{
	//mostly sorted arr, sort and return median
	
	public int challengeTree(int [] list1)
	{
		int x = list1.length;
	
		for(int i = 1 ; i < x; i++)
		{
			int y = list1[i];
			int z = i - 1;
			
			while(z >= 0 && list1[z] > y)
			{
				list1[z + 1] = list1[z];
				z = z - 1;
			}
			list1[z + 1] = y;
		}
		int median;
		
		if(list1.length % 2 == 0)
		{
			median = ((int) list1[list1.length / 2] - (int) list1[list1.length] / 2 - 1);
		}
		else
		{
			median = (int) list1[list1.length / 2]; 
		}
		return median;	
	}
}
