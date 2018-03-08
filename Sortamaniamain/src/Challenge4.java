import java.util.Arrays;

public class Challenge4 {
	public static void main(String[] args)
	{
		
        double[][] array = new double[1000][1000];
		long start = System.nanoTime();
		challengeFour();
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Challenge 4 took: "+ time + " nanoseconds");

	}
	
	public static int challengeFour(int[][] arr)
	{
		for (int x=0; x<arr.length;x++) {
			for (int y=0; y< arr[x].length;y++) {
				insertionSort(arr[i]);
	}
}
