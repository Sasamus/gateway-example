package ae.gateway_example;

/**
 * A class that uses a gateway to access data from an external file
 * 
 * @author Albin Engström
 * @since  2014-11-06
 */
public class GatewayUser {
	
	/**
	 * Constructor
	 */
	public GatewayUser() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Prints data
	 * 
	 * @param filename Holds the path to the file to print data from
	 */
	public void printData(String filename) {
		Gateway gateway = new Gateway();
		
		System.out.println(gateway.Read(filename));
		
	}

}
