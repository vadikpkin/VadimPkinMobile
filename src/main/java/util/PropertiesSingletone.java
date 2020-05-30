package util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesSingletone {
    private static Properties properties;

    private PropertiesSingletone() {
    }

    public static String getPropertyByName(String property) {
        if (properties == null) {
            readProps();
        }
        return properties.getProperty(property);
    }

    private static void readProps() {
        properties = new Properties();
        String propFileName = "test.properties";
        try {
            properties.load(PropertiesSingletone.class.getClassLoader().getResourceAsStream(propFileName));
        } catch (IOException e) {
            throw new RuntimeException("Properties reading failed");
        }
    }
}
