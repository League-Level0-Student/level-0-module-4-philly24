import javax.swing.JOptionPane;

public class TestScorces {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("What did you get on your test");
	double score = Double.parseDouble(answer);
 
if (score>70) {
	JOptionPane.showMessageDialog(null, "Wow! You must have studied really for that test!");
}
	else if(score<70){
	JOptionPane.showMessageDialog(null, "study harder");
	
	}
	
	


















}
}
