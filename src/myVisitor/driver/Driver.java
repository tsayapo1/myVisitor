package myVisitor.driver;

/**
 * @author Shreevara Andila
 *
 */
 
public class Driver {
	
	public static void main(String[] args) {

			    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
	}
}
