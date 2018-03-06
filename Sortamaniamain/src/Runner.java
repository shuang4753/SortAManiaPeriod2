import java.util.Arrays;

public class Runner {

	public static void main(String[] args) 
	{
		SortCompetition our = new Team11SortCompetition();

		//CountTest
		int [] list1 = randomintArray(10000);
		int [] copy = list1;
		//int [] copy2 = 
		long start = System.nanoTime();
		our.challengeOne(list1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("ChallengeOne took: " + time + "nanoseconds");
		System.out.println(our.challengeOne(list1));
		System.out.println(Arrays.toString(list1) + "\n");

		//MergeTest
		long start1 = System.nanoTime();
		int[] mergeFinal = Team11SortCompetition.mergeSort(copy);
		long end1 = System.nanoTime();
		long time1 = end1 - start1;
		System.out.println("ChallengeOne took: " + time1 + "nanoseconds");
		System.out.println((copy[copy.length/2] + copy[(copy.length/2)-1]) / 2);
		System.out.println(Arrays.toString(mergeFinal) + "\n");

		//quick
		long start2 = System.nanoTime();
		Team11SortCompetition.quickSort(copy, 0, copy.length - 1);
		long end2 = System.nanoTime();
		long time2 = end2 - start2;
		System.out.println("ChallengeOne took: " + time2 + "nanoseconds");
		System.out.println((copy[copy.length/2] + copy[(copy.length/2)-1]) / 2);
		System.out.println(Arrays.toString(list1) + "\n");

		//ChallengeFour
		int[][] test = randomint2dArray(1000);
		print(test);
		long start3 = System.nanoTime();
		our.challengeFour(test);
		long end3 = System.nanoTime();
		long time3 = end3 - start3;
		System.out.println();
		System.out.println("ChallengeFour took: " + time3 + "nanoseconds");
		print(test);
		//System.out.println((copy[copy.length/2] + copy[(copy.length/2)-1]) / 2);
		//System.out.println(Arrays.toString(test) + "\n");

		//if positive, then merge took longer
		//if negative, then quick took longer
		//long compareTime = time1 - time;
		//System.out.print(compareTime);
	}


	public static int[] randomintArray (int length)
	{
		int[] list = new int[length];
		for (int i = 0; i<list.length; i++)
		{
			list[i]=(int)(Math.random()*10000);
		}
		return list;
	}

	public static int[][] randomint2dArray (int length)
	{
		int[][] list = new int[length][length];
		for (int i = 0; i<length; i++)
		{
			for (int j = 0; j < length; j++)
			{
				list[i][j]=(int)(Math.random()*10000);
			}
		}
		return list;
	}
	
	public static void print(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void swap(int[][] elements, int index1, int index2)
	{
		int[] temp=elements[index1];
		elements[index1]= elements[index2];
		elements[index2]=temp;
	}

}
