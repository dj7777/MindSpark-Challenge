import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int guestId = sc.nextInt();
		int temp = guestId;
 
		int activitiesCount = sc.nextInt();
		int []scores = new int[1000];
		int i=0;
		while(sc.hasNext()){
			scores[i] = sc.nextInt();
				i++;	
		}
 
		// checking guest category
		double sum =0;
 
		double length = String.valueOf(guestId).length();
		while(guestId>0){
			double val = guestId % 10;
			sum = sum+java.lang.Math.pow(val,length);
			guestId = guestId / 10;
			length--;
		}
		int finalScore;
		if(sum != temp){
 
			//Slytherin
			finalScore = 0;
			for(int j=0;j<scores.length;j++){
				finalScore += scores[j];
			}
 
		}
		else{
			// Gryffinder		
			finalScore = 1;
			int count=0;
				for(int j=0;j<activitiesCount;j++){
					if(scores[j]!=0){			
						finalScore = finalScore* scores[j];
						count++;
					}
			}
			finalScore = finalScore/count;
		}
 
 
		System.out.println(finalScore);
 
	}
}