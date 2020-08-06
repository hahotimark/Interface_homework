package human;

/**
 * @author Programozz Te Is!
 *
 */
public class Boy extends Man implements IKid {

	public Boy(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(this.name + " is playing");
	}

	
}
