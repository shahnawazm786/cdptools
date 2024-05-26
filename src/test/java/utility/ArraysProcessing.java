package utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysProcessing {
    static List<String> chromeOptions;

    public static List<String> getChromeOptions() throws IOException {
    String options=ReadPropertiesFileManager.getValue("system.chrome.options.value");
    chromeOptions=new ArrayList<>();
    chromeOptions= Arrays.asList(options.split(";"));
    return chromeOptions;
    }
}
