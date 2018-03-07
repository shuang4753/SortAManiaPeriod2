import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

public class runningman 
{

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		//Challenge 1 Test
		//100% random array of ints
		Random a = new Random();
		int n = 10000;
		int test1 [] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			test1[i] = a.nextInt(10000);
		}
		
		//Challenge 2 Test
		String[] test2 = new String[10000];
		for(int i = 0; i < test2.length; i++)
		{
			String random2 = new String();
			final String alphabet2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			final int N1 = alphabet2.length();
			Random r1 = new Random();
			for (int j = 0; j < 5; j++)
			{
				random2 = random2 + alphabet2.charAt(r1.nextInt(N1));
			}
			test2[i] = random2;
		}


		//Challenge 3 Test
		//75% sorted array of ints
		Random b = new Random();
		int m = 1250;
		int testy [] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			testy[i] = b.nextInt(10000);
		}

		
		int y = 8750;
		int x = 0;
		int [] test3 = new int [10000];
		
		for(int i = 0; i < 1250;i++)
		{
			test3[i] = testy[x];
			x++;
		}
		
		for(int i = 8750; i < 10000;i++)
		{
			test3[i] = testy[y];
			y++;
		}
		for(int i = 1250; i < 8750; i++)
		{
			test3[i] = i;
		}
		
		//Challenge 4 Test
		//Multidimensional Array
		Random d = new Random();
		
		int[][] test4 = new int[1000][1000];
		for(int i = 0; i < test4.length; i++)
		{
			for(int j = 0; j < test4[i].length; j++)
			{
				test4[i][j] = d.nextInt(10000);;
			}
		}
				
		//Challenge 5 Test
		
		
		
		
		Team_5 pink = new Team_5();
		
		//Greeting
		System.out.println(pink.greeting());
		
	/*	
		//Challenge 1 Time
		System.out.print("Challenge One:");
		System.out.println(Arrays.toString(test1));
		long start = System.nanoTime();
		pink.challengeOne(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println(pink.challengeOne(test1));
		System.out.println("Final: " + Arrays.toString(test1));
		System.out.println("Time taken: " + time + " nanoseconds");
		checker(test1);
		mc(test1);
	*/
	
	/*
		//Challenge 2 Time
		String gf = test2[0];
		long start = System.nanoTime();
		pink.challengeTwo(test2, gf);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println(Arrays.toString(test2));
		System.out.println(pink.challengeTwo(test2, gf));
		System.out.println("Time taken: " + time + " nanoseconds");
	*/
		
	/*	
		//Challenge 3 Time
		System.out.print("Challenge Three: ");
		System.out.println(Arrays.toString(test3));
		long start = System.nanoTime();
		pink.challengeThree(test3);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println(pink.challengeThree(test3));
		System.out.println("Final: " + Arrays.toString(test3));
		System.out.println("Time taken: " + time + " nanoseconds");
		checker(test3);
		mc(test3);
	*/
	
	/*
		//Challenge 4 Time
	//	System.out.println(Arrays.deepToString(test4));
		long start = System.nanoTime();
		pink.challengeFour(test4);
		long end = System.nanoTime();
		long time = end - start;
	//	System.out.println(Arrays.deepToString(test4));
		System.out.print("Challenge Four:");
		System.out.println(pink.challengeFour(test4));
		System.out.println("Time taken: " + time + " nanoseconds");
	*/

		//Challenge 5 Time
		
	
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//HELPERS	
	//Checks if array is sorted
	public static void checker(int [] a) 
	{
		boolean poo = true;
		for (int i = 0; i < a.length - 1; i++) 
		{
			if (a[i] > a[i + 1]) 
		    {
				poo = false;
				break;
		    }
		}
		System.out.println(poo);
	}
	
	//median finder
	public static int medf(int [] arr)
	{
		int ans;
		if(arr.length%2==0)
		{
			ans = ((arr[(arr.length/2) - 1] + arr[(arr.length/2)])/2) ; 
		}
		else
			ans = arr[(arr.length/2)];
		return ans;
	}
	
	//medianchecker
	public static void mc(int [] arr)
	{
		int a = ((arr[4999] + arr[5000])/2);
		System.out.println(a);
	}
	
	
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}
}
