package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties properties;
    String configPath= "./src/test/resources/application.properties";

    public ConfigReader() throws IOException {
        properties= new Properties();
        properties.load(new FileReader(configPath));
    }

    public String getUrl(){
        return properties.getProperty("url");
    }
}
