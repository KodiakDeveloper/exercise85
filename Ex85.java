package bookExercises;

import javax.swing.JOptionPane;

public class Ex85 {

	public static void main(String[] args) {

		String userAnswer;

		int a, b, sum;

		Ex85methods ex = new Ex85methods();

		do {

			a = Integer.parseInt(JOptionPane.showInputDialog(null, "input initial number:"));

			b = Integer.parseInt(JOptionPane.showInputDialog(null, "input final number:"));

			sum = ex.sum(a, b);

			JOptionPane.showMessageDialog(null, "Sum: " + sum);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
