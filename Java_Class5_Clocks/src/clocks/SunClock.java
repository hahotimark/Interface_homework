/**
 * 
 */
package clocks;

/**
 * @author Programozz Te Is!
 *
 */
public class SunClock implements IClockAPI {

	@Override
	public String getTime() {
		return ("Time from Sun Clock: Around 12 o'clock");
	}

	@Override
	public void wakeUp() {
		System.out.println("No WakeUp functionality on SunClock");
	}

	@Override
	public boolean switchOnOff() {
		return false;
	}

}
