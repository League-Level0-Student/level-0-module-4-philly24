import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "once upon of time there was a boy named phillip");
JOptionPane.showMessageDialog(null, "He had to choose to go to college far or near home");
int answer =JOptionPane.showConfirmDialog(null, "should he go to college at home?","yes or no",JOptionPane.YES_NO_OPTION);
System.out.println(answer);
if (answer==0) {
	 JOptionPane.showMessageDialog(null, "he goes to ucsd and majors in cs");
JOptionPane.showMessageDialog(null,"10 years later he founded a billion dollar app");
}
else {
	JOptionPane.showMessageDialog(null, "he goes to standford and majors in human bio");
JOptionPane.showMessageDialog(null, "10 years later he is cheif of sharp hospital");
}
JOptionPane.showMessageDialog(null,"15 years later he has to decide if he should invest his money into ellon");
String answer2 =JOptionPane.showInputDialog("should he invest into ellon?");
if (answer2.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "phillip retires at 31 and buys an island");
}
else if (answer2.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null,"retires at 60 ");
} 


}
}
