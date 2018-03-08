import java.util.ArrayList;
import java.util.Arrays;

//Lily's class

public class Challenge2and5 {
	public static void main (String args[]) {
		System.out.println("Personal Runner is here");
		String [] test1 = {"apple", "cucum", "zorro", "zorro", "micro"};
		String [] test2 = {"any", "can", "this", "body", "do"};
		
		long start = System.nanoTime();
		int indexReturned = challengeTwo("mincro",test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("String Sort test took: "+ time + " nanoseconds");
		System.out.println(Arrays.toString(test1)); 
		System.out.println(indexReturned);
		
		start = System.nanoTime();
		indexReturned = challengeFive("can",test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Comparable test took: "+ time + " nanoseconds");
		System.out.println(Arrays.toString(test2)); 
		System.out.println(indexReturned);
		
	}
	
	public static int challengeTwo (String given, String[] test1) {
		stringSort(test1);
		
		for(int i = 0; i < test1.length; i++) {
			if(test1[i].equals(given)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int challengeFive (Comparable given, Comparable[] mysArr) {
		cstringSort(mysArr);
		for(int i = 0; i < mysArr.length; i++) {
			if(mysArr[i].equals(given)) {
				return i;
			}
		}
		return -1;
	}
	
	private static void cstringSort (Comparable[] test1) {
		int swapNum = 0;
		for(int i = 0; i<test1.length;i++) {
			swapNum = i; 
			for(int j=i-1; j>=0;j--) {
				if(test1[swapNum].compareTo(test1[j])<0) {
					cstringSwap(test1, swapNum, j);
					swapNum--;
				}
				else if(test1[swapNum].compareTo(test1[j])>0) {
					break;
				}
			}
		}
	}
	
	private static void cstringSwap(Comparable[]arr, int index1, int index2) {
		Comparable string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}
	
	private static void stringSort (String[] test1) {
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
	}
	
	private static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}
}
