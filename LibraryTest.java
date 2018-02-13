import java.util.Scanner;
public final class LibraryTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input information for the first library (Location, total books, staff total, yearly expense");
		Library library1 = new Library(scanner.nextLine(), scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Input information for the second library (Location, total books, staff total, yearly expense");
		Library library2 = new Library(scanner.nextLine(), scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Input information for the third library (Location, total books, staff total, yearly expense");
		Library library3 = new Library(scanner.nextLine(), scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Input information for the fourth library (Location, total books, staff total, yearly expense");
		Library library4 = new Library(scanner.nextLine(), scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Input information for the fifth library (Location, total books, staff total, yearly expense");
		Library library5 = new Library(scanner.nextLine(), scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println(library1.Library_location + " " + library1.Lstaff_total + " " + library1.Ltotal_books + " " + library1.Lyearly_expense);
		
		System.out.println(library2.Library_location + " " + library2.Lstaff_total+ " " + library2.Ltotal_books+ " " + library2.Lyearly_expense);
		
		System.out.println(library3.Library_location + " " + library3.Lstaff_total+ " " + library3.Ltotal_books+ " " + library3.Lyearly_expense);
		
		System.out.println(library4.Library_location + " " + library4.Lstaff_total+ " " + library4.Ltotal_books+ " " + library4.Lyearly_expense);
		
		System.out.println(library5.Library_location + " " + library5.Lstaff_total+ " " + library5.Ltotal_books+ " " + library5.Lyearly_expense);

				

	}

}
