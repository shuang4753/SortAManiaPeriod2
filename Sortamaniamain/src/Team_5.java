import java.util.Arrays;
import java.util.Random;

public class Team_5 extends SortCompetition
{
	public static void main(String [] args) 
	{
		
		
	}
	
	@Override
	public int challengeOne(int[] arr) 
	{
		countingSort(arr,10000);
		return (medf(arr));
	}

	@Override
	public int challengeTwo(String[] arr, String query)
	{
		Team_5.quickSort(arr, 0, arr.length);

		for(int i = 0; i < arr.length; i++) 
		{
			if(query.equals(arr[i]))
			{
				return i;
			}
		}
		return -1;
	}

	@Override
	public int challengeThree(int[] arr) 
	{
		countingSort(arr,10000);
		return (medf(arr));
	}

	@Override
	public int challengeFour(int[][] arr) 
	{
		int [] finny = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) 
		{
			countingSort(arr[i],10000);
			finny [i] = medf(arr[i]);
		}
		
		countingSort(finny,10000);
		return medf(finny);
	}

	@Override
	public int challengeFive(Comparable[] arr, Comparable query) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String greeting() 
	{
		//String g = "*silence";
		//return g;
			
		Random r = new Random();
		return randomgreets[r.nextInt(randomgreets.length)];
	}
	
	private String [] randomgreets = {"*waves*", "*awkward silence*", "Good Luck!", "Pink","Oh Hai Mark!","*insert tacky and original greeting here*"};
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Sorting Methods
				//MERGE SORT
				//Case Sensitive Merge Sort (Caps go before lowercase)
				public static int [] mergeSort(int [] list) 
				{
					if(list.length == 1)
					{
					return list;
					}
					else
					{
					int [] l = Arrays.copyOfRange(list,0,list.length/2);
					int [] r = Arrays.copyOfRange(list,list.length/2, list.length);
					return(merge(mergeSort(l),mergeSort(r)));
					}
				}
				
				public static int [] merge(int [] list1, int [] list2) 
				{
					//Precondition : Both lists are sorted
					//Takes two arrays and merges them in ascending order
				
					int [] full = new int [(list1.length) + (list2.length)]; //i made it work but am confused about why its minus 1 and not 2
					
					int j = 0;
					int l = 0;
					int r = 0;
					
					while(l < list1.length && r < list2.length && j < full.length) 
					{
						if (list1[l]>=(list2[r]))
						{
							full[j] = list2[r];
							j++;
							r++;
						}			
						else
						{
							full[j] = list1[l];
							j++;
							l++;
						}
					}
					
					while(j < full.length && l < list1.length) 
					{
						full[j] = list1[l];
						j++;
						l++;
					}
					
					while(j < full.length && r < list2.length) 
					{
						full[j] = list2[r];
						j++;
						r++;
					}
					return full;
				}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//BUBBLE SORT	
				public static void bubble(int [] test) 
				{
					int counter = 5;
					while(counter > 0) 		
					{
						counter = 0;
						for(int j = 0; j < test.length-1; j++) 
						{
							if(test[j] > test[j+1])
							{
								swapperi(test, j, j+1);
								counter++;
							}
						}
					}	
				}	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//SELECTION SORT
				public static void select(int[] test) 
				{
					for(int i = 0; i < test.length-1; i++) 
					{
						double min = test[i];
						int cf = i;
							for(int j = i; j < test.length; j++) 
							{
								if(test[j] < min) 
								{
									min = test[j];
									cf = j;
								}
							}
							if(min < test[i]) 
							{
								swapperi(test, i, cf);
							}
					} 	
				}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//INSERTION SORT
				public static void insert(int [] test) 
				{			
			        for (int i = 1; i < test.length; i++) 
			        {
			            for(int j = i ; j > 0 ; j--)
			            {
			                if(test[j] < test[j-1])
			                {
			                   swapperi(test,j,(j-1));
			                }
			            }
			        }
				}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//QUICKSORT
				//Takes an array of strings and sorts them to be chronological 
				public static void quickSort(String arr[], int low, int high)
				 {
					if (low >= high)
					{
						return;
					}
					else
					{
						int pp = partition(arr, low, high);
						quickSort(arr, low, pp);
						quickSort(arr, pp + 1, high);
					}
				 }
				
				public static int partition(String[] list, int low, int high)
				{
					String pp = list[low];
					int i = low;
					for (int j = low + 1; j < high; j++)
					{
						if (list[j].compareTo(pp)<= 0)
						{
							i++;
							swappers(list, i, j);
						}
					}
					swappers(list, i, low);
					return i;
				}			
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//COUNTING SORT
				public static int [] countingSort(int [] arr, int full)
				{
					
					int [] hope = new int [full + 1];
					for(int i = 0; i <= full; i++)
					{
						hope [i] = 0;
					}
					
					for(int i = 0; i < arr.length; i++) 
					{
						hope[arr[i]]++;
					}
					
					int x = 0;
					for(int i = 0; i <= full; i++) 
					{
						for(int j = 0; j < hope[i]; j++)
						{
							arr[x++] = i;
						}	
					}					
					return arr;
				}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Helpers
				//Swaps two items in an array of integers
				public static void swapperi(int [] arr, int x, int y) 
				{
					int holder = arr[x];
					arr[x] = arr[y];
					arr[y] = holder;	
				}
				
				private static void swappers(String[] a, int i, int j)
				{
				    String temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				}
				
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
		
	
	
}
