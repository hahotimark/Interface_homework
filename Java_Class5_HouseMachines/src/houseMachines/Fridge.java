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
		return (this.power);
	}

    @Override
    public String printMachineName() {
        return null;
    }

    public String printMachineNames(){

		return "Nem volt név!";
	}

	
}
