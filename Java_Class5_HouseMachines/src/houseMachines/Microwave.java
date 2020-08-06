/**
 * 
 */
package houseMachines;

/**
 * @author Programozz Te Is!
 *
 */
public class Microwave extends Machine {

	public Microwave(int power) {
		super(power);
	}

	@Override
	public int getPower() {
		
		int currentPower = 0;
		
		if(this.switchedOn)
		{
			currentPower = this.power;
		}
		
		return (currentPower);
	}

    @Override
    public String printMachineName() {
        return null;
    }


    public String printMachineNames(){

		return "Nem volt név!";
	}

}
