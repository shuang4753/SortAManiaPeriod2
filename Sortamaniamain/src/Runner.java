
public class Runner {

	public static void main(String[] args) 
	{
		int [] list1 = tenThousand(10000);
		long start = System.nanoTime();
		SortCompetition median = new Team11SortCompetition();
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("ChallengeOne(quick) took: " + time + "nanoseconds");
		System.out.println(median.challengeOne(list1));
	}
	
	public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int[] tenThousand (int length)
	{
		int[] list = new int[length];
		for (int i = 0; i<list.length-1; i++)
		{
			list[i]=(int)(Math.random()*10000);
		}
		return list;
	}
}
