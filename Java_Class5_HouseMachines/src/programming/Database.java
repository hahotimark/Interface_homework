package programming;

import java.util.ArrayList;

import houseMachines.Machine;
import houseMachines.IDatabase;


public class Database {
	private ArrayList<Machine> houseMachines;
	
	public Database() {
		this.houseMachines = new ArrayList<Machine>();
	}
	
	public void addHouseMachine(Machine newMachine) {
		this.houseMachines.add(newMachine);
	}
	
	
	public int getSumOfPower() {
		int fullPower = 0;

		for (int i = 0; i < this.houseMachines.size(); i++) {
			fullPower += this.houseMachines.get(i).getPower();
		}

		return (fullPower);
	}

	public void removeHouseMachine() {

		houseMachines.clear();

	}

}
