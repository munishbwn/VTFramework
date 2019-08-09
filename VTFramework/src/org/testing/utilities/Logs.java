package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	
	public static void takeLogs(String classname, String message){
		DOMConfigurator.configure("C:\\Users\\munish\\workspace\\VTFramework\\layout.xml");
		Logger l =Logger.getLogger(classname);
		l.info(message);
	}

}
