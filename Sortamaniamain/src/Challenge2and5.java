import java.util.Arrays;

//Lily's class

public class Challenge2and5 {
	public static void main (String args[]) {
		System.out.println("Personal Runner is here");
		String [] test1 = {"apple", "cucum", "zorro", "zorro", "micro"};
		
		long start = System.nanoTime();
		//String[] stringArr = stringSort(test1);
		int indexReturned = challengeTwo(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Stirng Sort test test took: "+ time + "nanoseconds");
		//System.out.println(Arrays.toString(stringArr)); 
		System.out.println(indexReturned);
	}
	
	public static int challengeTwo (String given, String[] test1) {
		String[] newTest = stringSort(test1);
		
		for(String s:newTest) {
			
		}
		
	}
	public static String[] stringSort (String[] test1) {
		int swapNum = 0;
		for(int i = 0; i<test1.length;i++) {
			swapNum = i; 
			for(int j=i-1; j>=0;j--) {
				if(test1[swapNum].compareTo(test1[j])<0) {
					stringSwap(test1, swapNum, j);
					swapNum--;
				}
				else if(test1[swapNum].compareTo(test1[j])>0) {
					break;
				}
			}
		}
		return test1;
	}
	
	public static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}
}
