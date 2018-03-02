import java.util.Random;
public class Team1Runner {

	public static void main(String[] args) {
		Team1SortCompetition sortcompetitioninstance=new Team1SortCompetition();
		System.out.print (sortcompetitioninstance.challengeOne(randomInt(10000)));
		System.out.print(sortcompetitioninstance.challengeTwo(stringGenerator(5), String query));
		
		

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
	public static String[] queryGenerator()
	{String query=new String(5);
	
		
	}
	

}
