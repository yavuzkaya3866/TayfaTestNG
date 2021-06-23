package com.tayfa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static{

        String path = "configuration.properties";
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        properties = new Properties();
        try {
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropery(String key){
        return properties.getProperty(key);

    }



}
