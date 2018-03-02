import java.util.Math;

//Wes Avedisian, Saurabh Bansal, Ava DiPietro
public class Group8 
{
	public static void main (String[] args)
	{
		int[] ran = randomInts(0, 10000, 10000);
		
		
	}
	
	public static void challengeOne(int[] arr) 
	{
		
	}
	
	//public static int[] randomInts (int x) { // ava's ELITE method do not tuch
	//	int[] randoms = new int[x];
	//	for (int y = 0; y < x; y++) {
	//		randoms[y] = (int) (Math.random() * x);
	//		System.out.println(randoms[y]);
	//	}
	//	return randoms;
	//}
	
	public static void bubbleSort(int []L1)
	{
		boolean f = true;
		while (f)
		{
			f = false;
			for (int x = 0; x < L1.length - 1; x++)
			{
				if (L1[x] > (L1[x+1]))
				{
					swapInt(L1, x, x+1);
					f = true;
				}
			}
		}
	}
	public static void swapInt(int[]x, int in1, int in2)
	{
		int y = x[in1];
		x[in1] = x[in2];
		x[in2] = y;
	}
	public static int[] randomInts(int L, int U, int C)
	{
		int[] ran = new int[C];
		for(int x = 0; x < C; x++)
		{
			ran[x] = (int)Math.random()*(U-L) + L;
		}
		return ran;
	}
}
