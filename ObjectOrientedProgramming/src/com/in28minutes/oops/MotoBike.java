package com.in28minutes.oops;

public class MotoBike {
	// state
	private int speed;

	// constructor
	MotoBike(int speed) {
		this.speed = speed;
	}
	// behavior
	// method
	// inputs - int speed
	// outputs - void
	// name - setSpeed

	// getter method to get speed
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) { // local variable
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);

	}

	public void start() {
		System.out.println("Bike Started");
	}
}
