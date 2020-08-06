/**
 * 
 */
package human;

/**
 * @author Programozz Te Is!
 *
 */
public class Man extends Human {

	public Man(String name) {
		super(name);
	}

	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}

	@Override
	public void eat() {
		System.out.println(this.name + " is eating");
	}
}
