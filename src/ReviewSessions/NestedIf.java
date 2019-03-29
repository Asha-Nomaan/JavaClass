package ReviewSessions;

public class NestedIf {

	public static void main(String[] args) {

		boolean summer = true;
		boolean sunny = false;

		if (summer == true) {

			if (sunny == true) {
				System.out.println("We're going to the beach");
			} else {
				System.out.println("We're not going to the beach");
			}

		} 
		else {
			System.out.println("It's not the summer");
		}

	}

}
