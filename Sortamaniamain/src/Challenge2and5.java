//Lily's class

public class Challenge2and5 {
	public static void main (String args[]) {
		System.out.println("Personal Runner is here");
		String [] test1 = {"apple", "cucum", "micros", "zorro"};
		
		long start = System.nanoTime();
		int indexReturned = stringSort("micros",test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Stirng Sort test test took: "+ time + "nanoseconds");
		System.out.println(indexReturned); 
	}
	
	public static int stringSort(String givenStr, String[] test1) {
		int swapNum = 0, recordedNum=0;
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
	
	public static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}
}
