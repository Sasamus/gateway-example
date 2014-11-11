package ae.gateway_example;

/**
 * main for a example of the gateway design pattern
 * 
 * @author Albin Engström
 * @since  2014-11-06
 *
 */
public class Main {

	/**
	 * the main function
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Gateway gateway = new Gateway();
		
		System.out.println(gateway.Read("bin/TextFiles/DataFile.txt"));
	}

}
