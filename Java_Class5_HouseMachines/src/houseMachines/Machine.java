/**
 * 
 */
package houseMachines;

/**
 * @author Programozz Te Is
 *
 */
public abstract class Machine {

	protected int power;
	protected boolean switchedOn;
	
	public Machine(int power) {
		this.power = power;
		this.switchedOn = false;
	}
	
	public void switchOnOff(boolean switchOn)
	{
		this.switchedOn = switchOn;
	}
	
	public abstract int getPower();

	public abstract String printMachineName();
}