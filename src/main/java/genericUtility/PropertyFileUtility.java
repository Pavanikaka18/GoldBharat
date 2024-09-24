package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(ConstantsUtility.propertyfilepath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
}
