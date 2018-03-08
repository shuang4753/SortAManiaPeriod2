import java.util.Arrays;

public class Runner {

	public static void main(String[] args) 
	{
		SortCompetition our = new Team11SortCompetition();

		//CountTest
		//ChallengeOne
		int [] list1 = randomintArray(10000);
		int [] copy = list1;
		//int [] copy2 = 
		long start = System.nanoTime();
		our.challengeOne(list1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("ChallengeOne took: " + time + "nanoseconds");
		System.out.println(our.challengeOne(list1));
		//System.out.println(Arrays.toString(list1) + "\n");
		
		//ChallengeTwo
		String[] list2 = {"honye","apple","     ","ioioo","gfopp"};
		long start2 = System.nanoTime();
		int index = our.challengeTwo(list2,"ioioo");
		long end2 = System.nanoTime();
		long time2 = end2 - start2;
		System.out.println("ChallengeTwo took: " + time2 + "nanoseconds");
		System.out.println(index);
		print(list2);
		//System.out.println(Arrays.toString(list1) + "\n");
		
		//ChallengeThree
		int[] list3 = randomintArray(10000);
		long start3 = System.nanoTime();
		our.challengeThree(list3);
		long end3 = System.nanoTime();
		long time3 = end3 - start3;
		System.out.println("ChallengeThree took: " + time3 + "nanoseconds");
		System.out.println(our.challengeThree(list3));
		//System.out.println(Arrays.toString(list1) + "\n");
		
		//ChallengeFour
		int[][] test = randomint2dArray(1000);
		//print(test);
		long start4 = System.nanoTime();
		our.challengeFour(test);
		long end4 = System.nanoTime();
		long time4 = end4 - start4;
		System.out.println();
		System.out.println("ChallengeFour took: " + time4 + "nanoseconds");
		System.out.println(our.challengeFour(test));
		//print(test);
		
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
	
	public static void print(String[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

}
