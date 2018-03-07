import java.lang.Math;
import java.util.Arrays;

//Wes Avedisian, Saurabh Bansal, Ava DiPietro
public class Team8SortCompetition extends SortCompetition
{
	public static void main (String[] args)
	{
		randomInts(0, 100, 200);
		
	}
	public static int[] randomInts (int x) { // ava's ELITE method do not tuch
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
		
		return 0;
	}

	@Override
	public int challengeFour(int[][] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int challengeFive(Comparable[] arr, Comparable query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return null;
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
	
}
