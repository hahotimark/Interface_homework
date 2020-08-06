/**
 * 
 */
package programming;

import houseMachines.Fridge;
import houseMachines.Microwave;

/**
 * @author Programozz Te Is!
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Database myDB = new Database();

		
		Microwave myMicro = new Microwave(220);
		Fridge myFridge = new Fridge(150);
		
		myDB.addHouseMachine(myMicro);
		myDB.addHouseMachine(myFridge);

		System.out.println(myDB.getSumOfPower());

	}
}
