package human;

/**
 * @author Programozz Te Is!
 *
 */
public abstract class Human {

	public String name;
	
	protected Human(String name) {
		this.name = name;
	}
	
	public abstract void eat();
}
