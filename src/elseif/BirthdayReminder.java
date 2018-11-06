
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Question = JOptionPane.showInputDialog("Which birthday do you want? Mom? Dad? My?");
		// 3. Print out what the user typed
		System.out.println(Question);
		// 4. if user asked for "mom"
		if(Question.equalsIgnoreCase("Mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if(Question.equalsIgnoreCase("Dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		if(Question.equalsIgnoreCase("My")) {
			System.out.println(myBirthday);
		}else {
			System.out.print("Sorry, I don't remember that person's birthday");
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
