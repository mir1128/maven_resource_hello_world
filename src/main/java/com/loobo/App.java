package com.loobo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class App 
{
    public static void main( String[] args ) throws IOException {
        InputStream inputStream = App.class.getResourceAsStream("/application.properties");
        Properties props=new Properties();
        props.load(inputStream);


        String s = props.getProperty("hello.conf");
        System.out.println(s);

        inputStream.close();
    }
}
