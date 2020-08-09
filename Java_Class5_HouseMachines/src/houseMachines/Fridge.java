/**
 * 
 */
package houseMachines;

/**
 * @author Programozz Te Is!
 *
 */
public class Fridge extends Machine {

	public Fridge(int power) {
		super(power);
	}

	@Override
	public int getPower() {
		return 0;
	}

	@Override
	public String printMachineName() {
		return "Ez egy hűtő";
	}


}
