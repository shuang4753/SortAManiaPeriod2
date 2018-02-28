//Lingli's class

public class challengeOne {
	public static void main(String args)
	{
		int[] randArr= randomInts(1000);
		long start = System.nanoTime();
		int Medium= challengeOne(randArr);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println(Arrays.toString(randArr));
		
	}
}
