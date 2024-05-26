package utility;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFileManager {
    private Properties properties;
    private InputStreamReader reader;
    public String getValue(String key) throws IOException {
        properties.load(getFileStream());
        return properties.getProperty(key);
    }
    public InputStreamReader getFileStream() throws FileNotFoundException {
        reader=new InputStreamReader(new FileInputStream(new File(IFileManager.PROP_PATH)));
        return reader;
    }
}
