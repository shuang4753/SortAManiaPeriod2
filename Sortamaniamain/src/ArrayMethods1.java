
public class ArrayMethods1 {
	
	public static void insertionSort(int[] list1) {
		int pos = 0;
		if (list1[0] > list1[1]) {
			Swap(list1, 0, 1);
		}
			for (int i = 1; i < list1.length; i++) {
				for (int x = i; x >= 0; x--) {
					if (list1[i] > list1[x]) {
						break;
					}
					pos = x;
				}
				for (int x = i; x > pos;x--) {
					Swap(list1,x,x-1);
				}
			
		}
	}
	
	public static void selectionSort(String[] list1) {
		for (int j = 0; j < list1.length;j++) {
			int select = j;
			for (int i = j; i < list1.length; i++) {
				String x = list1[select];
				if (x.compareTo(list1[i]) < 0) {
					x = list1[i];
					select = i;
				}
			}
			Swap(list1, select , j);
		}
		
	}
	
	public static void bubbleSort(int[] list1) {
		for (int j = 0; j < list1.length;j++) {
			for (int i = 0; i < list1.length-1; i++) {
				Swap(list1, i, i+1);
			}	
		}
	}
	public static void bubbleSort2(String[] list1) {
		int swapCount = 1;
		while (swapCount > 0) {
			swapCount = 0;
			for (int i = 0; i < list1.length-1; i++) {
				if ((list1[i].compareTo(list1[i+1]) > 0)) {
					Swap(list1, i, i+1);
					swapCount++;
				}
			}
		}
	}
	
	public static void Swap(int[] arr, int index1, int index2) {
			int x = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = x;
	}
	
	public static void Swap(double[] arr,int index1, int index2) {
		double x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	
	
	public static void Swap(String[] arr,int index1, int index2) {
			String x = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = x;
	}
}

