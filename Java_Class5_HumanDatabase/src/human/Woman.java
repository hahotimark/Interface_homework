package human;

/**
 * @author Programozz Te Is!
 *
 */
public class Woman extends Human {

	public Woman(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(this.name + " is not hungry.");
	}
}
