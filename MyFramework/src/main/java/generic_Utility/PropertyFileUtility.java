package generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./login.properties.txt");
		Properties pf = new Properties();
		pf.load(fis);
		String value = pf.getProperty(key);
		return value;

	}
}
