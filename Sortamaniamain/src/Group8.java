import java.util.Random;

//Wes Avedisian, Saurabh Bansal, Ava DiPietro
public class Group8 
{
	public static void main (String[] args)
	{
		Random rnd = new Random();
		int n = 0;
		int a[] = new int[n];
		for (int i=0; i < n; i++) 
		{
		    a[i] = rnd.nextInt(10000);
		}
		System.out.println (a);
		bubbleSort(a);
		System.out.println(a);
	}
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
}
