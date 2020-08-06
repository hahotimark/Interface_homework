package programming;

import java.util.ArrayList;

import clocks.IClockAPI;


public class Database {

	private ArrayList<IClockAPI> myClocks;
	
	public Database() {
		this.myClocks = new ArrayList<IClockAPI>();
	}
	
	public void addClock(IClockAPI newClock) {
		this.myClocks.add(newClock);
	}
	
	public void listTime() {
		
		for (int i = 0; i < (this.myClocks).size(); i++) {
			System.out.println("The Time is: " + ((this.myClocks).get(i)).getTime());
		}
		
	}
	
	public void wakeUp() {
		for (int i = 0; i < this.myClocks.size(); i++) {
			this.myClocks.get(i).wakeUp();
		}
	}
}
