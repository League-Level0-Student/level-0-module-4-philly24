//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;

        /* You MUST use the above boolean variables in your code */
        
        /*
         Ask the user for these values using a confirm dialog like the one below
          */
        int answer=JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);

if (answer==1) {
	System.out.println("sleep in");
}
        //JOptionPane.showConfirmDialog(null, "is it a weekend?", JOptionPane.YES_NO_OPTION );
else {
System.out.println("get up lazy bones");
}
}

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }

