//Week3.day1
package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("I am from Desktop class");
	}

	public static void main(String[] args) {

		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize();
	}

}