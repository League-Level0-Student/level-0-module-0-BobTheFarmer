package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What do you like BOIII?");
	JOptionPane.showMessageDialog(null,input + " IS AWESOME");
	JOptionPane.showMessageDialog(null,"*Cringes*");
}
}
