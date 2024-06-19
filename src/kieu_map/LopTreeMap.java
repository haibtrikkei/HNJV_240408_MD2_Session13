package kieu_map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LopTreeMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> ds = new TreeMap<>();
        ds.put(10,"Nam");
        ds.put(3,"Duc");
        ds.put(7,"Cuong");
        ds.put(2,"Binh");
        ds.put(9,"An");

        for(Map.Entry<Integer,String> obj : ds.entrySet()){
            System.out.println(obj.getKey() + ": "+obj.getValue());
        }
    }
}
