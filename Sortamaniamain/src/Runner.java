import java.util.Arrays;

public class Runner {

	public static void main(String[] args) 
	{
		//QuickTest
		int [] list1 = tenThousand(1000);
		long start = System.nanoTime();
		SortCompetition our = new Team11SortCompetition();
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("ChallengeOne took: " + time + "nanoseconds");
		System.out.println(our.challengeOne(list1));
		System.out.println(Arrays.toString(list1) + "\n");
		
		//MergeTest
		long start1 = System.nanoTime();
		our = new Team11SortCompetition();
		int[] mergeFinal = Team11SortCompetition.mergeSort(list1);
		long end1 = System.nanoTime();
		long time1 = end1 - start1;
		System.out.println("ChallengeOne took: " + time1 + "nanoseconds");
		System.out.println(our.challengeOne(list1));
		System.out.println(Arrays.toString(mergeFinal) + "\n");
		
		//if positive, then merge took longer
		//if negative, then quick took longer
		long compareTime = time1 - time;
		System.out.print(compareTime);
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
