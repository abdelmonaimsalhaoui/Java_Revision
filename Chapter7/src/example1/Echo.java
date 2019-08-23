package example1;

public class Echo {

	public static void main(String[] args) {

		if (args.length == 0) { // no arguments passed � display an error to the user
			//System.out.println("Error: No input passed to echo command... ");
			//System.exit(-1);
			throw new IllegalArgumentException("No input passed to echo command");
		} else {
			for (String str : args) { // command-line arguments are separated and passed as an array // print them by
										// adding a space between the array elements
				System.out.print(str + " ");
			}
		}
	}

}
