package utility;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFileManager {
    private static Properties properties;
    private static FileInputStream reader;
    public static String getValue(String key) throws IOException {
        properties=new Properties();
        properties.load(getFileStream());
        return properties.getProperty(key);
    }
    private static FileInputStream getFileStream() throws FileNotFoundException {
        final String path=System.getProperty("user.dir");
        return new FileInputStream(path +"//"+IFileManager.PROP_PATH);
    }
}
