package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	private static final String String = null;

	// 0. Make make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
	// 1. Set a password in a String variable
	String mat= "cats eat rats that are black that act like rats that eat cats that are white and black which eat mats that hate cats that eat mats that eat rats that eat that, that lack the quality of a rag that sags which lacks the quality of being red or blue tat lacks the lack of haveing lack to lack ,lack of that is that.";
	String late=
    String rat = "1234";
	// a pop-up, ask the first person for a secret message and store it in a variable
JOptionPane.showInputDialog(null, "Write a Secret Message");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
JOptionPane. showInputDialog(null,"You can only see the secret message if you guess the passcode corretly");
	// 4. If their guess matches the password, show them the secret message
if (late.equals(rat)  ) {
	JOptionPane.showMessageDialog(null,"cat")  ;
}
else {
	JOptionPane.showMessageDialog(null,"INTRUDER!!!!!!!!!!");
}
}


// 5. If the password does not match, pop-up "INTRUDER!!"
	}
}
