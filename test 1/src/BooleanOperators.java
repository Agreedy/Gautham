
public class BooleanOperators {

	public static void main(String[] args) {

		int personscore = Integer.parseInt(args[0]);
		int otherpersonscore = Integer.parseInt(args[1]);
		
		boolean logic = ((personscore > 50 ) & (otherpersonscore >= 50));	
	
	String message =  logic ? "he did half century" : "he did not";

	System.out.println(message);
	System.out.println(message);

	}

}
