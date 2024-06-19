package kieu_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LopHashMap {
    public static void main(String[] args) {
        Map<Integer, String> ds = new HashMap<>();

        ds.put(10, "Cuong");
        ds.put(1, "Nam");
        ds.put(7, "Duc");
        ds.put(2, "Lan");
        ds.put(3,"Tien");
        ds.put(4, "Ngoc");
        ds.put(5,"Binh");

        System.out.println("Cach duyet 1: ");
        for(Map.Entry<Integer, String> obj : ds.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }

        System.out.println("\nCach duyet 2: ");
        final Set<Integer> listKey = ds.keySet();
        for(Integer key : listKey){
            System.out.println(key + " : "+ds.get(key));
        }
        System.out.println("Dung Iterator voi listKey trong cach duyet 2: ");
        final Iterator<Integer> it = listKey.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println(key + " : "+ds.get(key));
        }

        Map<Integer, String> ds2 = new HashMap<>();
        ds2.put(7,"Test 1");
        ds2.put(8,"Test 2");
        Map<Integer, String> listTotale = new HashMap<>();
        listTotale.putAll(ds);
        listTotale.putAll(ds2);

        System.out.println("Du lieu list Total: ");
        for(Map.Entry<Integer, String> obj : listTotale.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }

        listTotale.remove(5);
        listTotale.remove(7);
        System.out.println("Du lieu list Total sau khi remove key 5 va 7: ");
        for(Map.Entry<Integer, String> obj : listTotale.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }

        System.out.println("\nSu dung contains key: "+listTotale.containsKey(5));
        System.out.println("\nSu dung contains key: "+listTotale.containsKey(1));
    }
}
