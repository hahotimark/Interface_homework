/**
 * 
 */
package programming;

import java.util.ArrayList;

import human.Human;

/**
 * @author Bajor
 *
 */
public class Database {

	private ArrayList<Human> humans;
	
	public Database() {
		this.humans = new ArrayList<Human>();
	}
	
	public void addHuman(Human newHuman) {
		this.humans.add(newHuman);
	}
}
