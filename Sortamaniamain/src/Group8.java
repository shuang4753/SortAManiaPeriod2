import java.lang.Math;
import java.util.Arrays;

//Wes Avedisian, Saurabh Bansal, Ava DiPietro
public class Group8 
{
	public static void main (String[] args)
	{
		int[] ran = randomInts(0, 10000, 10000);
		mergeSort(ran);
		
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
	
	public static String[] mergeSort(String[] S)
	{
		if(S.length >= 2)
		{
			String[] s1 = new String[S.length/2];
			s1 = Arrays.copyOfRange(S, 0, (S.length/2)-1);
			String[] s2 = new String[S.length-S.length/2];
			s2 = Arrays.copyOfRange(S, S.length/2, S.length-1);
			return merge(mergeSort(s1), mergeSort(s2));
		}
		else
		{
			return S;
		}
	}
	
	public static String[] merge(String[] x, String[] y)
	{
		String[] combo = new String[x.length + y.length];
		int xc = 0;
		int yc = 0;
		while(xc + yc < (x.length + y.length) - 1)
		{
			if(x[xc].compareTo(y[yc])>=0)
			{
				combo[xc + yc] = y[yc];
				yc++;
			}
			if(x[xc].compareTo(y[yc])<0)
			{
				combo[xc + yc] = x[xc];
				xc++;
			}
		}
		return combo;
	}
	print();
}
