import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class binarySearch
{
	public static void main(String[] args)
	{
		
		
		System.out.println("What number are you looking for? ");
		
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt(); 
		
		int[] bigList=  new int[10]; 
		
		randomizer(bigList); 
		 Arrays.sort(bigList);
		for(int i = 0; i<bigList.length; i++) {
			if(i!=0) {
				if(i%10==0) {
					System.out.println(bigList[i]);
				}else {
					System.out.print(bigList[i]+"|");
				}
			}
		}
		System.out.println();
		searcher(num, bigList); 
		
	}
	
	public static void randomizer(int[] arr)
	{
		Random rand = new Random(); 
		for(int i = 0;  i<arr.length; i++)
		{
			arr[i] = rand.nextInt(10); 
		}
	}
	
	public static void searcher(int target, int[] arr )
	{
		int start = 0; 
		int end = arr.length-1; 
		int middle = (start + end )/2; 
		int tries = 0; 
		boolean found = false;
		 System.out.println("Start middle:"+middle+"start:"+start+"end:"+end);
		while(!found) 
		{
			
			if(arr[middle] < target)
			{
				start = middle; 
				middle= (start + end)/2 ; 
				tries++; 
				System.out.println(" If middle is less than tar: start:"+start+" end:"+end+" middle:"+middle);
			}
			else if(arr[middle] > target)
			{
				end = middle; 
				middle= (start + end)/2; 
				tries++; 
				System.out.println(" If middle is greater than  tar: start:"+start+" end:"+end+" middle:"+middle);
			}
			else if(arr[middle] == target)
			{
				found = true; 
				System.out.println(" If middle equals tar: start:"+start+" end:"+end+" middle:"+middle);
			}
			 if(start==middle) 
			{
				System.out.println("the target was not in the list");
				System.out.println(found);
				break; 
				
			}
		}
		if(found)
		{
			System.out.println("It took "+ (tries+1)+" tries but it was found at the "+middle+" index");
			
			System.out.println("The target was "+arr[middle]);
		}
	}
}
