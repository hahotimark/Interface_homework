/**
 * 
 */
package programming;

import clocks.ChineseClock;
import clocks.SunClock;
import clocks.WallClock;

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

		// IClocAPI test = new IClockAPI();
		
		ChineseClock chineseClock = new ChineseClock();
		SunClock sunClock = new SunClock();
		WallClock wallClock = new WallClock();
		
		myDB.addClock(chineseClock);
		myDB.addClock(sunClock);
		myDB.addClock(wallClock);
		
		myDB.listTime();
		myDB.wakeUp();
	}
}
