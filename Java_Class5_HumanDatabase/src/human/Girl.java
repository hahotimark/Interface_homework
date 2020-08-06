/**
 * 
 */
package human;

/**
 * @author Programozz Te Is!
 *
 */
public class Girl extends Woman implements IKid {

	public Girl(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(this.name + " is playing");
	}
	
}
