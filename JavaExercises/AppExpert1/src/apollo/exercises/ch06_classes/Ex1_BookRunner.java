package apollo.exercises.ch06_classes;

public class Ex1_BookRunner {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		User user1 = new User("Ai", "London", 20);
		Book book1 = new Book("A",1,user1,"asd2");
		user1.readBook(book1);
//		book1.setTitle("A");
//		book1.setAuthor("Ja");
//		book1.setIsbn("asda123");
//		book1.setNumPages(1);

		User user2 = new User("Kroaster", "Phil", 23);
		Book book2 = new Book("B",23, user2, "mk4");
//		book2.setTitle("B");
//		book2.setAuthor("TA");
//		book2.setIsbn("btg3");
//		book2.setNumPages(10);
		user2.readBook(book2);




		System.out.println(
				book1
		);

		System.out.println(book2);


	}

}
