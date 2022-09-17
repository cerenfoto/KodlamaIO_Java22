package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For DDöngüsü Bitti");

		// While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("While Döngüsü Bitti");

		// Do-While
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While Döngüsü Bitti");
	}
}
