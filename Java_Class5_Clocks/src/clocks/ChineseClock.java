/**
 * 
 */
package clocks;

/**
 * @author Programozz Te Is!
 *
 */
public class ChineseClock implements IClockAPI {

	@Override
	public String getTime() {
		return "Time from Chinese Clock: 13:11";
	}

	@Override
	public void wakeUp() {
		System.out.println("Good Night Sir!");
	}

	@Override
	public boolean switchOnOff() {
		return false;
	}

}