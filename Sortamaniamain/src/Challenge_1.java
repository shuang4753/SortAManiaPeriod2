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
	int[]test1 = {6729, 5894, 4335, 8867, 383, 519, 2244, 
				  4615, 3251, 1398, 7511, 5453, 1234, 4297, 
				  2459, 4990, 3069, 5926, 7864, 196, 8136, 4364};
	int[]medtest = {1, 2, 3, 4, 5};
	int[]medtest1 = {1, 2, 3, 4, 5, 6};
	
	int x = FindMedian(medtest);
	int y = FindMedian(medtest1);

}


