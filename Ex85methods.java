package bookExercises;

import javax.swing.JOptionPane;

public class Ex85methods {

	public int sum(int a, int b) {

		int sum = 0;

		JOptionPane.showMessageDialog(null, "Initial Number: " + a + "\nFinal Number: " + b);

		if (a > b) {

			JOptionPane.showMessageDialog(null, "Final Number must be greater than initial number!");
		}

		else {

			for (int i = a; i <= b; i++) {

				sum += i;

			}

		}
		return sum;

	}

}
