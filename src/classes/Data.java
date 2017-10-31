package classes;


import com.google.common.collect.Maps;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tareq
 */
public class Data {

    private final Map<String, String> values;

    public Data() {
        values = Maps.newLinkedHashMap();
    }

    public void addValue(String tag, String value) {
        values.put(tag, value);
    }

    public Map<String, String> getValues() {
        return values;
    }
}
