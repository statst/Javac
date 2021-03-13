package book;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int noOfCopies) {
		setNoOfCopies(this.noOfCopies + noOfCopies);
	}

	public void decreaseNoOfCopies(int noOfCopies) {
		setNoOfCopies(this.noOfCopies - noOfCopies);
	}

	public void read() {
		System.out.println("read book");
	}
}
