import java.lang.Math;
import java.util.Arrays;

//Wes Avedisian, Saurabh Bansal, Ava DiPietro
public class Team8SortCompetition extends SortCompetition
{
	public static void main (String[] args)
	{
		randomInts(0, 100, 200);
		
	}
	public static int[] randomInts (int x) // ava's ELITE method do not tuch
	{ 
		int[] randoms = new int[x];
		for (int y = 0; y < x; y++) {
			randoms[y] = (int) (Math.random() * x);
			System.out.println(randoms[y]);
		}
		return randoms;
	}
	public static int[] randomInts(int L, int U, int C)
	{
		int[] ran = new int[C];
		for(int x = 0; x < C; x++)
		{
			ran[x] = (int)(Math.random()*(U-L)) + L;
		}
		return ran;
	}
	
	// Helper methods (Quick Sort and Merge)
	public static String[] mergeSort(String[] S)
	{
		if(S.length >= 2)
		{
			String[] s1 = new String[S.length/2];
			s1 = Arrays.copyOfRange(S, 0, (S.length/2)-1);
			String[] s2 = new String[S.length-S.length/2];
			s2 = Arrays.copyOfRange(S, S.length/2, S.length-1);
			return merge1(mergeSort(s1), mergeSort(s2));
		}
		else
		{
			return S;
		}
	}
	
	public static String[] merge1(String[] x, String[] y)
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
	//Partition Int
	public static void quickSort(int[] list1, int front, int back) 
	{
		if (front < back) 
		{
			int p = partition(list1, front, back);
			quickSort(list1, front, p - 1);
			quickSort(list1, p + 1, back);
		}
	}
	
	public static void quickSort(int[] list1, int front, int back) 
	{
		if (front < back) 
		{
			int p = partition(list1, front, back);
			quickSort(list1, front, p - 1);
			quickSort(list1, p + 1, back);
		}
	}
	public static void quickSort(Comparable[] list1, int front, int back) 
	{
		if (front < back) 
		{
			int p = partition(list1, front, back);
			quickSort(list1, front, p - 1);
			quickSort(list1, p + 1, back);
		}
	}
	public static int partition(int[] list, int front, int back) 
	{
		
		int i = front;
		int pivot = list[front];		
		for (int j = front + 1; j <= back; j++) {
			if (list[j] < pivot) {
				i++;
				int m = list[i];
				list[i] = list[j];
				list[j] = m;
			}
		}
		for (int a = front; a < i; a++) {
			list[a] = list[a + 1];
		}
		list[i] = pivot;
		return i;
	}
	public static int partition(Comparable[] list, int front, int back) 
	{
		
		int i = front;
		Comparable pivot = list[front];		
		for (int j = front + 1; j <= back; j++) {
			if (list[j].compareTo(pivot)<0) {
				i++;
				Comparable m = list[i];
				list[i] = list[j];
				list[j] = m;
			}
		}
		for (int a = front; a < i; a++) {
			list[a] = list[a + 1];
		}
		list[i] = pivot;
		return i;
	}
	@Override
	public int challengeOne(int[] arr) 
	{
		int a = arr.length/2;
		int b = 0;
		quickSort(arr, 0, arr.length-1);
		if (arr.length % 2 == 1)
		{
			b = arr[((arr.length - 1) / 2 ) +1];
		}
		else 
		{
			b = (arr[a] + arr[a+1])/2;
		}
		return (b);
	}

	@Override
	public int challengeTwo(String[] arr, String query) 
	{
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr.equals(query)) 
			{
			return i;
			}
		}
		return -1;
	}

	@Override
	public int challengeThree(int[] arr) 
	{
		insertionSort(arr);
		int m = arr[arr.length/2-1];
		return m;
	}

	@Override
	public int challengeFour(int[][] arr) {
		for(int[] x : arr)
		{
			quickSort(x, 0, x.length-1);
		}
		int[] meds = new int[arr.length];
		for(int x = 0; x < arr.length; x++)
		{
			meds[x] = arr[x][(arr[x].length/2)];
		}
		quickSort(meds, 0, meds.length-1);
		
		return(meds[meds.length/2-1]);
		
	}

	@Override
	public int challengeFive(Comparable[] arr, Comparable query) {
		for(int x = 0; x < arr.length; x++)
		{
			if(query.compareTo(arr[x])==0)
			{
				return x;
			}
		}
		return -1;
	}

	@Override
	public String greeting() 
	{
	return "Beylo, we are group 8! We are here to compete for the Sort Competition!";
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
			else
			{
				combo[xc + yc] = x[xc];
				xc++;
			}
		}
		return combo;
	}
	
	public static void swap(int[] a, int x, int y)
	{
		int s = a[x];
		a[x] = a[y];
		a[y] = s;
	}

	public static void insertionSort(int[] x)
	{
		int lock = 0;
		while(lock < x.length)
		{
			for(int i = lock+1; i < x.length; i++)
			{
				if(x[i] < x[lock])
				{
					swap(x, lock, i);
				}
			}
			lock++;
		}
	}
}
