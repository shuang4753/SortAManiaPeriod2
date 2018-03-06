import java.util.Random;
import java.util.Arrays;
public class Team1Runner {

	public static void main(String[] args) {
		Team1SortCompetition sortcompetitioninstance=new Team1SortCompetition();
	
		System.out.print(sortcompetitioninstance.challengeTwo(stringGenerator(5), queryGenerator()));
		
		

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
	 Random character=new Random();
	 for(int x=0;x<count;x++)
	 {  String[]chars=new String[5];
		 for(int y=0;y<5;y++)
	        {int asciichar=character.nextInt(127);
	         String rand1=new Character((char)asciichar).toString();
	         
	          if((rand1!=null)&&(chars[y]!=null))
	          {chars[y].equals(rand1);}
	        }	
		 if((chars[0]!=null)&&(chars[1]!=null)&&(chars[2]!=null)&&(chars[3]!=null)&&(chars[4]!=null))
		 stringList[x].equals(chars[0]+chars[1]+chars[2]+chars[3]+chars[4]);
	      
	 }
	  System.out.println(Arrays.toString(stringList));
	  return stringList;	
	}
	
	public static String queryGenerator()
	{String[]queryarr=new String[5];
	 Random achar=new Random();
	 for(int x=0;x<4;x++)
	  {int chara=achar.nextInt(127);
	   String chara1=new Character((char)chara).toString();
	   if((queryarr[x]!=null)&&(chara1!=null))
	   queryarr[x].equals(chara1);
	  }
	 String query=new String();
	 query.equals(queryarr[0]+queryarr[1]+queryarr[2]+queryarr[3]+queryarr[4]);
	  System.out.println(query);
	  return query; 
		 
	  } 
	
		
	}
	


