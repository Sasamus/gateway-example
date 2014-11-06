package ae.gateway_example;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * @author Albin Engström
 * @since  2014-11-06
 */
public class Gateway {

	/**
	 * Constructor
	 */
	public Gateway() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Reads from file
	 * 
	 * @param filename The name of the file to read from
	 * @return A String read from file
	 */
	public String Read(String filename){
		
		String line = null;
		try {
			line = new Scanner(new File(filename)).useDelimiter("\\Z").next();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return line;
	}

}
