import java.util.Random;
public class Team1Runner {

	public static void main(String[] args) {
		Team1SortCompetition sortcompetitioninstance=new Team1SortCompetition();
		sortcompetitioninstance.challengeOne(randomInt(10000));
		
		

	}
	public static int[] randomInt(int limit)
	{Random a=new Random();
	 int[]randomArr=new int[limit];
	 for(int x=0;x<limit;x++)
	 {randomArr[x]=a.nextInt(limit);
		 
	 }
		return randomArr;
	}
	public static String[] stringGenerator(int count)
	{String[]stringList=new String[count];
	 for(int x=0;x<count;x++)
	 {   int length=stringList[x].length();
		  length=5;}
	
	  return stringList;	
	}
	

}
