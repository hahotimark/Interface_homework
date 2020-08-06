/**
 * 
 */
package clocks;

/**
 * @author Programozz Te Is!
 *
 */
public class WallClock implements IClockAPI {

	@Override
	public String getTime() {
		return ("Time from Wall Clock: 12:00");
	}

	@Override
	public void wakeUp() {
		System.out.println("12:00, Wake Up! DURR DURR DURR");
		
	}

	@Override
	public boolean switchOnOff() {
		return false;
	}

}
