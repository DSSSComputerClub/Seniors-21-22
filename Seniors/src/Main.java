import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author sana_
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		//Setup keyboard input
		BufferedReader keyboard = new BufferedReader(new InputStreamReader (System.in));
		
		String text, string; //declare string variables
		
		//Read input
		text = keyboard.readLine();
		string = keyboard.readLine();
		
		//for loop that goes through each cyclic shift of string
		for (int i = 0; i < string.length(); i++) {
			String shift = string.substring(i) + string.substring(0, i);
			
			//Compare if the text has a cyclic shift of string
			if (text.contains(shift)) {
				System.out.println("yes"); //output yes
				System.exit(0);
			}
		}
		
		System.out.println("no"); //If the text contained no cyclic shift output no
		

	}

}
