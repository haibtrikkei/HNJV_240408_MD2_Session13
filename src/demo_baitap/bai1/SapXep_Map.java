package demo_baitap.bai1;

import java.util.*;

public class SapXep_Map {
    public static void main(String[] args) {
        Map<Integer,String> ds = new HashMap<>();
        ds.put(10, "Cuong");
        ds.put(1, "Nam");
        ds.put(7, "Duc");
        ds.put(2, "Lan");
        ds.put(3,"Tien");
        ds.put(4, "Ngoc");
        ds.put(5,"Binh");

        Collection<String> values = ds.values();
        List<String> list = new ArrayList<>(values);
        Collections.sort(list);
        System.out.println("Danh sach sap xep value theo thu tu tang dan: ");
        for(String name : list){
            System.out.println(name);
        }

    }
}
