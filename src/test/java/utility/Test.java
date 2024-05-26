package utility;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(ReadPropertiesFileManager.getValue("system.chrome.options.value"));
        new ApplicationDriverManager().getDriver(EBrowser.CHROME);
    }
}
