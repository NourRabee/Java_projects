import java.util.Scanner;
public class GameChallenge{
	public static void main(String[]args)
	{
	int targetNumber=(int)(Math.random()*101);
	int numberOfAttempts=1;
	Scanner input = new Scanner(System.in);
	boolean firstRound = true;
    int previousNumber=0;
   while(true)
	{
	   if(numberOfAttempts==1)// check if it's the first attempt
	   {
	   System.out.println("please enter a random number between 0 and 100:  ");//receive next number
	    int newNum =input.nextInt();
	   if(newNum>100 || newNum<1)// check if the input is not in 1-100 (range)
		     System.out.println("OUT OF BOUNDS!");
	   else if(newNum==targetNumber)
		    {System.out.println("Wow, you have found the treasure ,Congrats!");
	       break;}
	   else if(Math.abs((targetNumber-newNum))<=10)
             System.out.println("Close!");
	   else 
	        System.out.println("Faraway!");
	previousNumber=newNum;	//save new number to previous number.
	firstRound=false;
      }   
	   numberOfAttempts++;
	  for(numberOfAttempts=2;numberOfAttempts<=100;numberOfAttempts++)
	  {  System.out.println("please enter a random number between 0 and 100:  ");
		     int newNum=input.nextInt();
		   if(newNum>100 || newNum<1)
			   System.out.println("OUT OF BOUNDS!");
		   else if(newNum==targetNumber)
			  {System.out.println("Wow, you have found the treasure in you first attempt!");
		       break;}
		   else if(Math.abs(targetNumber-previousNumber)>Math.abs(targetNumber-newNum))
			   System.out.println("Closer!");
		   else
			   System.out.println("Farther!");
		   previousNumber=newNum;
	   }
   
	  System.out.println("Number of Attempts are:"+numberOfAttempts);


}
	}
}
