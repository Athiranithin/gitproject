package property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property1 {
public static void main(String args[])throws IOException
	
	{
		FileReader f=new FileReader("F:\\Users\\HP\\eclipse-workspace\\345\\src\\main\\resources\\data1.properties"); 
		Properties p=new Properties();
		p.load(f);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}
	
	
}
