package eu.freakydirac.application;

import eu.freakydirac.ConverterServiceProvider.ConverterService;


public class App {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println(System.getProperty("java.class.path"));
        ConverterService dictionary = ConverterService.getInstance();
        System.out.println(App.lookup(dictionary, "first"));
        System.out.println(App.lookup(dictionary, "second"));
        System.out.println(App.lookup(dictionary, "third"));
        System.out.println(App.lookup(dictionary, "fourth"));
    }

    public static String lookup(ConverterService dictionary, String key) {
        String outputString = key + ": ";
        String definition = dictionary.convert(key);
        return (definition == null)?outputString + "There is no value for this key": outputString + definition;
    }
}
