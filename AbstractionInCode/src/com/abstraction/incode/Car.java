package com.abstraction.incode;

public abstract class Car {
	abstract void run();
}
class Tesla extends Car {
	void run() {
		System.out.println("Tesla is running safely");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Tesla();
		obj.run();
		System.out.println("Its Working");
			}

}

