package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String hap = JOptionPane.showInputDialog("Are you Happy?");

		if (hap.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		} else {
			  JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if (hap.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		}
		if (hap.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		}

	}
}
