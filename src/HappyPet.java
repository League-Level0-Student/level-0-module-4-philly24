import java.awt.Desktop.Action;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinesslevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String answer =JOptionPane.showInputDialog("what kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(happinesslevel<4) {


			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			String[] options = {"cuddle" ,"food" , "water","take a walk","groom", "clean up poop" };
			int answer2 = JOptionPane.showOptionDialog(null, "what would you like todo to make your pet happy", 
					"title", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
			System.out.println(answer2);
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.


			// 5. Use user input to call the appropriate method created in step 4.
			cuddleAction(answer2);
			// 6. If you determine the happiness level is large enough, tell the
		}
		JOptionPane.showMessageDialog(null, "you love your pet");
	}
	//    user that he loves his pet and use break; to exit for loop.





// 4. Create methods to handle each of your user selections.
//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
//    and INCREMENT the pet's happiness Level.
public static void cuddleAction(int action) {
	if (action==0) {
		JOptionPane.showMessageDialog(null, "purr");
		happinesslevel++;
	}
	else if (action==1) {
		JOptionPane.showMessageDialog(null, "yumm");
		happinesslevel++;
	}
	else if (action==2) {
		JOptionPane.showMessageDialog(null, "gulp");
		happinesslevel++;
	} 

	else if (action==3) {
		JOptionPane.showMessageDialog(null, "yesss");
		happinesslevel++;

	}
	else if (action==4) {
		JOptionPane.showMessageDialog(null, "stop touching mee");
		happinesslevel++;
	}	
	else if(action==5) {
		JOptionPane.showMessageDialog(null, "thank you");
		happinesslevel++;
	}
}
}


