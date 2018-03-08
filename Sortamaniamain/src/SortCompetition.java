
public abstract class SortCompetition implements Comparable <SortCompetition> {
	
	
	
	int number;
	double totalTime = 0.0;
	
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
	
	public abstract int challengeOne(int[] arr);
	
	public abstract int challengeTwo(String[] arr, String query);
	
	public abstract int challengeThree(int[] arr);
	
	public abstract int challengeFour(int[][] arr);
	
	public abstract int challengeFive(Comparable[] arr, Comparable query);
	
	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();

