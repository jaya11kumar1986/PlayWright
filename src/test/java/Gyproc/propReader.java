package Gyproc;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propReader {
	
	static Properties properties;
	public static void readProp() throws IOException {
		
		File file=new File("GyprocMyProject.properties");
		
		 properties=new Properties();
		 
		 FileReader obj=new FileReader(file);
		
		properties.load(obj);
		
	
		
	}
	
	public static String getData(String Data) throws IOException {
		readProp();
		String data=properties.getProperty(Data);
		return data;
	}


}
