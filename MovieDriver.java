/*
 * Class: CMSC203 
	 Program: Lab 1
	 Instructor: Khandan Monshi
	 Summary of Description: 
	 	1.To know how to use a class
	 	2.create objects
	 	3.and to call methods from a different class. 
	 Due Date: 02/14/2023
	 Platform/compiler: Java, Eclipse IDE
	 Integrity Pledge: I pledge that I have completed the programming assignment independently.
	 I have not copied the code from a student or any source.
     Print your Name here: NIKITTA JOAN VARGHESE

 */
import java.util.Scanner;
public class MovieDriver 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		char ch='y';
		while(ch=='y')
		{
			Movie ob1 =new Movie();
			
			System.out.println("Enter the name of the movie : ");
			String title=keyboard.nextLine();
			ob1.setTitle(title);//setting title and passing it to Movie.class
			
			System.out.println("Enter the rating of the movie : ");
			String rating=keyboard.next();
			ob1.setRating(rating);//setting rating and passing it to Movie.class
			
			System.out.println("Enter the number of tickets sold for this movie : ");
			int n=keyboard.nextInt();
			ob1.setSoldTickets(n);//setting no of tickets and passing it to Movie.class
			System.out.println(ob1.toString());
			
			System.out.println("Do you want to enter another ?(y or n)");
			ch=keyboard.next().charAt(0);
			keyboard.nextLine();//for enterning new line
		}	
		System.out.println("GOODBYE ");	
	}
}
	
