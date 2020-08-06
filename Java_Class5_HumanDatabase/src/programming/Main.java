/**
 * 
 */
package programming;

import human.Boy;
import human.Girl;
import human.Man;
import human.Woman;

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
		
		
		Man man = new Man("Sandor Man");
		Woman woman = new Woman("Kata Woman");

		Boy boy = new Boy("Laszlo Boy");
		Girl girl = new Girl("Sara Girl");
		
		man.eat();
		man.sleep();
		
		woman.eat();
		
		boy.eat();
		boy.play();
		boy.sleep();
		
		girl.eat();
		girl.play();
		
		
		myDB.addHuman(man);
		myDB.addHuman(woman);
		myDB.addHuman(boy);
		myDB.addHuman(girl);
	}

}
