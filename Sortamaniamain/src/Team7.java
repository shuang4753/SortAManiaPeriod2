
public class Team7 extends SortCompetition {

	
	public int compareTo(SortCompetition t)
	{
		return (int)(this.totalTime - t.totalTime); 
	}
	
	public void setNumber(int n)
	{
		number = n;
	}
	public int getNum()
	{
		return number;
	}
	
	public void addTime(double avg)
	{
		totalTime += avg;
	}
	
	public int challengeOne(int[] arr) {
		selectionSort(arr);
		return arr[arr.length/2];
	}
	
	public int challengeTwo(String[] arr, String query) {
		return 0;
	}
	
	public int challengeThree(int[] arr) {
		return 0;
	}
	
	
	public int challengeFour(int[][] arr) {
		return 0;
		
	}
	
	public int challengeFive(Comparable[] arr, Comparable query) {
		return 0;
	}
	
	public static void Swap(int[] arr, int index1, int index2) {
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	//Add a custom greeting so your sorter can introduce itself
	public String greeting() {
		return "pene";
	}
	public static void selectionSort(int[] list1) {
		for (int j = 0; j < list1.length;j++) {
			int select = j;
			for (int i = j; i < list1.length; i++) {
				int x = list1[select];
				if (x > list1[i]) {
					x = list1[i];
					select = i;
				}
			}
			Swap(list1, select , j);
		}
		
	}
}
	 

