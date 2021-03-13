package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotoBike ducati = new MotoBike(100);
		MotoBike honda = new MotoBike(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.start();

		honda.start();

		// change of state
		ducati.setSpeed(100);

		int ducatiSpeed = ducati.getSpeed();// get ducati speed
		ducatiSpeed += 100;// increase by 100

		ducati.setSpeed(ducatiSpeed);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);
		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);

		ducati.setSpeed(20);
		honda.setSpeed(10);
	}
}
