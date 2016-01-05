package eu.freakdirac.GeneralConverter;

import eu.freakydirac.ConverterServiceProvider.spi.Converter;
import java.util.SortedMap;
import java.util.TreeMap;


public class GeneralConverter implements Converter
{
    private SortedMap<String, String> map;

    public GeneralConverter() {
        map = new TreeMap<String, String>();
        map.put(
                "first",
                "this is the first value");
        map.put(
                "second",
                "this is the second value");
    }


    public String convert(String key) {
        return map.get(key);
    }
}
