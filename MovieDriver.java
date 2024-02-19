import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		/*Create a new object of type Scanner that reads from the keyboard
Create a new movie object
Prompt the user to enter the title of a movie 
Read in the line that the user types
Set the title in the movie object
Prompt the user to enter the movie’s rating
Read in the line that the user types
Set the rating in the movie object
Prompt the user to enter the number of tickets sold at a (unnamed) theater
Read in the integer that the user types
Set the number of tickets sold in the movie object
Print out the information using the movie’s toString method
*/
		Scanner keyboard = new Scanner(System.in);
		String movieName, movieRating, userChoice = "none";
		int ticketsSold;
		Movie myMovie;
		
		do {
			System.out.println("Enter the name of a movie.");
			movieName = keyboard.nextLine();
			System.out.println("Enter the rating of the movie.");
			movieRating = keyboard.nextLine();
			System.out.println("Enter the number of tickets sold for this movie");
			ticketsSold = keyboard.nextInt();
			myMovie = new Movie(movieName, movieRating, ticketsSold);
			myMovie.setTitle(movieName);
			myMovie.setRating(movieRating);
			myMovie.setSoldTickets(ticketsSold);
			System.out.println(myMovie.toString());
			System.out.println("Do you want to enter another?(y or n)");
			keyboard.nextLine();
			userChoice = keyboard.nextLine();
			while (!(userChoice.equalsIgnoreCase("y")) && !(userChoice.equalsIgnoreCase("n"))) {
				System.out.println("Enter only y or n.");
				userChoice = keyboard.nextLine();
			}
			
		}while(userChoice.equalsIgnoreCase("Y"));
		System.out.println("Goodbye");
		keyboard.close();
	

	}

}
