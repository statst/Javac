package book;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfProgramming.read();

		effectiveJava.read();

		cleanCode.read();

		artOfProgramming.noOfCopies = 100;

		effectiveJava.noOfCopies = 50;

		cleanCode.noOfCopies = 10;
	}
}
