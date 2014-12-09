//Justin Himmighoefer
//This program uses a saved file to promt the user with a series of
//20 true or false questions and reports a final score on the quiz.

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TFQuiz
{
	public static void main(String[] args)
	{
	int score = 0;
	String answer = "F";
	String tokenRead = "";
	String response = "";
	Scanner inputStream = null;
	Scanner keyboard = new Scanner(System.in);
	
	try
	{
		inputStream = new Scanner(new FileInputStream("Quiz.txt"));
	}//end try
	
	catch(FileNotFoundException e)
	{
		System.out.println("File cound not be opened, program will close");
		System.exit(0);
	}//end catch
	
	while(inputStream.hasNext())
	{
			answer = inputStream.next();
			tokenRead = inputStream.nextLine();
			System.out.println(tokenRead);
			System.out.println(" Please enter T for True or F for False: ");
			response = keyboard.next();
			
			if(response.equals(answer))
			{
				System.out.println("Congratulations, you answered correctly!");
				System.out.println();
				score++;
			}//end if
			
			else
			{
				System.out.println("Sorry, that is an incorrect answer.");
				System.out.println();
			}
				
	}//end while
	
	System.out.println("Your final score for this quiz is " + (score*5));
	
	inputStream.close();
	
	}//end main
}//end class






