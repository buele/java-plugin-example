package eu.freakydirac.ExtendedConverter;

import eu.freakydirac.ConverterServiceProvider.ConverterService;
import eu.freakydirac.ConverterServiceProvider.spi.Converter;
import java.util.SortedMap;
import java.util.TreeMap;


public class ExtendedConverter implements Converter
{
    private SortedMap<String, String> map;

    public ExtendedConverter() {
        map = new TreeMap<String, String>();
        map.put(
                "third",
                "this is the third value");
        map.put(
                "fourth",
                "this is the fourth value");
    }

    @Override
    public String convert(String key) {
        return map.get(key);
    }
}
