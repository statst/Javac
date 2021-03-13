package book;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfProgramming = new Book(10);
		Book effectiveJava = new Book(20);
		Book cleanCode = new Book(5);

		artOfProgramming.read();

		effectiveJava.read();

		cleanCode.read();

		artOfProgramming.setNoOfCopies(100);
		artOfProgramming.increaseNoOfCopies(100);
		artOfProgramming.decreaseNoOfCopies(50);

		System.out.println(artOfProgramming.getNoOfCopies());

		effectiveJava.setNoOfCopies(50);

		cleanCode.setNoOfCopies(10);
	}
}
